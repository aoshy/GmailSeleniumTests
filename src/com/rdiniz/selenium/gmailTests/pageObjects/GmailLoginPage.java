package com.rdiniz.selenium.gmailTests.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.rdiniz.selenium.gmailTests.constants.Constants;

public class GmailLoginPage extends BasePage {
	
	private static final String loginURL = "http://www.gmail.com";
	WebDriverWait wait;

	public GmailLoginPage(WebDriver driver) {
		super(driver);
		wait = new WebDriverWait (driver,50);
	}
	
	public void goToLoginPage() {
		driver.get(loginURL);
	}
	
	public void enterUserName() {
		writeText(By.xpath(Constants.LOGIN_USERNAME_XPATH), Constants.LOGIN_USERNAME);
	}
	
	public void enterPassword() {
		writeText(By.xpath(Constants.LOGIN_PASSWORD_XPATH), Constants.LOGIN_PASSWORD);
	}
	
	public void clickNextButton() {
		click(By.className(Constants.LOGIN_NEXT_BUTTON_CLASS));
	}
	
	public void clickPasswordNextButton() {
		click(By.xpath(Constants.LOGIN_PASSWORD_NEXT_BUTTON_XPATH));
	}
	
	public void fillLoginWithoutPassword() {
		enterUserName();
		clickNextButton();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Constants.LOGIN_PASSWORD_NEXT_BUTTON_XPATH)));
		clickPasswordNextButton();
	}

}
