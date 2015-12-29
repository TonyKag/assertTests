package com.sqa.ao.jutitTests;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class IndexOutOfBoundsExceptionWithRule {
	// private String[] myArray = new String[2];
	//
	// @Test
	// public void indexOutOfBoundsException() {
	// myArrayElements();
	// Assert.assertNotNull("out of bound exception", (myArray[1]));
	// }
	//
	// public void myArrayElements() {
	// myArray[0] = "first";
	// myArray[1] = "second";
	// }

	@Rule
	public ExpectedException thrown = ExpectedException.none();

	@Test
	public void shouldTestExceptionMessage() throws IndexOutOfBoundsException {
		String[] myArray = new String[2];
		myArray[0] = "first";
		myArray[1] = "second";

		thrown.expect(IndexOutOfBoundsException.class);
		thrown.expectMessage("2");
		String elem = myArray[2];
	}

}
