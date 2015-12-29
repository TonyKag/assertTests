package com.sqa.ao.jutitTests;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class ParameterizedClassTest {

	// @Parameters annotation marks this method as parameters provider
	@Parameters
	public static Iterable<Object[]> createData() {
		return Arrays.asList(new Object[][] { { -2, 2 }, { 2, -2 }, { 0, 2 }, { 2, 5 }, { 4, -2 } });
	}

	private final double BASE;
	private final double POWER;

	// Constructor is initialized with one set of parameters every time
	public ParameterizedClassTest(final double base, final double power) {
		this.BASE = base;
		this.POWER = power;
	}

	// test consumes the data set via class variables
	@SuppressWarnings("deprecation")
	@Test
	public void testBaseToPowerOfX() {
		// Assert.assertTrue("Num should not be greater than 5", INPUT < 5);
		Assert.assertEquals(Math.pow(BASE, POWER), calcPowOfNumX(BASE, POWER), 1);
	}

	private double calcPowOfNumX(double base, double power) {
		double result = 1;

		// power is negative -> use recursion
		if (power < 0) {
			result = 1 / calcPowOfNumX(base, power * (-1));
			System.out.println(base + "^" + power + " = " + result);
		}
		// power is positive
		// double result = 1;
		for (int i = 0; i < power; i++) {
			result *= base;
		}
		System.out.println(base + "^" + power + " = " + result);
		return result;
	}

}