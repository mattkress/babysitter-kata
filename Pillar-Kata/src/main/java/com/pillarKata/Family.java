package com.pillarKata;

import com.pillarKata.Exceptions.InvalidFamilyException;

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
	
	public int getPaymentFromFamily(String typeOfFamily, int startTime, int endTime) throws InvalidFamilyException{
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
			//Second rate of payment between 10PM and midnight
			while(time >= 5 && time < 7 && time < endTime){
				moneyEarned = moneyEarned + 8;
				time++;
			}
			//Third rate of payment after midnight
			while(time >= 7 && time < endTime){
				moneyEarned = moneyEarned + 16;
				time++;
			}
		}else if(typeOfFamily.equals("C")){
			//First rate of payment before 9PM
			while(time < 4 && time < endTime){
				moneyEarned = moneyEarned + 21;
				time++;
			}
			//Second rate of payment after 9PM
			while(time >=4 && time < endTime){
				moneyEarned = moneyEarned + 15;
				time++;
			}
		}else{
			throw new InvalidFamilyException(typeOfFamily + "is not a valid family type");
		}
		
		return moneyEarned;
	}
	
}
