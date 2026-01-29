package tests;

import io.cucumber.java.en.*;

public class Login {

	@Given("User naviagtes to Login page")
	public void user_naviagtes_to_login_page() {

		System.out.println(">> User got navigated to Login page");
	}

	@When("^User enters valid email address (.+)$")
	public void user_enters_valid_email_address(String email) {
		System.out.println(">> User has entered valid email address "+email);
	}

	@And("^Enters valid password (.+)$")
	public void enters_valid_password(String password) {
		System.out.println(">> User has entered valid password "+password);
	}

	@And("Clicks on Login button")
	public void clicks_on_login_button() {

		System.out.println(">> User clicks on Login Button");
	}

	@Then("User should login successfully")
	public void user_should_login_successfully() {

		System.out.println(">> User should login successfully");
	}

	@When("User enters invalid email address {string}")
	public void user_enters_invalid_email_address(String invalidEmailAddress) {

		System.out.println(">> User has entered invalid email address " + invalidEmailAddress);
	}

	@And("Enters invalid password {string}")
	public void enters_invalid_password(String invalidPassword) {

		System.out.println(">> User has entered invalid password " + invalidPassword);
	}

	@Then("User should get a proper warning message")
	public void user_should_get_a_proper_warning_message() {

		System.out.println(">> User got a proper warning message");
	}

	@When("User dont enter any credentials")
	public void user_dont_enter_any_credentials() {
		
		System.out.println(">> User has not entered any credentials");
	}

}
