/**
 * 
 */
package com.sqa.ao.salesforce_page_objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Reset password page object
 * 
 * @author beast
 *
 */
public class ResetPassword__ {
	@FindBy(id = "un")
	private WebElement emailInputField;

	@FindBy(how = How.LINK_TEXT, using = "Cancel")
	private WebElement cancelBtn;

	@FindBy(id = "continue")
	private WebElement continueBtn;

	private WebDriver driver;
	
	private final WebDriverWait wait;

	public ResetPassword__(WebDriver driver) {
		this.driver = driver;
		wait = new WebDriverWait(this.driver, 30);
	}

	/**
	 * type username in input field
	 * 
	 * @param username
	 * @return ResetPassword__ page object
	 */
	public ResetPassword__ type(String username) {
		wait.until(ExpectedConditions.visibilityOf(emailInputField));
		emailInputField.sendKeys(username);

		return this;
	}

	/**
	 * click on "Cancel" btn and navigate to "Login" page
	 * 
	 * @return Login__ page object
	 */
	public Login__ clickOnCancelBtn() {
		cancelBtn.click();

		return PageFactory.initElements(driver, Login__.class);
	}

	/**
	 * click on "Continue" btn and stay on the same page
	 * 
	 * @return ResetPassword__ page object
	 */
	public ResetPassword__ clickOnContinueAndStayOnTheSamePage() {
		continueBtn.click();

		return this;
	}

	/**
	 * click on "Continue" btn and navigate to "Confirmation" page
	 * 
	 * @return
	 */
	public Confirmation__ clickOnContinueAndNavigateToConfirmationPage() {
		continueBtn.click();

		return PageFactory.initElements(driver, Confirmation__.class);
	}
}
