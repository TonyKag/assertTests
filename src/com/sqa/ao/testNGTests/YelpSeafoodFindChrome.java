package com.sqa.ao.testNGTests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class YelpSeafoodFindChrome {
	private WebDriver driver;

	@Test(enabled = false)
	public void cssSearch() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		// type into search input field
		driver.findElement(By.id("lst-ib")).sendKeys("seafood city");
		// click on "Search" btn
		driver.findElement(By.name("btnG")).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		final String yelpText = "Yelp";
		// click on the link
		driver.findElement(By.partialLinkText("Yelp")).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		Assert.assertTrue(driver.findElement(By.linkText(yelpText)).isDisplayed());
	}
	
	@Test(enabled = true)
	public void seafoodSearch() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		// type into search input field
		driver.findElement(By.id("lst-ib")).sendKeys("seafood city");
		// click on "Search" btn
		driver.findElement(By.name("btnG")).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		//final String yelpText = "Yelp";
		// click on the link
		driver.findElement(By.id("img#uid_0")).click();
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//Assert.assertTrue(driver.findElement(By.linkText(yelpText)).isDisplayed());
	}

	@BeforeMethod
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "D:\\Workspace\\assertTests\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.com");
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}