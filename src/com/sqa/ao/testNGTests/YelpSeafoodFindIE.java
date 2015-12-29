package com.sqa.ao.testNGTests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class YelpSeafoodFindIE {
	private WebDriver driver;

	@Test
	public void seafoodSearch() {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		// type into search input field
		driver.findElement(By.id("lst-ib")).sendKeys("seafood city");
		// click on "Search" btn
		driver.findElement(By.name("btnG")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		final String yelpText = "Yelp";
		// click on the link
		driver.findElement(By.partialLinkText("Yelp")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		Assert.assertTrue(driver.findElement(By.linkText(yelpText)).isDisplayed());
	}

	@BeforeMethod
	public void setup() {

		System.setProperty("webdriver.ie.driver", "D:\\Workspace\\assertTests\\drivers\\IEDriverServer.exe");
		driver = new InternetExplorerDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}