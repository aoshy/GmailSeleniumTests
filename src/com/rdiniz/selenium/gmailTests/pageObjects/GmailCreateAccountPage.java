package com.rdiniz.selenium.gmailTests.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.rdiniz.selenium.gmailTests.constants.Constants;

public class GmailCreateAccountPage extends BasePage {
	
	String createAccountURL = "https://accounts.google.com/SignUp?service=mail&continue=https://mail.google.com/mail/?pc=topnav-about-en";
	By firstName = By.cssSelector(Constants.FIRST_NAME_CSS_SELECTOR);
	By lastName = By.cssSelector(Constants.LAST_NAME_CSS_SELECTOR);
	By userName = By.cssSelector(Constants.USER_NAME_CSS_SELECTOR);
	By password = By.xpath(Constants.CREATE_ACCOUNT_PASSWORD_XPATH);
	By confirmPassword = By.xpath(Constants.CREATE_ACCOUNT_CONFIRM_PASSWORD_XPATH);
	By nextButton = By.className(Constants.CREATE_ACCOUNT_NEXT_BUTTON);

	public GmailCreateAccountPage(WebDriver driver) {
		super(driver);
	}
	
	public void goToCreateAccountPage() {
		driver.get(createAccountURL);
	}
	
	public void enterFirstName() {
		writeText(this.firstName, Constants.FIRST_NAME);
	}
	
	public void enterLastName() {
		writeText(this.lastName, Constants.LAST_NAME);
	}
	
	public void enterUserName() {
		writeText(this.userName, Constants.USERNAME);
	}
	
	public void enterPassword(String password) {
		writeText(this.password, password);
	}
	
	public void enterConfirmPassword(String confirmPassword) {
		writeText(this.confirmPassword, confirmPassword);
	}
	
	public void clickOnNextButton() {
		click(this.nextButton);
	}

	public void fillCreateAccountFormWithNoMatchingPassword(String password, String confirmPassword) {
		enterFirstName();
		enterLastName();
		enterUserName();
		enterPassword(password);
		enterConfirmPassword(confirmPassword);
		clickOnNextButton();
	}
	
	public void fillCreateAccountFormWithoutLastName(String password) {
		enterFirstName();
		enterUserName();
		enterPassword(password);
		enterConfirmPassword(password);
		clickOnNextButton();
	}

}
