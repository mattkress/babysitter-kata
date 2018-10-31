package com.pillarKata;

public class Family {

	private String typeOfFamily;
	
	public Family(String typeOfFamily){
		this.typeOfFamily = typeOfFamily;
	}

	public String getTypeOfFamily() {
		return typeOfFamily;
	}

	public void setTypeOfFamily(String typeOfFamily) {
		this.typeOfFamily = typeOfFamily;
	}
	
	public int getPaymentFromFamily(String typeOfFamily, int startTime, int endTime){
		int moneyEarned = 0;
		int time = startTime;
		if(typeOfFamily.equals("A")){
			while(time < 6 && time < endTime){
				moneyEarned = moneyEarned + 15;
				time++;
			}
		}
		
		return moneyEarned;
	}
	
}
