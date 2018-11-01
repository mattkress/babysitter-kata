package com.pillarKata;

import java.util.Scanner;

import com.pillarKata.Exceptions.EndTimeBeforeStartTimeException;
import com.pillarKata.Exceptions.IncorrectTimeStampException;
import com.pillarKata.Exceptions.TimeOutOfBoundsException;

public class PayCalculator {

	public static void main(String[] args) {
		execute();
	}
	
	public static void execute(){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Welcome to the Babysitter Payment Calculator");
		System.out.println("What time did you start babysitting (i.e. 5:00PM) ?");
		String startTime = scanner.nextLine();
		System.out.println("What time did you end babysitting (i.e. 1:00AM) ? ");
		String endTime = scanner.nextLine();
		System.out.println("What family did you babysit for (A,B, or C)? ");
		String typeOfFamily = scanner.nextLine();
		Family family = new Family(typeOfFamily);
		try {
			BabySitter babySitter = new BabySitter(startTime, endTime);
			int money = family.getPaymentFromFamily(family.getTypeOfFamily(), babySitter.getStartTime() , babySitter.getEndTime());
			System.out.println("You will have earned $" + money + " for babysitting this family for this amount of time");
		} catch (Exception e) {
			System.out.println(e.getMessage() + " Please Retry.");
			scanner.close();
		}
		
		
	}

}
