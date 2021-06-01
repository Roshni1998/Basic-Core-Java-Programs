package com.CoreJavaPrograms;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		int year;
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter an Year(yyyy) = ");
		year = obj.nextInt();
		if (year >= 1000 && year <= 9999) {
			int a = (year % 4);
			int b = (year % 100);
			int c = (year % 400);
			/*
			 * Leap Year is divisible by 4, but not 100 OR Leap Year is divisible by 400.
			 */
			if (a == 0 && b != 0 || c == 0) {
				System.out.println("YES! This is the Leap Year.");
			} else {
				System.out.println("NO! This is not a Leap Year.");
			}
		} else {
			System.out.println("Please Enter a valid 4 digit number!!");
		}

	}

}