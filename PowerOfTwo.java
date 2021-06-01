package com.CoreJavaPrograms;

import java.util.Scanner;

public class PowerOfTwo {

	public static void main(String[] args) {
		int num, power = 1;
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter a number = ");
		num = obj.nextInt();
		if (num >= 0 && num < 31) {
			System.out.println("Table of 2^" + num + "-");
			for (int i = 0; i < num; i++) {
				power = 2 * power;
			}
			for (int j = 1; j < num; j++) {
				int result = power * j;
				System.out.println("2^" + num + "*" + j + "=" + " " + result);
			}
		} else {
			System.out.println("Please Enter a number within the range of 0 to 31!!");
		}
	}
}