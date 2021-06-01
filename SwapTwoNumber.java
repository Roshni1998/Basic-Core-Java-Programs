package com.CoreJavaPrograms;

public class SwapTwoNumber {

	public static void main(String[] args) {
		// Swapping two numbers using 3rd variables
		int a = 60;
		int b = 45;
		int temp;
		System.out.println("Before Swapping:-" + "a=" + a + "," + "b=" + b);
		temp = a;
		a = b;
		b = temp;
		System.out.println("After Swapping:-" + "a=" + a + "," + "b=" + b);

		// Swapping 2 numbers without using 3rd variables
		int c = 34;
		int d = 78;
		System.out.println("Before Swapping:-" + "c=" + c + "," + "d=" + d);
		c = c + d;
		d = c - d;
		c = c - d;
		System.out.println("After Swapping W/o using 3rd variable:-" + "c=" + c + "," + "d=" + d);

	}

}