package com.sqa.ao.testNGTests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertTests {
	@Test
	public void assertFalse() {
		Assert.assertFalse('a' == 'b', "a != b");
	}

	@Test
	public void assertTrue() {
		Assert.assertTrue(5 > 1, "5 should be greater than 5");
	}

	@Test
	public void testAssertEquals() {
		String str1 = "my str";
		String str2 = "my str";
		if (str1 == str2) {
			System.out.println("String str1 = \"my str\":  str1 == str2");
		} else {
			System.out.println("String str1 = \"my str\":  str1 != str2");
		}
		Assert.assertEquals(str1, str2);
	}

	@Test
	public void testAssertEqualsNewString() {
		String str1 = new String("my str");
		String str2 = new String("my str");
		if (str1 == str2) {
			System.out.println("String str1 = new String(\"my str\"):  str1 == str2");
		} else {
			System.out.println("String str1 = new String(\"my str\"):  str1 != str2");
		}
		Assert.assertEquals(str1, str2);
	}

	// @Test
	// public void testAssertEqualsnoOrder() {
	// String str1 = new String("my str");
	// String str2 = new String("my str");
	// Assert.assertEqualsNoOrder(str1, str2, "not order");
	//
	// }

	// @Test(enabled = false)
	// public void testAssertNull() {
	// String str;
	// // str = "my str";
	// Assert.assertNull(str, "str is null");
	// }

	@Test
	public void testAssertNotNull() {
		String str;
		str = "my str";
		Assert.assertNotNull(str, "str is not null");
	}

	@Test
	public void testAssertNotSame() {
		String str1 = "my str";
		String str2 = "my str";
		Assert.assertNotSame(str2, str1, "str1 == str2");
	}

	@Test
	public void testAssertNotSameNewString() {
		String str1 = new String("my str");
		String str2 = new String("my str");
		Assert.assertNotSame(str2, str1, "str1 != str2");
	}

	@Test
	public void testAssertSame() {
		String str1 = "my str";
		String str2 = "my str";
		Assert.assertSame(str2, str1, "str1 == str2");
	}

	@Test
	public void testAssertSameNewString() {
		String str1 = new String("my str");
		String str2 = new String("my str");
		Assert.assertSame(str2, str1, "str1 == str2");
	}

}