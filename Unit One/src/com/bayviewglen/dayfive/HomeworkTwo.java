package com.bayviewglen.dayfive;

import java.util.Scanner;

public class HomeworkTwo {

	public static void main(String[] args) {

		Scanner total = new Scanner (System.in);
		
		System.out.println("Insert test total: ");
		
		double x = total.nextDouble();
		
		Scanner score = new Scanner (System.in);
		
		System.out.println("Please insert your score: ");
		
		double y = score.nextDouble(); 
		
		System.out.println("Your Percentage: ");
		System.out.println( y / x * 100);

		
	}

}
