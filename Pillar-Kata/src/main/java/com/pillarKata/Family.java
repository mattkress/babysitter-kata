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
			//First rate of payment before 11PM
			while(time < 6 && time < endTime){
				moneyEarned = moneyEarned + 15;
				time++;
			}
			//Second rate of payment after 11PM
			while(time >= 6 && time < endTime){
				moneyEarned = moneyEarned + 20;
				time++;
			}
			
		}else if(typeOfFamily.equals("B")){
			//First rate of payment before 10PM
			while(time < 5 && time < endTime){
				moneyEarned = moneyEarned + 12;
				time++;
			}
		}
		
		return moneyEarned;
	}
	
}
