package com.rdiniz.selenium.gmailTests.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.rdiniz.selenium.gmailTests.constants.Constants;

public class GmailLoginPage extends BasePage {
	
	private static final String loginURL = "http://www.gmail.com";
	WebDriverWait wait;
	By userName = By.xpath(Constants.LOGIN_USERNAME_XPATH);
	By password = By.xpath(Constants.LOGIN_PASSWORD_XPATH);
	By nextButton = By.className(Constants.LOGIN_NEXT_BUTTON_CLASS);
	By passwordNextButton = By.xpath(Constants.LOGIN_PASSWORD_NEXT_BUTTON_XPATH);
	
	
	public GmailLoginPage(WebDriver driver) {
		super(driver);
		wait = new WebDriverWait (driver,50);
	}
	
	public void goToLoginPage() {
		driver.get(loginURL);
	}
	
	public void enterUserName() {
		writeText(this.userName, Constants.LOGIN_USERNAME);
	}
	
	public void enterPassword() {
		writeText(this.password, Constants.LOGIN_PASSWORD);
	}
	
	public void clickNextButton() {
		click(this.nextButton);
	}
	
	public void clickPasswordNextButton() {
		click(this.passwordNextButton);
	}
	
	public void fillLoginWithoutPassword() {
		enterUserName();
		clickNextButton();
		wait.until(ExpectedConditions.visibilityOfElementLocated(this.passwordNextButton));
		clickPasswordNextButton();
	}
	
	public void fillLoginWithWrongPassword() {
		enterUserName();
		clickNextButton();
		wait.until(ExpectedConditions.visibilityOfElementLocated(this.passwordNextButton));
		enterPassword();
		clickPasswordNextButton();
	}

}
