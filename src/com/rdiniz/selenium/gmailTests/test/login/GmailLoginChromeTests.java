package com.rdiniz.selenium.gmailTests.test.login;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Test;
import org.openqa.selenium.By;

import com.rdiniz.selenium.gmailTests.pageObjects.GmailLoginPage;
import com.rdiniz.selenium.gmailTests.test.BaseTestChrome;
import com.rdiniz.selenium.gmailTests.constants.Constants;

public class GmailLoginChromeTests extends BaseTestChrome {
	
	By errorNoPassword = By.xpath(Constants.LOGIN_ERROR_MESSAGE_NO_PASSWORD_XPATH);
	By errorWrongPassword = By.xpath(Constants.LOGIN_ERROR_MESSAGE_WRONG_PASSWORD_XPATH);
	
	@Test
	public void testLoginWithoutPassword() {
		GmailLoginPage loginPage = new GmailLoginPage(driver);
		loginPage.goToLoginPage();
		loginPage.fillLoginWithoutPassword();
		assertTrue(loginPage.containsTxt(this.errorNoPassword, Constants.LOGIN_ERROR_MESSAGE_NO_PASSWORD));
	}
	
	@Test
	public void testSignUpWithWrongPassword() {
		GmailLoginPage loginPage = new GmailLoginPage(driver);
		loginPage.goToLoginPage();
		loginPage.fillLoginWithWrongPassword();
		assertTrue(loginPage.containsTxt(this.errorWrongPassword, Constants.LOGIN_ERROR_MESSAGE_WRONG_PASSWORD));
	}
	
}
