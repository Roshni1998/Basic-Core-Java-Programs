package com.FunctionalPrograms;

import java.util.Scanner;

public class WindChill {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter the Temperature (in Fahrenheit) : ");
		double t = obj.nextInt();
		System.out.print("Enter the Wind Speed (in miles per hour): ");
		double v = obj.nextInt();
		// Computation
		if (t >= 32 && t < 50 && v > 3 && v < 120) {
			double u = Math.sqrt(Math.pow(v, 0.16));
			double w = (35.74 + 0.6215 * t + (0.4275 * t - 35.75) * u);
			System.out.println("Temperature of WindChill :" + " " + w);
		} else {
			System.out.println("Please Enter Valid Choice as Temperature(in Fahrenheit) should be less than 50.");
			System.out.println("Wind Speed should be greater than 3 and less than 120.");
		}
	}
}
