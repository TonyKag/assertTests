/**
 *   File Name: TestGroups.java<br>
 *
 *   Yutaka<br>
 *   Java Boot Camp Exercise<br>
 *   Instructor: Jean-francois Nepton<br>
 *   Created: Oct 31, 2015
 *   
 */

package com.sqa.ao.testNGTests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestGroups {

	@Test(groups = { "group1" })
	public void testAssertEqual1() {
		Assert.assertEquals(1, 1);
	}

	@Test(groups = { "group1" })
	public void testAssertEqual2() {
		Assert.assertEquals(5, 5);
	}

	@Test(groups = { "group2" })
	public void testAssertEqual3() {
		Assert.assertEquals(10, 10);
	}

	@Test(groups = { "group2" })
	public void testAssertEqual4() {
		Assert.assertEquals(25, 25);
	}

}
