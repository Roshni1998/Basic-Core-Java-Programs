package com.FunctionalPrograms;

import java.util.Scanner;

public class SumOfTriplet {

	public static void main(String[] args) {
		int TotalNoOfTriplet = 0;
		Scanner obj = new Scanner(System.in);
		// Reading the elements of an array
		System.out.print("Enter the size of an array: ");
		int size = obj.nextInt();
		// Creates an array in the memory of size
		int[] Triplet = new int[size];
		System.out.print("Enter the elements of an array: ");
		// accessing array elements
		for (int i = 0; i < size; i++) {
			Triplet[i] = obj.nextInt();
		}
		for (int i = 0; i < size; i++) {
			System.out.println(Triplet[i]);
		}

		// Find distinct triplets using for loop
		System.out.println("Triplets which are add to zero =");
		for (int i = 0; i < size - 2; i++) {
			for (int j = i + 1; j < size - 1; j++) {
				for (int k = j + 1; k < size; k++) {
					// Checks sum of any 3 integer adds to zero
					if (Triplet[i] + Triplet[j] + Triplet[k] == 0) {
						// Print the result
						TotalNoOfTriplet++;
						System.out.println("(" + Triplet[i] + "," + Triplet[j] + "," + Triplet[k] + ")");
					}
				}
			}
		}
		System.out.println("Total number of Triplets =" + TotalNoOfTriplet);
	}

}