package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage_pagefactory {
	
	
	@FindBy( linkText = "Log out")
	WebElement btn_logout;
	
	
	
	public void checkLogoutIsDisplayed()
	{
		btn_logout.isDisplayed() ;
	}
	
	WebDriver driver ; 
	public HomePage_pagefactory(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver ;
		PageFactory.initElements(driver, this);
	}
}
