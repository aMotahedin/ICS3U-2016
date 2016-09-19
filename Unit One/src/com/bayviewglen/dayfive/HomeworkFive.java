package com.bayviewglen.dayfive;

import java.util.Scanner;

public class HomeworkFive {

	public static void main(String[] args) {

		// v_f= v_i+at

		Scanner iv = new Scanner(System.in);

		System.out.println("Please incert the initial value: ");

		double x = iv.nextDouble();

		Scanner time = new Scanner(System.in);
		System.out.println("please incert the total time: ");
		double y = time.nextDouble();
		
		Scanner acc = new Scanner(System.in);
		System.out.println("Finally, please incert the Acceleration: ");
		double z = acc.nextDouble();
		
		System.out.println("Your final Velosity: ");
		System.out.println(y * z + x);
		
	}

}
