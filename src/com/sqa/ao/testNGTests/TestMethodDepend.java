package com.sqa.ao.testNGTests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestMethodDepend {

	@Test
	public void testAssertEqual1() {
		int a = 1;
		int b = 2;
		Assert.assertEquals(a, b);
	}

	@Test(dependsOnMethods = { "testAssertEqual1" })
	public void testAssertEqual2() {
		int a = 5;
		int b = 5;
		Assert.assertEquals(a, b);
	}

	@Test(dependsOnMethods = { "testAssertEqual2" })
	public void testAssertEqual3() {
		String s1 = "my str";
		String s2 = "my str";
		Assert.assertEquals(s1, s2);
	}

	@Test(dependsOnMethods = { "testAssertEqual3" })
	public void testAssertEqual4() {
		Assert.assertEquals("25", "25");
	}

}
