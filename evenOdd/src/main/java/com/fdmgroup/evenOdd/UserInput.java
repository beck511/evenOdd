package com.fdmgroup.evenOdd;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UserInput {
	// Creates a scanner to get user input
	// This class expects an int as input
	public int UsrInput() throws charException{
		int number = 0;
		
		try {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter a number to test for Even/Odd:");
			number = scanner.nextInt();
			scanner.close();
		} catch (InputMismatchException e) {
			throw new charException();
		}
		return number;
	}
}