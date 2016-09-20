package com.bayviewglen.daysix;

import java.util.Scanner;

public class HomeworkNine {

	public static void main(String[] args) {

		Scanner numbersold = new Scanner(System.in);

		System.out.println("please incert the amount of items sold: ");
		double x = numbersold.nextDouble();
		
		double total = x * 0.27; 
		
		System.out.println("Congradulations you have earned a total of $" + total);

		
	}

}
