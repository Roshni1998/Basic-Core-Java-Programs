package com.CoreJavaPrograms;

import java.util.Scanner;

public class HarmonicNumber {
	public static void main(String[] args) {
		System.out.println("Enter Any Number :");
		Scanner obj = new Scanner(System.in);
		int num = obj.nextInt();
		System.out.println("The Harmonic Series is : ");
		double result = 0.0;
		while(num > 0) {
			result = result + (double)1/num;
			num--;
			System.out.println(result +" ");
		}
		System.out.println("");
		System.out.println("Sum of the Harmonic Series " +result);
	}
}
