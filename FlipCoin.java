package com.CoreJavaPrograms;

import java.util.Scanner;

public class FlipCoin {

	public static void main(String[] args) {
		int num;
		int headCount = 0;
		int tailCount = 0;
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter the number of times you want to flip the coin = ");
		num = obj.nextInt();
		// The number of times to Flip Coin
		if (num > 0) {
			for (int i = 1; i <= num; i++) {
				double coin = Math.random();
				if (coin < 0.5) {
					tailCount++;
				} else {
					headCount++;
				}
			}
			System.out.println("Tail Count :" + tailCount);
			System.out.println("Head Count :" + headCount);
			// Percentage of Head v/s Tails
			double headpercentage = (double) (headCount * 100) / 10;
			double tailpercentage = (double) (tailCount * 100) / 10;
			System.out.println("Head Percentage:" + headpercentage + "%");
			System.out.println("Tail Percentage:" + tailpercentage + "%");
		} else {
			System.out.println("Please Enter a POSITIVE INTEGER!!");// Invalid Input
		}
	}
}