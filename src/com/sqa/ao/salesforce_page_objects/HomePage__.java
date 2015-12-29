/**
 * 
 */
package com.sqa.ao.salesforce_page_objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Home page object
 * 
 * @author beast
 */
public class HomePage__ {
	private final static String HOME_PAGE_URL = "http://www.salesforce.com/sales-cloud/sales-performance-management.jsp";
	
	@FindBy(id = "button-login")
	private WebElement loginBtn;

	private WebDriver driver;

	public HomePage__(WebDriver driver) {
		this.driver = driver;
	}
	
	public HomePage__ navigateToHomePage(){
		driver.get(HOME_PAGE_URL);
		
		return this;
	}

	/**
	 * click on "Login" btn
	 * 
	 * @return Login__ page object
	 */
	public Login__ clickOnLoginBtn() {
		loginBtn.click();
		return PageFactory.initElements(driver, Login__.class);
	}

}
