package com.CoreJavaPrograms;

import java.util.Scanner;

public class Alphabet {

	public static void main(String[] args) {
		char letter;
		Scanner obj = new Scanner(System.in);
		// User Inputs
		System.out.print("Enter an Alphabet = ");
		letter = obj.next().charAt(0);
		// Checks that entered letter is vowel or not
		if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u' || letter == 'A'
				|| letter == 'E' || letter == 'I' || letter == 'O' || letter == 'U') {
			System.out.println("Entered Alphabet" + " " + letter + " " + "is Vowel.");
		} else if ((letter >= 'a' && letter <= 'z') || (letter >= 'A' && letter <= 'Z')) {
			System.out.println("Entered Alphabet" + " " + letter + " " + "is Consonant.");
		} else {
			System.out.println("Please Enter Character Value!!");// If user inputs invalid value
		}

	}

}