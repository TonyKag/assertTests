package com.sqa.ao.jutitTests;

import org.junit.ClassRule;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({ DataBaseTestOne.class, DataBaseTestTwo.class })
public class DataBaseTestSuite {
	@ClassRule
	public static Timeout timeout = new Timeout(6000);

}
