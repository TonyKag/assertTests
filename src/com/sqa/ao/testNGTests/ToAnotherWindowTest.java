/**
 *   File Name: ToAnotherWindowTest.java<br>
 *
 *   Yutaka<br>
 *   Java Boot Camp Exercise<br>
 *   Instructor: Jean-francois Nepton<br>
 *   Created: Nov 7, 2015
 *   
 */

package com.sqa.ao.testNGTests;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import junit.framework.Assert;

/**
 * ToAnotherWindowTest //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 * 
 * @author Yutaka
 * @version 1.0.0
 * @since 1.0
 *
 */
public class ToAnotherWindowTest {
	private final static long LONG_TIME_TO_WAIT = 30;
	private final static long MIDDLE_TIME_TO_WAIT = 15;
	private final static long SHOR_TIME_TO_WAIT = 5;

	private WebDriver driver;

	@Test
	public void resetPass() {
		// launch google.com
		driver.get("http://www.salesforce.com/sales-cloud/");
		WebElement element = null;

		element = waitForVisibilityOfElement(LONG_TIME_TO_WAIT, By.id("button-login"));
		element.click();

		element = waitForVisibilityOfElement(MIDDLE_TIME_TO_WAIT, By.id("signup_link"));
		element.click();

		element = waitForVisibilityOfElement(SHOR_TIME_TO_WAIT, By.cssSelector(
				"div#layout div.serviceBtn-container>div.social-signin-rows.vert:first-child span.service"));
		element.click();

		ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs2.get(1));

		element = waitForVisibilityOfElement(SHOR_TIME_TO_WAIT, By.cssSelector("div.logo.logo-w"));
		System.out.println("aria-label" + element.getAttribute("aria-label"));
		Assert.assertEquals("Google", element.getAttribute("aria-label"));
		driver.close();
		driver.switchTo().window(tabs2.get(0));
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