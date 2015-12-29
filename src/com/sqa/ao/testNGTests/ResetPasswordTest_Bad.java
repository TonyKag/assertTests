/**
 *   File Name: ResetPasswordTest.java<br>
 *
 *   Yutaka<br>
 *   Java Boot Camp Exercise<br>
 *   Instructor: Jean-francois Nepton<br>
 *   Created: Nov 12, 2015
 *   
 */

package com.sqa.ao.testNGTests;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.sqa.ao.salesforce_page_objects.Confirmation__;
import com.sqa.ao.salesforce_page_objects.HomePage__;
import com.sqa.ao.salesforce_page_objects.Login__;
import com.sqa.ao.salesforce_page_objects.ResetPassword__;

/**
 * ResetPasswordTest //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 * 
 * @author      Yutaka
 * @version     1.0.0
 * @since       1.0
 *
 */
public class ResetPasswordTest_Bad {
	private WebDriver driver;
	
	@BeforeMethod
	public void createInstanceOfFirefox() {
		driver = new FirefoxDriver();
	}

	@AfterMethod
	public void quitInstanceOfFireFox() {
		driver.quit();
	}
	
	@Test
	public void resetPassword() {
		HomePage__ homePage = PageFactory.initElements(driver, HomePage__.class);
		//navigate to "home" page
		homePage.navigateToHomePage();
		Login__ loginPage = homePage.clickOnLoginBtn();
		ResetPassword__ resetPasswordPage = loginPage.clickOnForgotPasswordLink();
		final String username = "sdfgd@sdfsdf.com";
		resetPasswordPage.type(username);
		Confirmation__ confirmationPage = resetPasswordPage.clickOnContinueAndNavigateToConfirmationPage();
		final String actualConfirmationMessage = "We’ve sent you an email with a link to finish resetting your password.\n"
			    + "Can’t find the email? Try checking your spam folder.\n"
			    + "If you still can’t log in, have us resend the email or contact your Salesforce administrator.";
			  AssertJUnit.assertEquals(
					  "Expected confirmation message doesn't match expected one",
					  confirmationPage.getConfirmationMessage(),
					  actualConfirmationMessage);
	}
}
