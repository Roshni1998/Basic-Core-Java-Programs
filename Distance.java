package com.FunctionalPrograms;

import java.util.Scanner;

public class Distance {

	public static void main(String[] args) {
		int x, y;
		// Reading Inputs from the user
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter a point on x-axis: ");
		x = obj.nextInt();
		System.out.print("Enter a point on y-axis: ");
		y = obj.nextInt();
		// Calculate the distance.
		double distance = Math.sqrt(Math.pow(x - 0, 2) + Math.pow(y - 0, 2));
		System.out.println("Distance from the point" + " " + "(" + x + "," + y + ")" + " " + "to the origin (0,0)"+ " = " + distance);
	}
}
