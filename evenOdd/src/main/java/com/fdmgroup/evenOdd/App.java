package com.fdmgroup.evenOdd;

/*This app tells the user if the number entered is Even or Odd and throws an exception if anything else is entered*/



public class App {
	public static void main(String[] args) throws charException {

		// Call UserInput class to get an int from the user
		UserInput input = new UserInput();
		// Assign the int to number
		int number = input.UsrInput();

		// Call EvenOdd class as checker
		EvenOdd checker = new EvenOdd();
		// Provide it with the number returned from UserInput
		checker.evenOdd(number);
	}
}