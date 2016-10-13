package com.bayviewglen.assignment;

import java.util.Scanner;

public class CrossCountryAssignmentTwo {
	public static final int SECONDS_PER_MINUTE = 60;

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);

		System.out.println("Please enter your first and last name (first, last):");
		String firstNameOne = keyboard.next();
		String lastNameOne = keyboard.nextLine();

		System.out.println(firstNameOne + ", please enter the time of your first mile (MM:SS.SSS):");
		String runnerOneMileOne = keyboard.nextLine();
		int minutesRunnerOneMileOne = Integer.parseInt(runnerOneMileOne.split(":")[0]);
		double secondsRunnerOneMileOne = Double.parseDouble(runnerOneMileOne.split(":")[1]);
		double runnerOneMileOneInSecconds = minutesRunnerOneMileOne * SECONDS_PER_MINUTE + secondsRunnerOneMileOne;

		System.out.println(firstNameOne + ", please enter your time to the end of mile two (MM:SS.SSS):");
		String runnerOneMileTwo = keyboard.nextLine();
		int minutesRunnerOneMileTwo = Integer.parseInt(runnerOneMileTwo.split(":")[0]);
		double secondsRunnerOneMileTwo = Double.parseDouble(runnerOneMileTwo.split(":")[1]);
		double runnerOneMileTwoInSecconds = minutesRunnerOneMileTwo * SECONDS_PER_MINUTE + secondsRunnerOneMileTwo;

		System.out.println(firstNameOne + ", Please enter your time to the end of the 5km run (MM:SS.SSS):");
		String runnerOneTotalTime = keyboard.nextLine();
		int minutesRunnerOneTotalTime = Integer.parseInt(runnerOneTotalTime.split(":")[0]);
		double secondsRunnerOneTotalTime = Double.parseDouble(runnerOneTotalTime.split(":")[1]);
		double runnerOneTotalTimeInSeconds = minutesRunnerOneTotalTime * SECONDS_PER_MINUTE + secondsRunnerOneTotalTime;

		double runnerOneMileTwoTimeInSecconds = runnerOneMileTwoInSecconds - runnerOneMileOneInSecconds;
		int runnerOneMileTwoMinutes = (int) (runnerOneMileTwoTimeInSecconds / SECONDS_PER_MINUTE);
		double runnerOneMileTwoTotalSecconds = runnerOneMileTwoTimeInSecconds % SECONDS_PER_MINUTE;

		double runnerOneMileThreeTimeInSecconds = runnerOneTotalTimeInSeconds - runnerOneMileTwoTimeInSecconds
				- runnerOneMileOneInSecconds;
		int runnerOneMileThreeMinutes = (int) (runnerOneMileThreeTimeInSecconds / SECONDS_PER_MINUTE);
		double runnerOneMileThreeTotalSecconds = runnerOneMileThreeTimeInSecconds % SECONDS_PER_MINUTE;

		System.out.println(firstNameOne + lastNameOne + "'s summary");
		System.out.println("Mile One Time: " + runnerOneMileOne);
		System.out.printf("Mile Two Time: %d:%06.3f\n", runnerOneMileTwoMinutes, runnerOneMileTwoTotalSecconds);
		System.out.printf("Mile Three Time:  %d:%06.3f\n", runnerOneMileThreeMinutes, runnerOneMileThreeTotalSecconds);
		System.out.println("Total Time: " + runnerOneTotalTime);
		System.out.println("_________________________________________");
		System.out.println(" ");

		////////// runnerTwo//////////////

		System.out.println("Please enter your first and last name (first, last):");
		String firstNameTwo = keyboard.next();
		String lastNameTwo = keyboard.nextLine();

		System.out.println(firstNameTwo + ", please enter the time of your first mile (MM:SS.SSS):");
		String runnerTwoMileOne = keyboard.nextLine();
		int minutesRunnerTwoMileOne = Integer.parseInt(runnerTwoMileOne.split(":")[0]);
		double secondsRunnerTwoMileOne = Double.parseDouble(runnerTwoMileOne.split(":")[1]);
		double runnerTwoMileOneInSecconds = minutesRunnerTwoMileOne * SECONDS_PER_MINUTE + secondsRunnerTwoMileOne;

		System.out.println(firstNameTwo + ", please enter your time to the end of mile two (MM:SS.SSS):");
		String runnerTwoMileTwo = keyboard.nextLine();
		int minutesRunnerTwoMileTwo = Integer.parseInt(runnerTwoMileTwo.split(":")[0]);
		double secondsRunnerTwoMileTwo = Double.parseDouble(runnerTwoMileTwo.split(":")[1]);
		double runnerTwoMileTwoInSecconds = minutesRunnerTwoMileTwo * SECONDS_PER_MINUTE + secondsRunnerTwoMileTwo;

		System.out.println(firstNameTwo + ", Please enter your time to the end of the 5km run (MM:SS.SSS):");
		String runnerTwoTotalTime = keyboard.nextLine();
		int minutesRunnerTwoTotalTime = Integer.parseInt(runnerTwoTotalTime.split(":")[0]);
		double secondsRunnerTwoTotalTime = Double.parseDouble(runnerTwoTotalTime.split(":")[1]);
		double runnerTwoTotalTimeInSeconds = minutesRunnerTwoTotalTime * SECONDS_PER_MINUTE + secondsRunnerTwoTotalTime;

		double runnerTwoMileTwoTimeInSecconds = runnerTwoMileTwoInSecconds - runnerTwoMileOneInSecconds;
		int runnerTwoMileTwoMinutes = (int) (runnerTwoMileTwoTimeInSecconds / SECONDS_PER_MINUTE);
		double runnerTwoMileTwoTotalSecconds = runnerTwoMileTwoTimeInSecconds % SECONDS_PER_MINUTE;

		double runnerTwoMileThreeTimeInSecconds = runnerTwoTotalTimeInSeconds - runnerTwoMileTwoTimeInSecconds
				- runnerTwoMileOneInSecconds;
		int runnerTwoMileThreeMinutes = (int) (runnerTwoMileThreeTimeInSecconds / SECONDS_PER_MINUTE);
		double runnerTwoMileThreeTotalSecconds = runnerTwoMileThreeTimeInSecconds % SECONDS_PER_MINUTE;

		System.out.println(firstNameTwo + lastNameTwo + "'s summary");
		System.out.println("Mile One Time: " + runnerTwoMileOne);
		System.out.printf("Mile Two Time: %d:%06.3f\n", runnerTwoMileTwoMinutes, runnerTwoMileTwoTotalSecconds);
		System.out.printf("Mile Three Time:  %d:%06.3f\n", runnerTwoMileThreeMinutes, runnerTwoMileThreeTotalSecconds);
		System.out.println("Total Time: " + runnerTwoTotalTime);
		System.out.println("_________________________________________");
		System.out.println(" ");

		//////////// runnerThree/////////////

		System.out.println("Please enter your first and last name (first, last):");
		String firstNameThree = keyboard.next();
		String lastNameThree = keyboard.nextLine();

		System.out.println(firstNameThree + ", please enter the time of your first mile (MM:SS.SSS):");
		String runnerThreeMileOne = keyboard.nextLine();
		int minutesRunnerThreeMileOne = Integer.parseInt(runnerThreeMileOne.split(":")[0]);
		double secondsRunnerThreeMileOne = Double.parseDouble(runnerThreeMileOne.split(":")[1]);
		double runnerThreeMileOneInSecconds = minutesRunnerThreeMileOne * SECONDS_PER_MINUTE
				+ secondsRunnerThreeMileOne;

		System.out.println(firstNameThree + ", please enter your time to the end of mile two (MM:SS.SSS):");
		String runnerThreeMileTwo = keyboard.nextLine();
		int minutesRunnerThreeMileTwo = Integer.parseInt(runnerThreeMileTwo.split(":")[0]);
		double secondsRunnerThreeMileTwo = Double.parseDouble(runnerThreeMileTwo.split(":")[1]);
		double runnerThreeMileTwoInSecconds = minutesRunnerThreeMileTwo * SECONDS_PER_MINUTE
				+ secondsRunnerThreeMileTwo;

		System.out.println(firstNameThree + ", Please enter your time to the end of the 5km run (MM:SS.SSS):");
		String runnerThreeTotalTime = keyboard.nextLine();
		int minutesRunnerThreeTotalTime = Integer.parseInt(runnerThreeTotalTime.split(":")[0]);
		double secondsRunnerThreeTotalTime = Double.parseDouble(runnerThreeTotalTime.split(":")[1]);
		double runnerThreeTotalTimeInSeconds = minutesRunnerThreeTotalTime * SECONDS_PER_MINUTE
				+ secondsRunnerThreeTotalTime;

		double runnerThreeMileTwoTimeInSecconds = runnerThreeMileTwoInSecconds - runnerThreeMileOneInSecconds;
		int runnerThreeMileTwoMinutes = (int) (runnerThreeMileTwoTimeInSecconds / SECONDS_PER_MINUTE);
		double runnerThreeMileTwoTotalSecconds = runnerThreeMileTwoTimeInSecconds % SECONDS_PER_MINUTE;

		double runnerThreeMileThreeTimeInSecconds = runnerThreeTotalTimeInSeconds - runnerThreeMileTwoTimeInSecconds
				- runnerThreeMileOneInSecconds;
		int runnerThreeMileThreeMinutes = (int) (runnerThreeMileThreeTimeInSecconds / SECONDS_PER_MINUTE);
		double runnerThreeMileThreeTotalSecconds = runnerThreeMileThreeTimeInSecconds % SECONDS_PER_MINUTE;

		System.out.println(firstNameThree + lastNameThree + "'s summary");
		System.out.println("Mile One Time: " + runnerThreeMileOne);
		System.out.printf("Mile Two Time: %d:%06.3f\n", runnerThreeMileTwoMinutes, runnerThreeMileTwoTotalSecconds);
		System.out.printf("Mile Three Time:  %d:%06.3f\n", runnerThreeMileThreeMinutes,
				runnerThreeMileThreeTotalSecconds);
		System.out.println("Total Time: " + runnerThreeTotalTime);
		System.out.println("_________________________________________");
		System.out.println(" ");

		/////////////// runnerFour///////////////

		System.out.println("Please enter your first and last name (first, last):");
		String firstNameFour = keyboard.next();
		String lastNameFour = keyboard.nextLine();

		System.out.println(firstNameFour + ", please enter the time of your first mile (MM:SS.SSS):");
		String runnerFourMileOne = keyboard.nextLine();
		int minutesRunnerFourMileOne = Integer.parseInt(runnerFourMileOne.split(":")[0]);
		double secondsRunnerFourMileOne = Double.parseDouble(runnerFourMileOne.split(":")[1]);
		double runnerFourMileOneInSecconds = minutesRunnerFourMileOne * SECONDS_PER_MINUTE + secondsRunnerFourMileOne;

		System.out.println(firstNameFour + ", please enter your time to the end of mile two (MM:SS.SSS):");
		String runnerFourMileTwo = keyboard.nextLine();
		int minutesRunnerFourMileTwo = Integer.parseInt(runnerFourMileTwo.split(":")[0]);
		double secondsRunnerFourMileTwo = Double.parseDouble(runnerFourMileTwo.split(":")[1]);
		double runnerFourMileTwoInSecconds = minutesRunnerFourMileTwo * SECONDS_PER_MINUTE + secondsRunnerFourMileTwo;

		System.out.println(firstNameFour + ", Please enter your time to the end of the 5km run (MM:SS.SSS):");
		String runnerFourTotalTime = keyboard.nextLine();
		int minutesRunnerFourTotalTime = Integer.parseInt(runnerFourTotalTime.split(":")[0]);
		double secondsRunnerFourTotalTime = Double.parseDouble(runnerFourTotalTime.split(":")[1]);
		double runnerFourTotalTimeInSeconds = minutesRunnerFourTotalTime * SECONDS_PER_MINUTE
				+ secondsRunnerFourTotalTime;

		double runnerFourMileTwoTimeInSecconds = runnerFourMileTwoInSecconds - runnerFourMileOneInSecconds;
		int runnerFourMileTwoMinutes = (int) (runnerFourMileTwoTimeInSecconds / SECONDS_PER_MINUTE);
		double runnerFourMileTwoTotalSecconds = runnerFourMileTwoTimeInSecconds % SECONDS_PER_MINUTE;

		double runnerFourMileThreeTimeInSecconds = runnerFourTotalTimeInSeconds - runnerFourMileTwoTimeInSecconds
				- runnerFourMileOneInSecconds;
		int runnerFourMileThreeMinutes = (int) (runnerFourMileThreeTimeInSecconds / SECONDS_PER_MINUTE);
		double runnerFourMileThreeTotalSecconds = runnerFourMileThreeTimeInSecconds % SECONDS_PER_MINUTE;

		System.out.println(firstNameFour + lastNameFour + "'s summary");
		System.out.println("Mile One Time: " + runnerFourMileOne);
		System.out.printf("Mile Two Time: %d:%06.3f\n", runnerFourMileTwoMinutes, runnerFourMileTwoTotalSecconds);
		System.out.printf("Mile Three Time:  %d:%06.3f\n", runnerFourMileThreeMinutes, runnerFourMileThreeTotalSecconds);
		System.out.println("Total Time: " + runnerFourTotalTime);
		System.out.println("_________________________________________");
		System.out.println(" ");

		/////////////// runnerFive///////////////

		System.out.println("Please enter your first and last name (first, last):");
		String firstNameFive = keyboard.next();
		String lastNameFive = keyboard.nextLine();

		System.out.println(firstNameFive + ", please enter the time of your first mile (MM:SS.SSS):");
		String runnerFiveMileOne = keyboard.nextLine();
		int minutesRunnerFiveMileOne = Integer.parseInt(runnerFiveMileOne.split(":")[0]);
		double secondsRunnerFiveMileOne = Double.parseDouble(runnerFiveMileOne.split(":")[1]);
		double runnerFiveMileOneInSecconds = minutesRunnerFiveMileOne * SECONDS_PER_MINUTE + secondsRunnerFiveMileOne;

		System.out.println(firstNameFive + ", please enter your time to the end of mile two (MM:SS.SSS):");
		String runnerFiveMileTwo = keyboard.nextLine();
		int minutesRunnerFiveMileTwo = Integer.parseInt(runnerFiveMileTwo.split(":")[0]);
		double secondsRunnerFiveMileTwo = Double.parseDouble(runnerFiveMileTwo.split(":")[1]);
		double runnerFiveMileTwoInSecconds = minutesRunnerFiveMileTwo * SECONDS_PER_MINUTE + secondsRunnerFiveMileTwo;

		System.out.println(firstNameFive + ", Please enter your time to the end of the 5km run (MM:SS.SSS):");
		String runnerFiveTotalTime = keyboard.nextLine();
		int minutesRunnerFiveTotalTime = Integer.parseInt(runnerFiveTotalTime.split(":")[0]);
		double secondsRunnerFiveTotalTime = Double.parseDouble(runnerFiveTotalTime.split(":")[1]);
		double runnerFiveTotalTimeInSeconds = minutesRunnerFiveTotalTime * SECONDS_PER_MINUTE
				+ secondsRunnerFiveTotalTime;

		double runnerFiveMileTwoTimeInSecconds = runnerFiveMileTwoInSecconds - runnerFiveMileOneInSecconds;
		int runnerFiveMileTwoMinutes = (int) (runnerFiveMileTwoTimeInSecconds / SECONDS_PER_MINUTE);
		double runnerFiveMileTwoTotalSecconds = runnerFiveMileTwoTimeInSecconds % SECONDS_PER_MINUTE;

		double runnerFiveMileThreeTimeInSecconds = runnerFiveTotalTimeInSeconds - runnerFiveMileTwoTimeInSecconds
				- runnerFiveMileOneInSecconds;
		int runnerFiveMileThreeMinutes = (int) (runnerFiveMileThreeTimeInSecconds / SECONDS_PER_MINUTE);
		double runnerFiveMileThreeTotalSecconds = runnerFiveMileThreeTimeInSecconds % SECONDS_PER_MINUTE;

		System.out.println(firstNameFive + lastNameFive + "'s summary");
		System.out.println("Mile One Time: " + runnerFiveMileOne);
		System.out.printf("Mile Two Time: %d:%06.3f\n", runnerFiveMileTwoMinutes, runnerFiveMileTwoTotalSecconds);
		System.out.printf("Mile Three Time:  %d:%06.3f\n", runnerFiveMileThreeMinutes, runnerFiveMileThreeTotalSecconds);
		System.out.println("Total Time: " + runnerFiveTotalTime);
		System.out.println("_________________________________________");
		System.out.println(" ");

		///////////// chart/////////////

		System.out.printf("%10s %30s %12s %12s %12s\n", "Full Name", "Mile One ", "Mile Two ", "Mile Three ",
				"Total Time");
		System.out.println("");
		System.out.printf("%20s %30s %5d:%06.3f %5d:%06.3f %12s\n", firstNameOne + lastNameOne, runnerOneMileOne,
				runnerOneMileTwoMinutes, runnerOneMileTwoTotalSecconds, runnerOneMileThreeMinutes,
				runnerOneMileThreeTotalSecconds, runnerOneTotalTime);
		System.out.printf("%20s %30s %5d:%06.3f %5d:%06.3f %12s\n", firstNameTwo + lastNameTwo, runnerTwoMileOne,
				runnerTwoMileTwoMinutes, runnerTwoMileTwoTotalSecconds, runnerTwoMileThreeMinutes,
				runnerTwoMileThreeTotalSecconds, runnerTwoTotalTime);
		System.out.printf("%20s %30s %5d:%06.3f %5d:%06.3f %12s\n", firstNameThree + lastNameThree,
				runnerThreeMileOne, runnerThreeMileTwoMinutes, runnerThreeMileTwoTotalSecconds,
				runnerThreeMileThreeMinutes, runnerThreeMileThreeTotalSecconds, runnerThreeTotalTime);
		System.out.printf("%20s %30s %5d:%06.3f %5d:%06.3f %12s\n", firstNameFour + lastNameFour, runnerFourMileOne,
				runnerFourMileTwoMinutes, runnerFourMileTwoTotalSecconds, runnerFourMileThreeMinutes,
				runnerFourMileThreeTotalSecconds, runnerFourTotalTime);
		System.out.printf("%20s %30s %5d:%06.3f %5d:%06.3f %12s\n", firstNameFive + lastNameFive, runnerFiveMileOne,
				runnerFiveMileTwoMinutes, runnerFiveMileTwoTotalSecconds, runnerFiveMileThreeMinutes,
				runnerFiveMileThreeTotalSecconds, runnerFiveTotalTime);

		keyboard.close();
	}

}
