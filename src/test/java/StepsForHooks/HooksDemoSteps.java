package StepsForHooks;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HooksDemoSteps {
	
	WebDriver driver = null ;
	
	@Before(value="@smoke or @test",order = 1  )
	public void browserSetup() throws InterruptedException
	{
		System.out.println("I am inside Browser setup 1");
		
//		Hooks function for driver setup
		System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
		driver = new ChromeDriver() ;
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		Thread.sleep(5000);
	}
	
	@Before(order = 0)
	public void setup2()
	{
		System.out.println("********I am inside Setup2 ***********");
	}
	
	
	@After(order = 1)
	public void teardown()
	{
		System.out.println("I am inside Browser teardown 1");
		
//		Hooks function for teardown
		driver.close();
		driver.quit();
	}	
	
	
	@After(order = 2)
	public void teardown2()
	{
		System.out.println("I am inside Browser teardown 2");
		
	}	
	

	
	
	
	@BeforeStep
	public static void beforeStep()
	{
		System.out.println("I am inside beforeStep() ---====--- ");
		
	}
	
	
	@AfterStep
	public static void afterStep()
	{
		System.out.println("I am inside afterStep() ---====--- ");
		
	}
	
	
	
	
	@Given("The user is on login page")
	public void the_user_is_on_login_page() {
		System.out.println("user inside-> the_user_is_on_login_page - "+ getClass());
	}

	@When("user enter valid username and password")
	public void user_enter_valid_username_and_password() {
		System.out.println("user inside-> user_enter_valid_username_and_password - "+ getClass());
		
	}

	@And("click on login button")
	public void click_on_login_button() {
	System.out.println("user inside-> click_on_login_button - "+ getClass());
		
	}

	@Then("The user is navigated to the home page")
	public void the_user_is_navigated_to_the_home_page() {
	System.out.println("user inside-> the_user_is_navigated_to_the_home_page - "+ getClass());
		
	}
	
	
	
	
}
