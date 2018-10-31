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
	
	@Test
	public void correctlySetStartTimeFromValidStringOfMidnight(){
		BabySitter babySitter = new BabySitter("12:00AM", "1:00AM");
		assertEquals(babySitter.getStartTime(), 7);
	}
	
	@Test
	public void correctlySetStartTimeFromValidStringAfterMidnight(){
		BabySitter babySitter = new BabySitter("1:00AM", "3:00AM");
		assertEquals(babySitter.getStartTime(), 8);
	}
	
	@Test public void correctlySetEndTimeFromValidStringBefore10PM(){
		BabySitter babySitter = new BabySitter("5:00PM", "7:00PM");
		assertEquals(babySitter.getEndTime(), 2);
	}
	
	@Test public void correctlySetEndTimeFromValidStringAfter10PMAndBeforeMidnight(){
		BabySitter babySitter = new BabySitter("10:00PM", "11:00PM");
		assertEquals(babySitter.getEndTime(), 6);
	}
	
	@Test
	public void correctlySetEndTimeFromValidStringOfMidnight(){
		BabySitter babySitter = new BabySitter("10:00PM", "12:00AM");
		assertEquals(babySitter.getEndTime(), 7);
	}
	
	@Test
	public void correctlySetEndTimeFromValidStringAfterMidnight(){
		BabySitter babySitter = new BabySitter("10:00PM", "3:00AM");
		assertEquals(babySitter.getEndTime(), 10);
	}

}
