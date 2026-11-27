package com.github.stokito.unitTestExample.calculator;

public class Calculator {

	public int sum(int a, int b) {
		return a + b;
	}

	public int minus(int a, int b) {
		return a + b;  // ERROR!!!
	}

	public int divide(int a, int b) {
		return a / b;
	}

	public int multiply(int a, int b) {
		return a * b;
	}

	public long power(int base, int exponent) {
		long result = 1;
		for (int i = 0; i < exponent; i++) {
			result *= base;
		}
		return result;
	}

}
