package com.rdiniz.selenium.gmailTests.constants;

public class Constants {

	public static final String FIRST_NAME_CSS_SELECTOR = "#firstName";
	public static final String LAST_NAME_CSS_SELECTOR = "#lastName";
	public static final String USER_NAME_CSS_SELECTOR = "#username";
	public static final String CREATE_ACCOUNT_PASSWORD_XPATH = "//input[@name='Passwd']";
	public static final String CREATE_ACCOUNT_CONFIRM_PASSWORD_XPATH = "//input[@name='ConfirmPasswd']";
	public static final String CREATE_ACCOUNT_NEXT_BUTTON = "CwaK9";
	public static final String PASSWORD_DIDNT_MATCH_MESSAGE = "Essas senhas não coincidem. Tentar novamente.";
	public static final String PASSWORD_DIDNT_MATCH_MESSAGE_XPATH = "/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/form[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[3]/div[1]/div[1]/div[2]/div[2]";
	public static final String NO_LAST_NAME_MESSAGE = "Digite o sobrenome";
	public static final String NO_LAST_NAME_MESSAGE_XPATH = "/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/form[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]";
	
	public static final String FIRST_NAME = "Automated";
	public static final String LAST_NAME = "Test";
	public static final String USERNAME = "automatedtestselenium123";
	public static final String PASSWORD = "password";
	public static final String NOT_MATCHING_PASSWORD = "notMatchingPassword";
	
	public static final String LOGIN_USERNAME_XPATH = "//input[@id='identifierId']";
	public static final String LOGIN_NEXT_BUTTON_CLASS = "CwaK9";
	public static final String LOGIN_PASSWORD_NEXT_BUTTON_XPATH = "//div[@id='passwordNext']//content[@class='CwaK9']";
	public static final String LOGIN_PASSWORD_XPATH = "//input[@name='password']";
	public static final String LOGIN_ERROR_MESSAGE_NO_PASSWORD = "Digite uma senha";
	public static final String LOGIN_ERROR_MESSAGE_NO_PASSWORD_XPATH = "//div[contains(text(),'Digite uma senha')]";
	public static final String LOGIN_USERNAME = "automatedtest2018@gmail.com";
	public static final String LOGIN_PASSWORD = "testPassword";
	
}
