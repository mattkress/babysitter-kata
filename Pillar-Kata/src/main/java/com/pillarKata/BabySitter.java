package com.pillarKata;

public class BabySitter {
	
	private int startTime;
	private int endTime;
	
	public BabySitter(String startTimeString, String endTimeString){
		startTime = convertTimeStringToInt(startTimeString);
		endTime = convertTimeStringToInt(endTimeString);
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
	
	public int convertTimeStringToInt(String startTime){
		int time;
		time = Integer.parseInt(startTime) -5;
		setStartTime(time);
		return time;
	}
	
	

	
}
