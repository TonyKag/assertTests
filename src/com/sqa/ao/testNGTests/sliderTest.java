/**
 *   File Name: sliderTest.java<br>
 *
 *   Yutaka<br>
 *   Java Boot Camp Exercise<br>
 *   Instructor: Jean-francois Nepton<br>
 *   Created: Nov 11, 2015
 *   
 */

package com.sqa.ao.testNGTests;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class sliderTest {
	
	private final static long LONG_TIME_TO_WAIT = 30;
	private final static long MIDDLE_TIME_TO_WAIT = 15;
	private final static long SHOR_TIME_TO_WAIT = 5;

	private WebDriver driver;
	
	@Test(enabled=false)
	public void slider() {
		
		// launch http://jqueryui.com/slider/
		driver.get("http://jqueryui.com/slider/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		new Actions(driver).dragAndDropBy(driver.findElement(By.cssSelector("span.ui-slider-handle.ui-state-default.ui-corner-all")), 120, 0).build().perform();		
	}

	@Test(enabled=false)
	public void draggable() {
		
		// launch http://jqueryui.com/draggable/
		driver.get("http://jqueryui.com/draggable/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		new Actions(driver).dragAndDropBy(driver.findElement(By.id("draggable")), 120, 120).build().perform();		
	}
	
	@Test(enabled=false)
	public void droppable() {
		
		// launch http://jqueryui.com/droppable/
		driver.get("http://jqueryui.com/droppable/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		WebElement draggable = driver.findElement(By.id("draggable"));
		WebElement droppable = driver.findElement(By.id("droppable"));
		new Actions(driver).dragAndDrop(draggable, droppable).build().perform();
	}
	
	@Test(enabled=false)
	public void resizableHorizontal() throws InterruptedException {
		
		// launch http://jqueryui.com/resizable/
		driver.get("http://jqueryui.com/resizable/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		WebElement resizable = driver.findElement(By.id("resizable"));
		new Actions(driver).dragAndDropBy(resizable, 120, 0).build().perform();
//		new Actions(driver).dragAndDropBy(resizable, 0, 120).build().perform();
//		new Actions(driver).dragAndDropBy(resizable, 120, 120).build().perform();
	}
	
	@Test(enabled=false)
	public void resizableVertical() {
		
		// launch http://jqueryui.com/resizable/
		driver.get("http://jqueryui.com/resizable/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		WebElement resizable = driver.findElement(By.id("resizable"));
		new Actions(driver).dragAndDropBy(resizable, 0, 120).build().perform();
	}
	
	@Test(enabled=false)
	public void resizableDiagonal() {
		
		// launch http://jqueryui.com/resizable/
		driver.get("http://jqueryui.com/resizable/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		WebElement resizable = driver.findElement(By.id("resizable"));
		new Actions(driver).dragAndDropBy(resizable, 120, 120).build().perform();
	}
	
	@Test(enabled=false)
	public void selectableAll() {
		
		// launch http://jqueryui.com/selectable/
		driver.get("http://jqueryui.com/selectable/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		List < WebElement > listItems = driver.findElements(By.cssSelector("ol#selectable *"));
		new Actions(driver).clickAndHold(listItems.get(0)).click().clickAndHold(listItems.get(1)).click().clickAndHold(listItems.get(2)).click().clickAndHold(listItems.get(3)).click().clickAndHold(listItems.get(4)).click().clickAndHold(listItems.get(5)).click().clickAndHold(listItems.get(6)).click().sendKeys(Keys.CONTROL).build().perform();
	}
	
	@Test(enabled=false)
	public void selectableSome() {
		
		// launch http://jqueryui.com/selectable/
		driver.get("http://jqueryui.com/selectable/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		List < WebElement > listItems = driver.findElements(By.cssSelector("ol#selectable *"));
		new Actions(driver).clickAndHold(listItems.get(1)).moveToElement(listItems.get(4)).keyUp(Keys.CONTROL).build().perform();
		
	}
	
	@Test(enabled=true)
	public void sortable() {
		
		// launch http://jqueryui.com/sortable/
		driver.get("http://jqueryui.com/sortable/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		List < WebElement > listItems = driver.findElements(By.cssSelector("ol#sortable li"));
		System.out.println(listItems.get(0).toString());
		System.out.println(listItems.get(1).toString());
//		System.out.println(listItems.get(2).toString());
//		System.out.println(listItems.get(3).toString());
//		System.out.println(listItems.get(4).toString());
//		System.out.println(listItems.get(5).toString());
//		System.out.println(listItems.get(6).toString());
		
	  //new Actions(driver).clickAndHold(listItems.get(1)).moveToElement(listItems.get(4)).click(listItems.get(4)).build().perform();
		
		new Actions(driver).clickAndHold(listItems.get(1)).pause(400).moveToElement(listItems.get(4)).release(listItems.get(4)).pause(400).perform();
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
