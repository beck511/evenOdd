package com.fdmgroup.evenOdd;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

public class PersonObjects {

	public static void main(String[] args) throws myException {
		// Setting up Scanner for use
		Scanner scan = new Scanner(System.in);
		try {
			// Asking user for input
			System.out.println("Enter an ID number to lookup:");
			int input = scan.nextInt();
			// Adding some objects of type person
			Object p1 = new Person().setName("Bob");
			Object p2 = new Person().setName("Mary");
			Object p3 = new Person().setName("Paul");
			Object p4 = new Person().setName("Billy");

			// Creating a map with an index to be used as an ID
			Map<Integer, Object> map = new HashMap<Integer, Object>();

			// Putting the objects of type person into the Map
			map.put(1, p1);
			map.put(2, p2);
			map.put(3, p3);
			map.put(4, p4);

			// Custom exception if no index of that int found
			if (map.get(input) == null) {

				throw new myException();

			} else {
				// Sys out if all ok and give user the data requested
				System.out.println("ID number " + input + " is " + map.get(input));
			}
		} catch (InputMismatchException e) {
			// Catching exception and giving out custom output
			System.out.println("Only numbers are allowed!");
		} catch (myException e) {
			// Catching my custom exception and making it just do its sys out
			// rather than its full error
		} finally {
			// Close the scanner to save memory as its no longer needed
			scan.close();
		}

	}

}