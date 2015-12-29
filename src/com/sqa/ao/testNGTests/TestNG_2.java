/**
 *   File Name: TestNG_2.java<br>
 *
 *   Yutaka<br>
 *   Java Boot Camp Exercise<br>
 *   Instructor: Jean-francois Nepton<br>
 *   Created: Oct 31, 2015
 *   
 */

package com.sqa.ao.testNGTests;

import java.util.ArrayList;
import java.util.List;

import org.testng.TestNG;
import org.testng.annotations.Test;

public class TestNG_2 {
	@Test
	public void runTestNGTest() {

		// Create an instance on TestNG
		TestNG myTestNG = new TestNG();
		List<String> file = new ArrayList<String>();
		file.add("D:\\Workspace\\assertTests\\groups.xml");
		myTestNG.setTestSuites(file);
		// invoke run() - this will run your test suites.
		myTestNG.run();
	}

}