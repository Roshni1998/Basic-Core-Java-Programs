package com.CoreJavaPrograms;

import java.util.Scanner;

public class Factors {

	public static void main(String[] args) {
		int num;
		Scanner fr = new Scanner(System.in);
		// User Inputs
		System.out.print("Enter an Integer = ");
		num = fr.nextInt();
		// Find Prime Factors of an entered number
		for (int i = 2; i <= num; i++) {
			while (num % i == 0) {
				System.out.println("Prime Factors are" + " " + ":" + " " + i);
				num = num / i;
			}
		}
	}
}