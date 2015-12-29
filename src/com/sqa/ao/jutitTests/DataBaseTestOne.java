package com.sqa.ao.jutitTests;

import org.junit.Assert;
import org.junit.Test;

public class DataBaseTestOne {

	@Test
	public void testDataBaseOne() throws InterruptedException {
		Thread.sleep(4000);
		String myStr = "My String";
		Assert.assertEquals("My String", myStr);
	}

}
