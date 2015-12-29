/**
 * 
 */
package com.sqa.ao.salesforce_page_objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Login page object
 * 
 * @author beast
 *
 */
public class Login__ {
	@FindBy(id = "username")
	private WebElement usernameInputField;

	@FindBy(id = "password")
	private WebElement passwordInputField;

	@FindBy(id = "Login")
	private WebElement loginBtn;

	@FindBy(id = "forgot_password_link")
	private WebElement forgotPasswordLink;

	private WebDriver driver;

	public Login__(WebDriver driver) {
		this.driver = driver;
	}

	/**
	 * type username into input field
	 * 
	 * @param username
	 * @return Login__ page object
	 */
	public Login__ typeUsername(String username) {
		usernameInputField.sendKeys(username);

		return this;
	}

	/**
	 * type password into input field
	 * 
	 * @param password
	 * @return Login__ page object
	 */
	public Login__ typePassword(String password) {
		passwordInputField.sendKeys(password);

		return this;
	}

	/**
	 * click on "Login" btn and navigate to "User Account" page
	 * 
	 * @return UserAccount__ page object
	 */
	public UserAccount__ clickOnLoginBtnAndNavigateToAccountPage() {
		loginBtn.click();

		return PageFactory.initElements(driver, UserAccount__.class);
	}

	/**
	 * click on "Login" btn and stay on the same page Recommended to use for
	 * negative test scenarios
	 * 
	 * @return Login__ page object
	 */
	public Login__ clickOnLoginBtnAndStayOnTheSamePage() {
		loginBtn.click();

		return this;
	}

	/**
	 * click on "Forgot your password" link
	 * 
	 * @return ResetPassword__ page object
	 */
	public ResetPassword__ clickOnForgotPasswordLink() {
		forgotPasswordLink.click();

		return PageFactory.initElements(driver, ResetPassword__.class);
	}

}
