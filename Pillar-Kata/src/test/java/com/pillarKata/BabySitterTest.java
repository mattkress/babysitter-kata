package com.pillarKata;

import static org.junit.Assert.*;

import org.junit.Test;

import com.pillarKata.Exceptions.IncorrectTimeStampException;

public class BabySitterTest {
	
	@Test
	public void correctlySetStartTimeFromValidStringBefore10PM() throws IncorrectTimeStampException{
		BabySitter babySitter = new BabySitter("5:00PM", "6:00PM");
		assertEquals(babySitter.getStartTime(), 0);
	}
	
	@Test
	public void correctlySetStartTimeFromValidStringAfter10PMAndBeforeMidnight() throws IncorrectTimeStampException{
		BabySitter babySitter = new BabySitter("10:00PM", "11:00PM");
		assertEquals(babySitter.getStartTime(), 5);
	}
	
	@Test
	public void correctlySetStartTimeFromValidStringOfMidnight() throws IncorrectTimeStampException{
		BabySitter babySitter = new BabySitter("12:00AM", "1:00AM");
		assertEquals(babySitter.getStartTime(), 7);
	}
	
	@Test
	public void correctlySetStartTimeFromValidStringAfterMidnight() throws IncorrectTimeStampException{
		BabySitter babySitter = new BabySitter("1:00AM", "3:00AM");
		assertEquals(babySitter.getStartTime(), 8);
	}
	
	@Test public void correctlySetEndTimeFromValidStringBefore10PM() throws IncorrectTimeStampException{
		BabySitter babySitter = new BabySitter("5:00PM", "7:00PM");
		assertEquals(babySitter.getEndTime(), 2);
	}
	
	@Test public void correctlySetEndTimeFromValidStringAfter10PMAndBeforeMidnight() throws IncorrectTimeStampException{
		BabySitter babySitter = new BabySitter("10:00PM", "11:00PM");
		assertEquals(babySitter.getEndTime(), 6);
	}
	
	@Test
	public void correctlySetEndTimeFromValidStringOfMidnight() throws IncorrectTimeStampException{
		BabySitter babySitter = new BabySitter("10:00PM", "12:00AM");
		assertEquals(babySitter.getEndTime(), 7);
	}
	
	@Test
	public void correctlySetEndTimeFromValidStringAfterMidnight() throws IncorrectTimeStampException{
		BabySitter babySitter = new BabySitter("10:00PM", "3:00AM");
		assertEquals(babySitter.getEndTime(), 10);
	}
	
	@Test
	public void incorrectAMOrPMAtEndOfStartTimeStampThrowsException(){
		try{
			BabySitter babySitter = new BabySitter("10:00FM", "3:00AM");
			fail("incorrect AM or PM at end of startTime stamp did not throw IncorrectTimeStampException");
		}catch(IncorrectTimeStampException e){
			assertTrue(true);
		}
	}
	
	@Test
	public void incorrectAMOrPMAtEndOfEndTimeStampThrowsException(){
		try{
			BabySitter babySitter = new BabySitter("10:00PM", "3:00FM");
			fail("incorrect AM or PM at end of endTime stamp did not throw IncorrectTimeStampException");
		}catch(IncorrectTimeStampException e){
			assertTrue(true);
		}
	}

}
