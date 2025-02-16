package StepDefination;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;

public class LoginDemoSteps_POM {
	
//	//////
//	WebDriver driver = null;
//	 WebDriverWait wait = null;
//	 LoginPage login ; 
//	
//
//@Given("browser is open")
//public void browser_is_open() {
//	System.out.println("=== Browser is Open from LoginDemoSteps_POM ===" );
//	
//	String projectPath = System.getProperty("user.dir") ;
//	System.out.println("Project Path"+projectPath);	
//	System.setProperty("webdriver.chrome.driver",
//				projectPath+"/src/test/resources/drivers/chromedriver.exe");
//
//		driver = new ChromeDriver();
//		System.out.println("driver Name -> "+driver);
//	
//		login= new LoginPage(driver) ;
//		
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)) ;
//		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
//		 wait = new WebDriverWait(driver, Duration.ofSeconds(10)) ;
//	
//}
//
//@And("User is on Login Page")
//public void user_is_on_login_page() {
//  driver.get("https://practicetestautomation.com/practice-test-login/");
//}
//
//@When("^User enters (.*) and (.*)$")
//public void user_enters_username_and_password(String username, String Password) {
////	driver.findElement(By.id("username")).sendKeys(username);
////	driver.findElement(By.id("password")).sendKeys(Password);
//	
//	System.out.println("driver Name -> "+driver);
//	
//	login.enterUsername(username);
//	login.enterPassword(Password);
//	     
//}
//
//@And("User Click on Login")
//public void user_click_on_login() {
////	driver.findElement(By.id("submit")).click();
//	login.clickLogin();
//}
//
//
//@Then("User is navigated to the home page")
//public void user_is_navigated_to_the_home_page() {
////	driver.findElement(By.linkText("Log out")) ;
////    driver.getPageSource().contains("Log out") ;
//    
//	login.checkLogOutIsDisplayed();
//	
//    driver.close();
//    driver.quit();
//    
//
//}
//	
//	
//	
//	/////
	
	

}
