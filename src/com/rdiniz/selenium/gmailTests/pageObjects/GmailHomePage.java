package com.rdiniz.selenium.gmailTests.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GmailHomePage extends BasePage {

	String baseURL = "http://www.gmail.com/";
    String createAccountButtonXpath = "//a[@class='gmail-nav__nav-link gmail-nav__nav-link__create-account']";
    
	public GmailHomePage(WebDriver driver) {
		super(driver);
	}
	
	public void goToGmailHome() {
		driver.get(baseURL);
	}
	
	public void goToCreateAccountPage() {
		click(By.xpath(createAccountButtonXpath));
	}

}
