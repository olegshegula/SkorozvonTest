/**
 * 
 */
package com.skorozvon.test.pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * @author shcegula-os
 *
 */
public class AccountPage extends Page {

	private WebDriver driver;

	public AccountPage(WebDriver driver) {
		
		super(driver);
		//this.driver = driver;
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath = "//a[@href='#leads']")
	private WebElement leads;

	/* (non-Javadoc)
	 * @see com.skorozvon.pages.Page#open()
	 */
	
	public boolean isPageOpened() {
		return leads.isDisplayed();
	}
	
	public LeadsPage clickMenuLeads(){
		leads.click();	
		return PageFactory.initElements(driver, LeadsPage.class);
	}

	@Override
	public void open() {
		// TODO Auto-generated method stub
		
	}

}
