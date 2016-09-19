package com.bayviewglen.dayfive;

import java.util.Scanner;

public class HomeworkThree {

	public static void main(String[] args) {

		Scanner number = new Scanner(System.in);
		
		System.out.println("Please insert a 5 didgit number: ");
		
		int x = number.nextInt(); 
		
		int second = x  % 100000 / 10000; 
	
	    int fifth = x  % 100 / 10; 

	    System.out.println(fifth * second);
		
	}

}
