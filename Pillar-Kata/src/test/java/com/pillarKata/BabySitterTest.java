package com.pillarKata;

import static org.junit.Assert.*;

import org.junit.Test;

import com.pillarKata.Exceptions.IncorrectTimeStampException;
import com.pillarKata.Exceptions.TimeOutOfBoundsException;

public class BabySitterTest {
	
	@Test
	public void correctlySetStartTimeFromValidStringBefore10PM() throws IncorrectTimeStampException, TimeOutOfBoundsException{
		BabySitter babySitter = new BabySitter("5:00PM", "6:00PM");
		assertEquals(babySitter.getStartTime(), 0);
	}
	
	@Test
	public void correctlySetStartTimeFromValidStringAfter10PMAndBeforeMidnight() throws IncorrectTimeStampException, TimeOutOfBoundsException{
		BabySitter babySitter = new BabySitter("10:00PM", "11:00PM");
		assertEquals(babySitter.getStartTime(), 5);
	}
	
	@Test
	public void correctlySetStartTimeFromValidStringOfMidnight() throws IncorrectTimeStampException, TimeOutOfBoundsException{
		BabySitter babySitter = new BabySitter("12:00AM", "1:00AM");
		assertEquals(babySitter.getStartTime(), 7);
	}
	
	@Test
	public void correctlySetStartTimeFromValidStringAfterMidnight() throws IncorrectTimeStampException, TimeOutOfBoundsException{
		BabySitter babySitter = new BabySitter("1:00AM", "3:00AM");
		assertEquals(babySitter.getStartTime(), 8);
	}
	
	@Test public void correctlySetEndTimeFromValidStringBefore10PM() throws IncorrectTimeStampException, TimeOutOfBoundsException{
		BabySitter babySitter = new BabySitter("5:00PM", "7:00PM");
		assertEquals(babySitter.getEndTime(), 2);
	}
	
	@Test public void correctlySetEndTimeFromValidStringAfter10PMAndBeforeMidnight() throws IncorrectTimeStampException, TimeOutOfBoundsException{
		BabySitter babySitter = new BabySitter("10:00PM", "11:00PM");
		assertEquals(babySitter.getEndTime(), 6);
	}
	
	@Test
	public void correctlySetEndTimeFromValidStringOfMidnight() throws IncorrectTimeStampException, TimeOutOfBoundsException{
		BabySitter babySitter = new BabySitter("10:00PM", "12:00AM");
		assertEquals(babySitter.getEndTime(), 7);
	}
	
	@Test
	public void correctlySetEndTimeFromValidStringAfterMidnight() throws IncorrectTimeStampException, TimeOutOfBoundsException{
		BabySitter babySitter = new BabySitter("10:00PM", "3:00AM");
		assertEquals(babySitter.getEndTime(), 10);
	}
	
	@Test
	public void incorrectAMOrPMAtEndOfStartTimeStampThrowsException() throws TimeOutOfBoundsException{
		try{
			BabySitter babySitter = new BabySitter("10:00FM", "3:00AM");
			fail("incorrect AM or PM at end of startTime stamp did not throw IncorrectTimeStampException");
		}catch(IncorrectTimeStampException e){
			assertTrue(true);
		}
	}
	
	@Test
	public void incorrectAMOrPMAtEndOfEndTimeStampThrowsException() throws TimeOutOfBoundsException{
		try{
			BabySitter babySitter = new BabySitter("10:00PM", "3:00FM");
			fail("incorrect AM or PM at end of endTime stamp did not throw IncorrectTimeStampException");
		}catch(IncorrectTimeStampException e){
			assertTrue(true);
		}
	}
	
	@Test
	public void incorrectStartTimeThrowsTimeOutOfBoundsException() throws IncorrectTimeStampException{
		try{
			BabySitter babySitter = new BabySitter("4:00PM", "3:00AM");
			fail("start time before minimum startTime did not throw TimeOutOfBoundsException"); 
		}catch(TimeOutOfBoundsException e){
			assertTrue(true);
		}
	}
	
	@Test
	public void incorrectEndTimeThrowsTimeOutOfBoundsException() throws IncorrectTimeStampException{
		try{
			BabySitter babySitter = new BabySitter("5:00PM", "5:00AM");
			fail("end time after maximum endTime did not throw TimeOutOfBoundsException"); 
		}catch(TimeOutOfBoundsException e){
			assertTrue(true);
		}
	}

}
