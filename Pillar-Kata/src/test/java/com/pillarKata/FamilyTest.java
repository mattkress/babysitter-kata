package com.pillarKata;

import static org.junit.Assert.*;

import org.junit.Test;

public class FamilyTest {

	@Test
	public void getFirstPaymentRateForFamilyA(){
		Family family = new Family("A");
		assertEquals(family.getPaymentFromFamily("A", 0, 2), 30);		
	}
	
	@Test
	public void getSecondPaymentRateForFamilyA(){
		Family family = new Family("A");
		assertEquals(family.getPaymentFromFamily("A", 7, 9), 40);
	}
	
	@Test
	public void getCombinationOfFirstAndSecondPaymentRateForFamilyA(){
		Family family = new Family("A");
		assertEquals(family.getPaymentFromFamily("A", 0, 9), 150);
	}
	
	@Test
	public void getFirstPaymentRateForFamilyB(){
		Family family = new Family("B");
		assertEquals(family.getPaymentFromFamily("B", 1, 3), 24);
	}
	
	@Test
	public void getSecondPaymentRateForFamilyB(){
		Family family = new Family("B");
		assertEquals(family.getPaymentFromFamily("B", 5, 7), 16);
	}
	
	@Test
	public void getThirdPaymentRateForFamilyB(){
		Family family = new Family("B");
		assertEquals(family.getPaymentFromFamily("B", 8, 10), 32);
	}
	
	@Test
	public void getCombinationOfFirstAndSecondPaymentRateForFamilyB(){
		Family family = new Family("B");
		assertEquals(family.getPaymentFromFamily("B", 0, 6), 68);
	}
	
	@Test
	public void getCombinationOfSecondAndThirdPaymentRateForFamilyB(){
		Family family = new Family("B");
		assertEquals(family.getPaymentFromFamily("B", 5, 9), 48);
	}
	
	@Test
	public void getCombinationOfFirstSecondAndThirdPaymentRateForFamilyB(){
		Family family = new Family("B");
		assertEquals(family.getPaymentFromFamily("B", 0, 10), 124);
	}
	
	@Test
	public void getFirstPaymentRateForFamilyC(){
		Family family = new Family("C");
		assertEquals(family.getPaymentFromFamily("C", 1, 3), 42);
	}
}
