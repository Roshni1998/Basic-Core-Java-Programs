package com.CoreJavaPrograms;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		int num;
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter the number = ");
		num = obj.nextInt();
		if (num % 2 == 0) {
			System.out.println(num + " " + "is an Even Number.");
		} else {
			System.out.println(num + " " + "is an Odd Number.");
		}
	}
}
