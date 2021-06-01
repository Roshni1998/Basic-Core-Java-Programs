package com.CoreJavaPrograms;

import java.util.Scanner;

public class Division {

	public static void main(String[] args) {
		int dividend, divisor;
		Scanner obj = new Scanner(System.in);
		// User Inputs
		System.out.println("Enter the value of Dividend = ");
		dividend = obj.nextInt();
		System.out.println("Enter the value of Divisor = ");
		divisor = obj.nextInt();
		// Compute Quotient and Remainder
		int quo = (dividend / divisor);
		System.out.println("Quotient = " + quo);
		int rem = (dividend % divisor);
		System.out.println("Remainder = " + rem);
	}

}