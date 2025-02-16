package pageFactory;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class LoginPage_PageFactory {

	@FindBy(id = "username")
	@CacheLookup  // using CacheLookUp to store the elememts Object in memory 
	WebElement txt_username ;
	
	@FindBy(id = "password")
	@CacheLookup 
	WebElement txt_password ;
	
	@FindBy(id = "submit")
	@CacheLookup
	WebElement btn_login ;
	
	
	@FindBy(tagName = "a")
	List<WebElement> MyLinks ;
	
	@FindBy(how = How.ID,using = "username") 
	WebElement username2 ;
	
	
	
	
	
	public void enterUserName(String userName)
	{
		txt_username.sendKeys(userName);	
	}
	
	public void enterPassword(String Password)
	{
		txt_password.sendKeys(Password);	
	}
	
	public void clickLogin()
	{
		btn_login.click();
	}
	
	
	
WebDriver driver ;
	
	public LoginPage_PageFactory(WebDriver driver)
	{
		this.driver = driver ;
		
		//using Ajex to set TimeOut for Webelment Element
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 30 );
		PageFactory.initElements(factory, this);
//		PageFactory.initElements(driver, this);

	}
	
	



}



//
//
//WebDriver driver  ;
//
//By txt_username = By.id("username");
//By txt_password = By.id("password");
//By btn_login = By.id("submit");
//By btn_logout =By.linkText("Log out") ;
//
//
//public void enterUsername(String username) {
//	driver.findElement(txt_username).sendKeys(username);
//}
//
//public void enterPassword(String password) {
//	driver.findElement(txt_password).sendKeys(password);
//
//}
//
//public void clickLogin() {
//	driver.findElement(btn_login).click();
//
//}
//
//public void checkLogOutIsDisplayed() {
//	driver.findElement(btn_logout).isDisplayed();
//
//}
//
//public void loginValidUser(String username, String password) {
//	driver.findElement(txt_username).sendKeys(username);
//
//	driver.findElement(txt_password).sendKeys(password);
//
//	driver.findElement(btn_login).click();
//
//}
//
//
//
//
//public LoginPage(WebDriver driver)
//{
//	System.out.println("driver Name -> "+driver);
//	this.driver = driver;
//	if(driver.getTitle().equals("Test Login | Practice Test Automation"))
//	{
//		throw new IllegalStateException("This is not Login page. And the Current page is " +driver.getCurrentUrl());
//	}
//
//// PageFactory.initElements(driver, this);
//// if we use @FindBy anonation to initialize then we have to initialize the elements
//
//}