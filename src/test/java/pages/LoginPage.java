package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver  ;

	By txt_username = By.id("username");
	By txt_password = By.id("password");
	By btn_login = By.id("submit");
	By btn_logout =By.linkText("Log out") ;
	
	
	public void enterUsername(String username) {
		driver.findElement(txt_username).sendKeys(username);
	}

	public void enterPassword(String password) {
		driver.findElement(txt_password).sendKeys(password);

	}

	public void clickLogin() {
		driver.findElement(btn_login).click();

	}
	
	public void checkLogOutIsDisplayed() {
		driver.findElement(btn_logout).isDisplayed();

	}

	public void loginValidUser(String username, String password) {
		driver.findElement(txt_username).sendKeys(username);

		driver.findElement(txt_password).sendKeys(password);

		driver.findElement(btn_login).click();

	}
	
	
	
	
	public LoginPage(WebDriver driver)
	{
		System.out.println("driver Name -> "+driver);
		this.driver = driver;
		if(driver.getTitle().equals("Test Login | Practice Test Automation"))
		{
			throw new IllegalStateException("This is not Login page. And the Current page is " +driver.getCurrentUrl());
		}

//	 PageFactory.initElements(driver, this);
//	 if we use @FindBy anonation to initialize then we have to initialize the elements
	
	}
	
	

}
