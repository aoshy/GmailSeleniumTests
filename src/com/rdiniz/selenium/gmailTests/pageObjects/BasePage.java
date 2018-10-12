package com.rdiniz.selenium.gmailTests.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
	protected WebDriver driver;
	
	public BasePage(WebDriver driver) {
		this.driver = driver;
	}

	//Click Method
    public void click (By elementLocation) {
        driver.findElement(elementLocation).click();
    }
 
    //Write Text
    public void writeText (By elementLocation, String text) {
        driver.findElement(elementLocation).sendKeys(text);
    }
 
    //Read Text
    public String readText (By elementLocation) {
        return driver.findElement(elementLocation).getText();
    }
    
    //method to check if a message appear on the page
  	public boolean containsTxt(By type, String txt) {
  	
  		WebDriverWait wait = new WebDriverWait (driver, 90);
  		wait.until(ExpectedConditions.textToBePresentInElementLocated(type, txt));
  		
  		return driver.getPageSource().contains(txt);
  	}
	
}
