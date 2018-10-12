package com.rdiniz.selenium.gmailTests;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTestChrome implements BaseTest {
	
	protected WebDriver driver;
	
		public BaseTestChrome() {
			System.setProperty("webdriver.chrome.driver", "/Users/rdiniz/workspace/selenium-stuff/chromedriver");
		}

		@Override 
		@Before
		public void setUp() {
			driver = new ChromeDriver();
		}

		@Override
		@After
		public void tearDown() {
			driver.quit();
		}
	


}
