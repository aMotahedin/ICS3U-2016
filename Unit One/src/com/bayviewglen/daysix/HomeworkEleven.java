package com.bayviewglen.daysix;

import java.util.Scanner;

public class HomeworkEleven {

	public static void main(String[] args) {
		// (1/2)mv^2
		
		Scanner number = new Scanner(System.in);

		System.out.println("please incert the mass of the object: ");
		
		double m = number.nextDouble();
		
		System.out.println("Please incert the speed of the object: ");

		double v = number.nextDouble(); 
		
		double ke = 0.5 * (m * (v * v)); 
		
		System.out.println("The kenetic energy of your object is " + ke + " Joules");
	}

}
