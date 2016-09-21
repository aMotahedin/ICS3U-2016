package com.bayviewglen.dayseven;

public class ExampleOne {

	public static void main(String[] args) {

		int secondsPerMinute = 60; // declared varibles but these varibles
									// should NEVER change
		int minutesPerHour = 60;
		int hoursPerDay = 24;

		int seccondsPerYear = secondsPerMinute * minutesPerHour * hoursPerDay;

		System.out.println("The numvber of secconds in a year is(wait for it...): " + seccondsPerYear);

		////////////////////////////////////////////////////////////////////////////////////////////
		
		final int SECCONDS_PER_MINUTE = 60; 
											
		final int MINUTES_PER_HOUR = 60;
		final int HOURS_PER_DAY = 24;

		final int SECCONDS_PER_YEAR = secondsPerMinute * minutesPerHour * hoursPerDay;

		System.out.println("The numvber of secconds in a year is(wait for it...): " + SECCONDS_PER_YEAR);

		///////////////////////////////////////////////////////////////////////////////////////////
		double radious = 4.2;
		double area = Math.PI * Math.pow(radious, 2);
		// math.random(); is a random number between 0 and 0.99999 including decimals 
		//(math.random() +1) is 1 to 1.999999
		// (int) 10 * (math.random()+1) is 1 to 10
		//- 10 to 10 is 21 (int) (numbers so 21*math.random()-10)
		
	}
}
