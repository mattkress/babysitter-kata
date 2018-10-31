package com.pillarKata;

import static org.junit.Assert.*;

import org.junit.Test;

public class BabySitterTest {
	
	@Test
	public void correctlySetStartTimeFromValidStringBefore10PM(){
		BabySitter babySitter = new BabySitter("5", "5");
		assertEquals(babySitter.getStartTime(), 0);
	}

}
