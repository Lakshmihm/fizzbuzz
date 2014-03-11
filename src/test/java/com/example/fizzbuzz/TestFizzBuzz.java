package com.example.fizzbuzz;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestFizzBuzz {

	FizzBuzz fizzbuzz = new FizzBuzz();

	@Test(expected = IllegalArgumentException.class)
	public void testZero() {

		fizzbuzz.get(0);
	}

	@Test
	public void testNonMultiple() {
		assertEquals("1", fizzbuzz.get(1));
	}

	@Test
	public void testNegativeNonMultiple() {
		assertEquals("-1", fizzbuzz.get(-1));
	}

	@Test
	public void testMultipleOfThree() {

		assertEquals("fizz", fizzbuzz.get(3));

	}

	@Test
	public void testMutipleofThreeSeries() {

		for (int i = -12; i <= 12; i = i + 3) {// -12 to 12

			if (i != 0) {
				assertEquals("fizz", fizzbuzz.get(i));
			}
		}

	}

	@Test
	public void testMultipleOfFive() {

		assertEquals("buzz", fizzbuzz.get(5));
	}

	@Test
	public void testMultipleOfFiveSeries() {

		for (int i = -10; i <= 10; i = i + 5) {// -10,-5,5,10

			if (i != 0) {
				assertEquals("buzz", fizzbuzz.get(i));
			}
		}

	}

	@Test
	public void testMultipleOfFifteen() {

		assertEquals("fizzbuzz", fizzbuzz.get(15));
	}

	@Test
	public void testMultipleOfFifteenSeries() {

		for (int i = -50; i <= 50; i = i + 15) {// -50 to 50

			if (i != 0) {
				assertEquals("fizzbuzz", fizzbuzz.get(-15));
			}
		}

	}

	@Test
	public void testForRange() {
		assertEquals(
				"1 2 fizz 4 buzz fizz 7 8 fizz buzz 11 fizz 13 14 fizzbuzz 16 17 fizz 19 buzz",
				fizzbuzz.getForRange(1, 20, " "));
	}

	@Test(expected = IllegalArgumentException.class)
	public void testoutOfRange() {
		fizzbuzz.getForRange(10, 0, "");
	}

}
