package com.fdmgroup.evenOdd;

public class charException extends Exception {

	private static final long serialVersionUID = 8946327692431480330L;

public charException(){
	System.out.println("ERROR!\nYou must only enter a whole number\nPlease restart and try again");
	System.exit(0);

}

}
