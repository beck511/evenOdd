package com.fdmgroup.evenOdd;

@SuppressWarnings("serial")
public class myException extends Exception {

	public myException() {
		System.out.println("No such ID number found!");
	}
}