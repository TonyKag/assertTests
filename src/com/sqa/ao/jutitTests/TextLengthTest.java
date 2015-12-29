package com.sqa.ao.jutitTests;

import org.junit.Assert;
import org.junit.Test;

public class TextLengthTest {
	private final String ERR10 = "String should be empty.";
	private String myMessage = "a";

	@Test
	public void assertTrueText() {
		Assert.assertTrue(ERR10, myMessage.length() > 0);
	}
}
