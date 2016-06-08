package com.fdmgroup.evenOdd;

public class EvenOdd {
	
	public boolean evenOdd(int number){


	// Create a string array with answers
	String[] evenOdd = { "Even", "odd" };

	// Print out if the number provided is Even or Odd
	System.out.println(number + " is an " + evenOdd[number & 1] + " number");


	// Returns true or false to make testing easier
	if (evenOdd[number & 1].equals("Even")){
		return true;
	}else
		return false;
	}}	