package com.fdmgroup.Java8;

import org.junit.Test;
import com.fdmgroup.evenOdd.EvenOdd;
import junit.framework.TestCase;

public class AppTest extends TestCase {
@Test
	// Tests if even number 2 works
	public void testTwoForEven() {
		EvenOdd checker = new EvenOdd();
		assertTrue(checker.evenOdd(2));
	}
@Test
	// Tests if odd number 5 works
	public void testFiveForOdd() {
		EvenOdd checker = new EvenOdd();
		assertFalse(checker.evenOdd(5));
	}
@Test
	// Tests if even number 502 works
	public void testFiveHundredAndTwoForEven() {
		EvenOdd checker = new EvenOdd();
		assertTrue(checker.evenOdd(502));
	}
@Test
	// Tests if odd number 235 works
	public void testTwoHundredAndFiveForOdd() {
		EvenOdd checker = new EvenOdd();
		assertFalse(checker.evenOdd(205));
	}


}
