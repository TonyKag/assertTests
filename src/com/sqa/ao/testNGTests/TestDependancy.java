package com.sqa.ao.testNGTests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestDependancy {
	@Test(groups = { "int" })
	public void testAssertEqual1() {
		Assert.assertEquals(1, 3);
	}

	@Test(groups = { "int" })
	public void testAssertEqual2() {
		Assert.assertEquals(5, 5);
	}

	@Test(groups = { "string" }, dependsOnGroups = "int")
	public void testAssertEqual3() {
		Assert.assertEquals("10", "10");
	}

	@Test(groups = { "string" }, dependsOnGroups = "int")
	public void testAssertEqual4() {
		Assert.assertEquals("25", "25");
	}

}
