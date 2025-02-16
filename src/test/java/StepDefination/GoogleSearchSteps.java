package StepDefination;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleSearchSteps {
	
	 WebDriver driver = null;
	 WebDriverWait wait = null;
	 
	@Given("brower is open")
	public void brower_is_open()
	{
		
		System.out.println("Inside Step - Browser is Open");
		
	String projectPath = System.getProperty("user.dir") ;
	System.out.println("Project Path"+projectPath);	
	System.setProperty("webdriver.chrome.driver",
				projectPath+"/src/test/resources/drivers/chromedriver.exe");

		driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)) ;
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		 wait = new WebDriverWait(driver, Duration.ofSeconds(10)) ;
				
	}
	
	@And("User is on google search page")
	public void User_is_on_google_search_page()
	{
		driver.navigate().to("https://www.youtube.com/watch?v=-fkMEj7wrAk&list=PLhW3qG5bs-L_mFHirOLEYJ7X2rIXu8SR2&index=3");
		System.out.println("Inside Step - User is on google search page");
	}
	
	@When("user enters a text in search box")
	public void user_enters_a_text_in_search_box()
	{
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@placeholder=\"Search\"])[1]"))) ;
		driver.findElement(By.xpath("(//input[@placeholder=\"Search\"])[1]")).sendKeys("Automation Step by Step");
		System.out.println("Inside Step - user enters a text in search box");
	}
	
	@And("hits enter")
	public void hits_enter()
	{
		driver.findElement(By.xpath("(//input[@placeholder=\"Search\"])[1]")).sendKeys(Keys.ENTER);;
		System.out.println("Inside Step - hits_enter ");
	}
	
	@Then("User is navigated to search results")
	public void User_is_navigated_to_search_results()
	{
		driver.getPageSource().contains("Automation Step by Step");
		System.out.println("Inside Step - hits_enter ");
		
		
		driver.quit(); 
	
	}
	
	
	
	
}

//
//Given brower is open
//And User is on google search page
//When user enters a text in search box
//And hits enter
//Then User is navigated to search results