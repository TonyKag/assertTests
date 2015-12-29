/**
 * File Name: ResetPasswordTest.java<br>
 * Asfour, Rania<br>
 * Java Boot Camp Exercise<br>
 * Instructor: Jean-francois Nepton<br>
 * Created: Nov 7, 2015
 */
package com.sqa.ao.testNGTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * ResetPasswordTest //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 * 
 * @author Asfour, Rania
 * @version 1.0.0
 * @since 1.0
 */
public class ResetPasswordTest_Latest {

	private final static long LONG_TIME_TO_WAIT = 30;

	private final static long SHORT__TIME_TO_WAIT = 5;

	private WebDriver driver;

	@Test
	public void resetPass() {
		// launch google.com
		driver.get("http://www.salesforce.com/sales-cloud/");
		WebElement element = null;

		element = waitForVisibilityOfElement(LONG_TIME_TO_WAIT, By.id("button-login"));
		element.click();
		element = waitForVisibilityOfElement(LONG_TIME_TO_WAIT, By.linkText("Forgot Your Password?"));
		element.click();
		element = waitForVisibilityOfElement(LONG_TIME_TO_WAIT, By.id("un"));

		element.sendKeys("tester123@test.com");
		driver.findElement(By.id("continue")).click();
		
		final String mesg1 = "We’ve sent you an email with a link to finish resetting your password.";
		final String mesg2 = "Can’t find the email? Try checking your spam folder.";
		final String errorMessage = "Expected error doesn't natch with actual";
		/////////////////////////1 way////////////////////
		Assert.assertEquals(driver.findElement(By.className("message")).getText(), "We’ve sent you an email with a link to finish resetting your password.\n" + "Can’t find the email? Try checking your spam folder.\n" + "If you still can’t log in, have us resend the email or contact your Salesforce administrator.", errorMessage);

		////////////////////////2 way/////////////////////
		AssertJUnit.assertTrue(errorMessage, driver.getPageSource().contains(mesg1));
		AssertJUnit.assertTrue(errorMessage, driver.getPageSource().contains(mesg2));
		AssertJUnit.assertTrue(errorMessage, driver.getPageSource().contains("If you still can’t log in"));
		AssertJUnit.assertTrue(errorMessage, driver.getPageSource().contains("or contact your Salesforce administrator."));
		
		/////////////////////////3way///////////////////
		  String expected1 = driver.findElement(By.xpath(".//div[@id='forgotPassForm']/div/p[1]")).getText();
		  String expected2 = driver.findElement(By.xpath(".//div[@id='forgotPassForm']/div/p[2]")).getText();
		  Assert.assertEquals(mesg1, expected1, errorMessage);
		  Assert.assertEquals(mesg2, expected2, errorMessage);
		  
		  /////////////////////4 way/////////////////
		  //use findElements by css or class name
	}

	@BeforeMethod
	private void Setup() {
		// create a firefox driver to
		// drive the Browser
		driver = new FirefoxDriver();
	}

	@AfterMethod
	// quit quits the browser instead close
	private void tearDown() {
		driver.quit();
	}

	// Create a helper method for wait for expected conditions
	private WebElement waitForVisibilityOfElement(long time, By locator) {
		WebDriverWait wait = new WebDriverWait(driver, time);
		return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}
}