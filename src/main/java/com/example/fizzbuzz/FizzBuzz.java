package com.example.fizzbuzz;

public class FizzBuzz {

	public String get(final int number) {

		if (number == 0 )
			throw new IllegalArgumentException(" invalid input");

		if (isBuzz(number) && isFizz(number))
			return "fizzbuzz";

		if (isFizz(number))
			return "fizz";

		if (isBuzz(number))
			return "buzz";

		return String.valueOf(number);
	}

	private boolean isFizz(final int number) {
		return (number % 3 == 0);

	}

	private boolean isBuzz(final int number) {
		return (number % 5 == 0);

	}

	public String getForRange(final int min, final int max,
			final String delimiter) {

		if(min>max) throw new IllegalArgumentException("out of range");
		
		StringBuilder result = new StringBuilder();

		for (int i = min; i <= max; i++) {
			result.append(get(i));
			if (i < max) {
				result.append(delimiter);
			}
		}

		return result.toString();

	}
}
