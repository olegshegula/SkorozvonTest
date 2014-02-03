package com.skorozvon.test.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage extends Page{
	
	private WebDriver driver;


	public LoginPage(WebDriver driver) {
		super(driver);		
		//this.driver = driver;
	}

	@FindBy(id = "email")
	private WebElement email;
	
	@FindBy(id = "password")
	private WebElement password;
	
	@FindBy(id = "login")
	private WebElement submit;
	
	public boolean isPageOpened() {
		return email.isDisplayed();
	}	

	public LoginPage enterEmail(String email_) {
		email.sendKeys(email_);
		return this;
	}

	public LoginPage enterPassword(String password_) {
		password.sendKeys(password_);
		return this;
	}

	public AccountPage clickLogin() {
		submit.click();
		return PageFactory.initElements(driver, AccountPage.class);
	}

	@Override
	public void open() {
		// TODO Auto-generated method stub
		
	}

	
}
