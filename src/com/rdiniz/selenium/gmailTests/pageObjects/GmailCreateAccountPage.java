package com.rdiniz.selenium.gmailTests.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.rdiniz.selenium.gmailTests.constants.Constants;

public class GmailCreateAccountPage extends BasePage {
	
	String createAccountURL = "https://accounts.google.com/SignUp?service=mail&continue=https://mail.google.com/mail/?pc=topnav-about-en";

	public GmailCreateAccountPage(WebDriver driver) {
		super(driver);
	}
	
	public void goToCreateAccountPage() {
		driver.get(createAccountURL);
	}
	
	public void enterFirstName(String firstName) {
		writeText(By.cssSelector(Constants.FIRST_NAME_CSS_SELECTOR), firstName);
	}
	
	public void enterLastName(String lastName) {
		writeText(By.cssSelector(Constants.LAST_NAME_CSS_SELECTOR), lastName);
	}
	
	public void enterUserName(String userName) {
		writeText(By.cssSelector(Constants.USER_NAME_CSS_SELECTOR), userName);
	}
	
	public void enterPassword(String password) {
		writeText(By.xpath(Constants.CREATE_ACCOUNT_PASSWORD_XPATH), password);
	}
	
	public void enterConfirmPassword(String confirmPassword) {
		writeText(By.xpath(Constants.CREATE_ACCOUNT_CONFIRM_PASSWORD_XPATH), confirmPassword);
	}
	
	public void clickOnNextButton() {
		click(By.className(Constants.CREATE_ACCOUNT_NEXT_BUTTON));
	}

	public void fillCreateAccountFormWithNoMatchingPassword(String firstName, String lastName,
										String userName, String password,
										String confirmPassword) {
		enterFirstName(firstName);
		enterLastName(lastName);
		enterUserName(userName);
		enterPassword(password);
		enterConfirmPassword(confirmPassword);
		clickOnNextButton();
	}
	
	public void fillCreateAccountFormWithoutLastName(String firstName, String userName, String password) {
		enterFirstName(firstName);
		enterUserName(userName);
		enterPassword(password);
		enterConfirmPassword(password);
		clickOnNextButton();
	}

}
