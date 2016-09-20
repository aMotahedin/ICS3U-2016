package com.bayviewglen.daysix;

import java.util.Scanner;

public class HomeworkEight {

	public static void main(String[] args) {

		Scanner number = new Scanner(System.in);
		System.out.println("please incert a positave number: ");
		
		double x = number.nextDouble();
		System.out.println("your number squared is " + x * x);
		System.out.println("your number's square root is " + Math.sqrt(x));

	}

}
