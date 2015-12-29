/**
 * 
 */
package com.sqa.ao.salesforce_page_objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Confirmation page object
 * 
 * @author beast
 *
 */
public class Confirmation__ {
	@FindBy(id = "resend-email")
	private WebElement resendTheEmailLink;

	@FindBy(className = "message")
	private WebElement messageContainer;

	private WebDriver driver;

	public Confirmation__(WebDriver driver) {
		this.driver = driver;
	}

	/**
	 * click on "resend the email" link
	 * 
	 * @return ResetPassword__ page object
	 */
	public ResetPassword__ clickOnResendTheEmailLink() {
		resendTheEmailLink.click();

		return PageFactory.initElements(driver, ResetPassword__.class);
	}

	/**
	 * 
	 * @return confirmation message
	 */
	public String getConfirmationMessage() {
		return messageContainer.getText();
	}

}
