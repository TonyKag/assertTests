/**
 * 
 */
package com.sqa.ao.salesforce_test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.sqa.ao.salesforce_page_objects.Confirmation__;
import com.sqa.ao.salesforce_page_objects.HomePage__;
import com.sqa.ao.salesforce_page_objects.Login__;
import com.sqa.ao.salesforce_page_objects.ResetPassword__;

/**
 * @author beast
 *
 */
public class ResetPasswordTest {
	private WebDriver driver;

	@BeforeMethod
	public void createInstanceOfFirefox() {
		driver = new FirefoxDriver();
	}

	@AfterMethod
	public void quitInsanceOfFirefox() {
		driver.quit();
	}

	@Test
	public void resetPassword() {
		
//		char myCharVar2 = 'n';
//		byte myByteVar2 = 12;
//		short myShortVar2 = -32_768;
//		int myIntVar2 = 1_102_638_251;
//		long myLongVar2 = 3_212_254_265_847_044_902L;
//		float myFloatVar2 = 1.4013642F;
//		double myDoubleVar2 = 4.252_216_527_265_915;
//		boolean myBooleanVar2 = true;

		
//		System.out.println(		
//		myCharVar2 + "\n" +
//		myByteVar2 + "\n" +
//		myShortVar2 + "\n" +
//		myIntVar2 + "\n" +
//		myLongVar2 + "\n" +
//		myFloatVar2 + "\n" +
//		myDoubleVar2 + "\n" +
//		myBooleanVar2 + "\n");

		
		HomePage__ homePage = PageFactory
				.initElements(driver, HomePage__.class);
		
		// navigate to "Home" page
		homePage.navigateToHomePage();
		
		//click on "Login" btn
		Login__ loginPage = homePage.clickOnLoginBtn();
		
		// click on "Forgot your password" link
		ResetPassword__ resetPasswordPage = loginPage
				.clickOnForgotPasswordLink();
		final String username = "blah@blah.com";
		
		// type username
		resetPasswordPage.type(username);
		
		// click on "Continue" btn
		Confirmation__ confirmationPage = resetPasswordPage
				.clickOnContinueAndNavigateToConfirmationPage();
		final String actualConfirmationMessage = "We've sent you an email with a link to finish resetting your password.\n"
				+ "Can't find the email? Try checking your spam folder.\n"
				+ "If you still can't log in, have us resend the email or contact your Salesforce administrator.";
		
		// assert confirmation message
		AssertJUnit.assertEquals(
				"Expected confirmation message doesn't match expected one",
				confirmationPage.getConfirmationMessage(),
				actualConfirmationMessage);
	}
}
