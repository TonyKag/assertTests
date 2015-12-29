package com.sqa.ao.testNGTests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class PowerWithDataProvidertest {

	@Test(dataProvider = "power")
	public void calcPower(int base, int power) {
		Assert.assertEquals(Math.pow(base, power), calcPowOfNumX(base, power));
	}

	// @DataProvider(name = "power")
	// public Object[][] powerSet() {
	// return new Object[][] { new Object[] { 0, 0 }, new Object[] { -2, -2 },
	// new Object[] { 2, 0 },
	// new Object[] { 2, 2 }, new Object[] { 2, 3 }, new Object[] { -2, 4 }, new
	// Object[] { -3, 0 },
	// new Object[] { -3, 1 }, new Object[] { -3, 2 }, new Object[] { -3, -3 },
	// new Object[] { 3, 0 },
	// new Object[] { 3, 1 }, new Object[] { 3, -2 }, new Object[] { 3, 3 }, new
	// Object[] { 3, 4 },
	// new Object[] { -4, 0 }, new Object[] { -4, 1 }, new Object[] { -4, 2 },
	// new Object[] { 4, 0 },
	// new Object[] { 4, 1 }, new Object[] { 4, 2 } };
	// }

	@DataProvider(name = "power")
	public Object[][] powerSet() {
		return new Object[][] { new Object[] { 0, 0 }, new Object[] { -2, -2 } };
	}

	/////////////////// help methods ///////////////////////////////////////
	private double calcPowOfNumX(int base, int power) {
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
