
package com.sqa.ao.testNGTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SearchWithExplicitWaitTest {
	private final static long LONG_TIME_TO_WAIT = 30;
	private final static long SHORT_TIME_TO_WAIT = 5;
	private WebDriver driver;

	// WebElement wait;

	@Test
	public void seafoodSearch() {
		driver.get("https://www.google.com");
		WebElement element = null;
		element = waitForExpectedCondition(LONG_TIME_TO_WAIT, By.id("lst-ib"));
		// type into search input field
		element.sendKeys("seafood city");

		driver.findElement(By.name("btnG")).click();
		final String yelpText = "Yelp";
		// click on the link
		element = waitForExpectedCondition(SHORT_TIME_TO_WAIT, By.partialLinkText("Yelp"));
		element.click();

		waitForExpectedCondition(LONG_TIME_TO_WAIT, By.linkText(yelpText));
	}

	@BeforeMethod
	private void setup() {
		driver = new FirefoxDriver();
	}

	@AfterMethod
	private void tearDown() {
		driver.quit();
	}

	private WebElement waitForExpectedCondition(long timeInSecs, By locator) {
		WebDriverWait wait = new WebDriverWait(driver, timeInSecs);

		return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}
}