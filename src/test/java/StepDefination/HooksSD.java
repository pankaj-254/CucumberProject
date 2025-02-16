package StepDefination;

import com.google.common.reflect.Reflection;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HooksSD {

	@Given("The user is on login page")
	public void the_user_is_on_login_page() {
		System.out.println("HooksSD - user inside-> the_user_is_on_login_page"+ this.getClass());
	}

	@When("user enter valid username and password")
	public void user_enter_valid_username_and_password() {
		System.out.println("HooksSD - user inside-> user_enter_valid_username_and_password"+ this.getClass());
		
	}

	@And("click on login button")
	public void click_on_login_button() {
	System.out.println("HooksSD - user inside-> click_on_login_button"+ this.getClass());
		
	}

	@Then("The user is navigated to the home page")
	public void the_user_is_navigated_to_the_home_page() {
	System.out.println("HooksSD - user inside-> the_user_is_navigated_to_the_home_page"+ this.getClass());
		
	}

}
