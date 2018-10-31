package com.pillarKata;

import static org.junit.Assert.*;

import org.junit.Test;

import com.pillarKata.Exceptions.IncorrectTimeStampException;
import com.pillarKata.Exceptions.InvalidFamilyException;

public class FamilyTest {

	@Test
	public void getFirstPaymentRateForFamilyA() throws InvalidFamilyException{
		Family family = new Family("A");
		assertEquals(family.getPaymentFromFamily("A", 0, 2), 30);		
	}
	
	@Test
	public void getSecondPaymentRateForFamilyA() throws InvalidFamilyException{
		Family family = new Family("A");
		assertEquals(family.getPaymentFromFamily("A", 7, 9), 40);
	}
	
	@Test
	public void getCombinationOfFirstAndSecondPaymentRateForFamilyA() throws InvalidFamilyException{
		Family family = new Family("A");
		assertEquals(family.getPaymentFromFamily("A", 0, 9), 150);
	}
	
	@Test
	public void getFirstPaymentRateForFamilyB() throws InvalidFamilyException{
		Family family = new Family("B");
		assertEquals(family.getPaymentFromFamily("B", 1, 3), 24);
	}
	
	@Test
	public void getSecondPaymentRateForFamilyB() throws InvalidFamilyException{
		Family family = new Family("B");
		assertEquals(family.getPaymentFromFamily("B", 5, 7), 16);
	}
	
	@Test
	public void getThirdPaymentRateForFamilyB() throws InvalidFamilyException{
		Family family = new Family("B");
		assertEquals(family.getPaymentFromFamily("B", 8, 10), 32);
	}
	
	@Test
	public void getCombinationOfFirstAndSecondPaymentRateForFamilyB() throws InvalidFamilyException{
		Family family = new Family("B");
		assertEquals(family.getPaymentFromFamily("B", 0, 6), 68);
	}
	
	@Test
	public void getCombinationOfSecondAndThirdPaymentRateForFamilyB() throws InvalidFamilyException{
		Family family = new Family("B");
		assertEquals(family.getPaymentFromFamily("B", 5, 9), 48);
	}
	
	@Test
	public void getCombinationOfFirstSecondAndThirdPaymentRateForFamilyB() throws InvalidFamilyException{
		Family family = new Family("B");
		assertEquals(family.getPaymentFromFamily("B", 0, 10), 124);
	}
	
	@Test
	public void getFirstPaymentRateForFamilyC() throws InvalidFamilyException{
		Family family = new Family("C");
		assertEquals(family.getPaymentFromFamily("C", 1, 3), 42);
	}
	
	@Test
	public void getSecondPaymentRateForFamilyC() throws InvalidFamilyException{
		Family family = new Family("C");
		assertEquals(family.getPaymentFromFamily("C", 5, 9), 60);
	}
	
	@Test
	public void getCombinationOfFirstAndSecondPaymentRateForFamilyC() throws InvalidFamilyException{
		Family family = new Family("C");
		assertEquals(family.getPaymentFromFamily("C", 0, 9), 159);
	}
	
	@Test
	public void incorrectFamilyTypeThrowsInvalidFamilyException(){
		try{
			Family family = new Family("D");
			family.getPaymentFromFamily(family.getTypeOfFamily(), 0, 8);
			fail("incorrect family type did not throw InvalidFamilyException");
		}catch(InvalidFamilyException e){
			assertTrue(true);
		}
	}
}
