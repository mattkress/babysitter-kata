package com.pillarKata;

import static org.junit.Assert.*;

import org.junit.Test;

public class FamilyTest {

	@Test
	public void getFirstPaymentRateForFamilyA(){
		Family family = new Family("A");
		assertEquals(family.getPaymentFromFamily("A", 0, 2), 30);		
	}
}
