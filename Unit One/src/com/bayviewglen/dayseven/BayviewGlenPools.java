package com.bayviewglen.dayseven;

import java.text.DecimalFormat;
import java.util.Scanner;

public class BayviewGlenPools {
private static DecimalFormat decform = new DecimalFormat (".##");

	public static void main(String[] args) {
		

		Scanner keyboard = new Scanner(System.in);

		System.out.println("First, enter the length of the pool: ");
		double length = keyboard.nextDouble();

		System.out.println("Then, enter the width of the pool: ");
		double width = keyboard.nextDouble();

		System.out.println("Next, enter the depth of the deep end of the pool: ");
		double deepDepth = keyboard.nextDouble();

		System.out.println("Now, please enter the depth of the shallow end of the pool: ");
		double shallowDepth = keyboard.nextDouble();

		System.out
				.println("Please enter the length of the transition between the deep and shallow ends of the pool:  ");
		double transitionHyp = keyboard.nextDouble();

		System.out.println("Then enter the length of the shallow end: ");
		double shallowLength = keyboard.nextDouble();

		System.out.println("Finally, enter the price of liner one, two and three: ");
		double linerOne = keyboard.nextDouble();
		double linerTwo = keyboard.nextDouble();
		double linerThree = keyboard.nextDouble();

		keyboard.close();
		
		// question one

		double transitionHeight = deepDepth - shallowDepth;

		double transitionLenghtPt1 = transitionHyp * transitionHyp - (transitionHeight * transitionHeight);
		double transitionLength = Math.sqrt(transitionLenghtPt1);

		double shallowVolume = shallowDepth * shallowLength * width;

		double lengthDeepEnd = length - shallowLength - transitionLength;

		double deepVolume = lengthDeepEnd * deepDepth * width;

		double middleVolume = shallowDepth * transitionLength * width;

		double transitionTriangleHeight = deepDepth - shallowDepth;
		double transitionTriangleVolume = ((transitionTriangleHeight * transitionLength) * 0.5) * width;

		double totalVolume = (transitionTriangleVolume + middleVolume + deepVolume + shallowVolume) * 1000;

		double water = totalVolume * 0.9;
		
		System.out.println("\t");
		System.out.println("you will need " + decform.format(water) + " litres of water to fill the pool 90%");

		// question two

		double surfaceAreaBottom = (transitionHyp + lengthDeepEnd + shallowLength) * width;

		double surfaceAreaFront = width * shallowDepth;
		double surfaceAreaBack = width * deepDepth;

		double surfaceAreaDeepSides = (deepDepth * lengthDeepEnd) * 2;
		double surfaceAreaShallowSides = (shallowLength * shallowDepth) * 2;
		double surfaceAreaTransionBox = (shallowDepth * transitionLength) * 2;
		double surfaceAreaTransitionTriangle = ((transitionLength * transitionTriangleHeight) / 2) * 2;
		double surfaceAreaTotal = surfaceAreaDeepSides + surfaceAreaShallowSides + surfaceAreaTransionBox
				+ surfaceAreaTransitionTriangle + surfaceAreaFront + surfaceAreaBack + surfaceAreaBottom;


		System.out.println("\t");
		System.out.println(decform.format(surfaceAreaTotal) + " meters squared is needed to line this pool");

		// question 3

		double linerOneTotal = linerOne * surfaceAreaTotal;
		double linerTwoTotal = linerTwo * surfaceAreaTotal;
		double linerThreeTotal = linerThree * surfaceAreaTotal;

		System.out.println("\t");
		System.out.println("price of liner one: $" + decform.format(linerOneTotal));
		System.out.println("price of liner two: $" + decform.format(linerTwoTotal));
		System.out.println("price of liner three: $" + decform.format(linerThreeTotal));

	}

}
