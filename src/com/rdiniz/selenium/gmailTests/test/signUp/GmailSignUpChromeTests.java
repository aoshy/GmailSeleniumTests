package com.rdiniz.selenium.gmailTests.test.signUp;

import org.junit.Test; // for @Test
import static org.junit.Assert.assertTrue;
import org.openqa.selenium.By;

import com.rdiniz.selenium.gmailTests.constants.Constants;
import com.rdiniz.selenium.gmailTests.pageObjects.GmailCreateAccountPage;
import com.rdiniz.selenium.gmailTests.test.BaseTestChrome;

public class GmailSignUpChromeTests extends BaseTestChrome {
	
	@Test
	public void testSignUpWithWrongEmailConfirmation() {
		GmailCreateAccountPage createAccount = new GmailCreateAccountPage(driver);
		createAccount.goToCreateAccountPage();
		createAccount.fillCreateAccountFormWithNoMatchingPassword(Constants.PASSWORD, Constants.NOT_MATCHING_PASSWORD);
		
		assertTrue(createAccount.containsTxt(By.xpath(Constants.PASSWORD_DIDNT_MATCH_MESSAGE_XPATH), Constants.PASSWORD_DIDNT_MATCH_MESSAGE));	
	}
	
	@Test
	public void testSignUpWithoutLastName() {
		GmailCreateAccountPage createAccount = new GmailCreateAccountPage(driver);
		createAccount.goToCreateAccountPage();
		createAccount.fillCreateAccountFormWithoutLastName(Constants.PASSWORD);
		
		assertTrue(createAccount.containsTxt(By.xpath(Constants.NO_LAST_NAME_MESSAGE_XPATH), Constants.NO_LAST_NAME_MESSAGE));
	}

}
