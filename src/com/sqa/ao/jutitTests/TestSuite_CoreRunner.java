package com.sqa.ao.jutitTests;

import org.junit.internal.TextListener;
import org.junit.runner.JUnitCore;

public class TestSuite_CoreRunner {

	public static void main(String[] args) {
		JUnitCore runner = new JUnitCore();
		runner.addListener(new TextListener(System.out));
		runner.run(IndexOutOfBoundsExceptionWithRule.class, DivisionBy0.class);

	}

}
