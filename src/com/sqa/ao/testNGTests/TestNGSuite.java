/**
 *   File Name: TestNGSuite.java<br>
 *
 *   Yutaka<br>
 *   Java Boot Camp Exercise<br>
 *   Instructor: Jean-francois Nepton<br>
 *   Created: Oct 31, 2015
 *   
 */

package com.sqa.ao.testNGTests;

import org.testng.TestNG;

public class TestNGSuite {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		TestNG testng = new TestNG();
		testng.setTestClasses(new Class[] { PowerWithDataProvidertest.class, TestGroups.class });
		testng.run();
	}

}
