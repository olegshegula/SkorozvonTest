/**
 * 
 */
package com.skorozvon.test.pages;

import org.openqa.selenium.WebDriver;

/**
 * @author shcegula-os
 *
 */
public abstract class Page {

	public WebDriver driver;

	public Page(WebDriver driver) {
		this.driver = driver;
	}
	
public abstract void open();	

}
