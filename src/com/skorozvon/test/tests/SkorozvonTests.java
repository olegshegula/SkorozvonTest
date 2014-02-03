/**
 * 
 */
package com.skorozvon.test.tests;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.skorozvon.test.data.RegistrationData;
import com.skorozvon.test.pages.AccountPage;
import com.skorozvon.test.pages.CreateContactPage;
import com.skorozvon.test.pages.LeadsPage;
import com.skorozvon.test.pages.LoginPage;

/**
 * @author Oleg
 *
 */

//@Listeners(com.skorozvon.listener.Screenshot.class)
public class SkorozvonTests extends com.skorozvon.test.core.SelTestCase {
	
	@Test (dataProvider = "registrationCSVData", dataProviderClass = RegistrationData.class)
	public void testCreateContact(RegistrationData registrationData)  {		
		
		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);	
		Assert.assertTrue(loginPage.isPageOpened());
		loginPage.enterEmail("stqa.gm@gmail.com");
		loginPage.enterPassword("162534");
		loginPage.clickLogin();		
		
		AccountPage accountPage = PageFactory.initElements(driver, AccountPage.class);
		Assert.assertTrue(accountPage.isPageOpened());
		accountPage.clickMenuLeads();
		
		LeadsPage leadsPage = PageFactory.initElements(driver, LeadsPage.class);		
		leadsPage.addContact();
		
		
		//createPage.createNewContact(registrationData);			
		
	}
	
}
