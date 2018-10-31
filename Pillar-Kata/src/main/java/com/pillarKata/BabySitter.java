package com.pillarKata;

public class BabySitter {

	private int startTime;
	private int endTime;

	public BabySitter(String startTimeString, String endTimeString) {
		startTime = convertTimeStringToInt(startTimeString);
		// endTime = convertTimeStringToInt(endTimeString);
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

	public int convertTimeStringToInt(String timeString){
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
		}
		else{
			time = 100;
		};		
		return time;
	}

}
