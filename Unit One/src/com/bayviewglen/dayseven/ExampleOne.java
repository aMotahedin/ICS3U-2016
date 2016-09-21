package com.bayviewglen.dayseven;

public class ExampleOne {

	public static void main(String[] args) {

		int secondsPerMinute = 60; // declared varibles but these varibles
									// should NEVER change
		int minutesPerHour = 60;
		int hoursPerDay = 24;

		int seccondsPerYear = secondsPerMinute * minutesPerHour * hoursPerDay;

		System.out.println("The numvber of secconds in a year is(wait for it...): " + seccondsPerYear);

		final int SECCONDS_PER_MINUTE = 60; // declared varibles but these
											// varibles should NEVER change
		final int MINUTES_PER_HOUR = 60;
		final int HOURS_PER_DAY = 24;

		final int SECCONDS_PER_YEAR = secondsPerMinute * minutesPerHour * hoursPerDay;

		System.out.println("The numvber of secconds in a year is(wait for it...): " + SECCONDS_PER_YEAR);

	}
}
