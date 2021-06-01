package com.FunctionalPrograms;

import java.util.Scanner;

public class TwoDArray {

	public static void main(String[] args) {
		int M, N, i, j;
		Scanner obj = new Scanner(System.in);
		// Reading the elements of 2d array
		System.out.print("Enter the number of rows : ");
		M = obj.nextInt();
		System.out.print("Enter the number of columns : ");
		N = obj.nextInt();
		// Declaring the 2D Array
		int array[][] = new int[M][N];
		System.out.print("Enter the elements of an array : ");
		// accessing array elements
		for (i = 0; i < M; i++) {
			for (j = 0; j < N; j++) {
				array[i][j] = obj.nextInt();
			}
		}
		for (i = 0; i < M; i++) {
			for (j = 0; j < N; j++) {
				// Displaying 2D Array
				System.out.print("[" + array[i][j] + "]");
			}
			System.out.println(" ");
		}
	}
}
