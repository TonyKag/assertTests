package com.sqa.ao.jutitTests;

import java.util.ArrayList;

import org.junit.Test;

public class IndexOutOfBoundsExceptionWithAnn {
	@Test(expected = IndexOutOfBoundsException.class)
	public void testIndexOutOfBoundsException() {
		new ArrayList<Object>().get(0);
	}

}
