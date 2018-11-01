package com.pillarKata;

import com.pillarKata.Exceptions.EndTimeBeforeStartTimeException;
import com.pillarKata.Exceptions.IncorrectTimeStampException;
import com.pillarKata.Exceptions.TimeOutOfBoundsException;

public class BabySitter {
	
	private int minStartTime = 0;
	private int maxEndTime = 11;

	private int startTime;
	private int endTime;

	public BabySitter(String startTimeString, String endTimeString) throws IncorrectTimeStampException, TimeOutOfBoundsException, EndTimeBeforeStartTimeException {
		startTime = convertTimeStringToInt(startTimeString);
		endTime = convertTimeStringToInt(endTimeString);
		if(endTime < startTime){
			throw new EndTimeBeforeStartTimeException("The end time entered is before the start time");
		}
	}

	public int getStartTime() {
		return startTime;
	}

	public void setStartTime(int startTime) {
		this.startTime = startTime;
	}

	public int getEndTime() {
		return endTime;
	}

	public void setEndTime(int endTime) {
		this.endTime = endTime;
	}

	public int convertTimeStringToInt(String timeString) throws IncorrectTimeStampException, TimeOutOfBoundsException{
		int time;
		//checking if last two characters of string are AM or PM
		if(timeString.substring(timeString.length() -2, timeString.length()).equals("PM")){
			//checking if after 10PM for if one or two characters are needed for integer conversion
			if(timeString.startsWith("1")){
				time = Integer.parseInt(timeString.substring(0,2)) -5;
			}else{
				time = Integer.parseInt(timeString.substring(0,1)) -5;
			}
		}else if(timeString.startsWith("12") && timeString.substring(timeString.length() -2, timeString.length()).equals("AM")){		
			time = 7;
		}else if(timeString.substring(timeString.length() -2, timeString.length()).equals("AM")){
			time = Integer.parseInt(timeString.substring(0,1)) + 7;
		}else{
			throw new IncorrectTimeStampException("The time entered is not a valid timestamp");
		};
		//make sure time is within min/max start/end time constraints
		if(time >= minStartTime && time <= maxEndTime){
			return time;
		}else{
			throw new TimeOutOfBoundsException("The time entered is before/after the possible start/end time");
		}
	}

}
