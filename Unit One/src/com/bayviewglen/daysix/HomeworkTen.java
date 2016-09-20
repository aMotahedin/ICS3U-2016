package com.bayviewglen.daysix;

import java.util.Scanner;

public class HomeworkTen {

	public static void main(String[] args) {

		Scanner number = new Scanner(System.in);
		
		System.out.println("please insert the leingth of one side");
		double l = number.nextDouble();
		
		 
		System.out.println("please insert the width of one side");
		double w = number.nextDouble();
		
		double perimiter = (l * 2) + (w * 2);
		double area = l * w; 
		
		System.out.println("the area of your rectangle is " + area + " and the perimiter is " + perimiter);
		
	}

}
