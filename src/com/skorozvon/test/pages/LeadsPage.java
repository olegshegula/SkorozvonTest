package com.skorozvon.test.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeadsPage extends Page {

	private WebDriver driver;


	public LeadsPage(WebDriver driver) {
		super(driver);
		
		//this.driver = driver;
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(id = "add-entity]")
	private WebElement addentity;	
	
	@FindBy(id = "add-contact")
	private WebElement addcontact;	

	
	public boolean isPageOpened() {
		return addcontact.isDisplayed();
	}


	@Override
	public void open() {
		
		
	}
	
	
	public CreateContactPage addContact(){
		addentity.click();
		addcontact.click();
		return PageFactory.initElements(driver, CreateContactPage.class);
	}

}
