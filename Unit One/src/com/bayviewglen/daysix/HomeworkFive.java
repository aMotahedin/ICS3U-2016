package com.bayviewglen.daysix;

public class HomeworkFive {

	public static void main(String[] args) {

		int wins = 110 ;
		double totalgames = 154;
		
		double percent = wins / totalgames; 
		
		 double Rounded =  (int)(percent * 100000)/1000.0; 
		 
		 System.out.println(Rounded);
	}

}
