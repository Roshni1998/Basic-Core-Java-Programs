package com.FunctionalPrograms;

import java.util.Scanner;

public class Quadractic {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter the coefficient of x*x : ");
		double a = obj.nextInt();
		System.out.print("Enter the 2nd coefficient of x : ");
		double b = obj.nextInt();
		System.out.print("Enter the constant value : ");
		double c = obj.nextInt();
		double delta = (b * b - 4 * a * c);
		double x = Math.sqrt(Math.pow(delta, 2));
		double root1 = (-b + x / 2 * a);
		double root2 = (-b - x / 2 * a);
		System.out.println("Roots of Equation are :" + root1 + "," + root2);
	}
}
