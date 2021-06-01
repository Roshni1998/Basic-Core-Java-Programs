package com.CoreJavaPrograms;

import java.util.Scanner;

public class LargestNumber {

	public static void main(String[] args) {
		int a, b, c;
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter the 1st number => ");
		a = obj.nextInt();
		System.out.print("Enter the 2nd number => ");
		b = obj.nextInt();
		System.out.print("Enter the 3rd number => ");
		c = obj.nextInt();
		if (a > b && a > c) {
			System.out.println(a + " " + "is the Largest Number among these 3 numbers.");
		} else if (b > c) {
			System.out.println(b + " " + "is the Largest Number among these 3 numbers.");
		} else {
			System.out.println(c + " " + "is the Largest Number among these 3 numbers.");
		}
	}
}