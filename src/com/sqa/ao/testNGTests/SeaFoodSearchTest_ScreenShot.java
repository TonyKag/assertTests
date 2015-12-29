package com.sqa.ao.testNGTests;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.Augmenter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * 
 * @author
 * @version 1.0
 */
public class SeaFoodSearchTest_ScreenShot {
	private WebDriver driver;

	/**
	 * launches instance of Firefox
	 */
	@BeforeMethod
	public void setup() {
		driver = new FirefoxDriver();
	}

	/**
	 * quits instance of Firefox
	 */
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

	/**
	 * test different web sites and taking screenshots
	 * 
	 * @throws IOException
	 */
	@Test
	public void testSearchSeafood() throws IOException {
		String timeStamp = null;
		driver.get("https://www.google.com/");
		timeStamp = getTimestamp();
		takeScreenshot(timeStamp);
		driver.get("https://www.dropbox.com");
		timeStamp = getTimestamp();
		takeScreenshot(timeStamp);
	}

	/**
	 * 
	 * 
	 * @return timestamp in the format MMddyyyyhhmm
	 */
	private String getTimestamp() {
		String pattern = "MMddyyyyhhmmss";
		SimpleDateFormat format = new SimpleDateFormat(pattern);
		Date date = new Date();
		return format.format(date);
	}

	/**
	 * 
	 * @param ts
	 *            - timestamp
	 * @throws IOException
	 */
	private void takeScreenshot(String ts) throws IOException {
		WebDriver augmentedDriver = new Augmenter().augment(driver);
		File source = ((TakesScreenshot) augmentedDriver)
				.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(source, new File("/Users/beast/Documents/"
				+ "screenshot" + ts + ".png"));
	}

}
