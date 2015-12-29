package com.sqa.ao.jutitTests;

import org.junit.Assert;
import org.junit.Test;

public class DivisionBy0 {
	int operand1 = 10;
	int operand2 = 1;

	@Test
	public void divisionBy0() {
		Assert.assertTrue("Division by zero not Possible!", isDivisionPossible(operand1, operand2));
	}

	public boolean isDivisionPossible(int op1, int op2) {
		boolean result = true;
		int divRes;
		try {
			divRes = op1 / op2;
		} catch (Exception e) {
			result = false;
		}
		return result;
	}
}
