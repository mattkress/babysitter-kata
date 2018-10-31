package com.pillarKata;

import static org.junit.Assert.*;

import org.junit.Test;

public class BabySitterTest {
	
	@Test
	public void correctlySetStartTimeFromValidStringBefore10PM(){
		BabySitter babySitter = new BabySitter("5:00PM", "6:00PM");
		assertEquals(babySitter.getStartTime(), 0);
	}
	
	@Test
	public void correctlySetStartTimeFromValidStringAfter10PMAndBeforeMidnight(){
		BabySitter babySitter = new BabySitter("10:00PM", "11:00PM");
		assertEquals(babySitter.getStartTime(), 5);
	}

}
