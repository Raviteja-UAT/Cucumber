package tests;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Search {

	@Given("User opens the Application")
	public void user_opens_the_application() {

		System.out.println(">> Application got opened");
	}

	@When("User enters valid product into Search field")
	public void user_enters_valid_product_into_search_field() {

		System.out.println(">>Valid Product got entered into Search field");
	}

	@And("User clicks on Search button")
	public void user_clicks_on_search_button() {

		System.out.println(">> User clicked on Search Button");
	}

	@Then("Valid Product should get displayed in search results")
	public void valid_product_should_get_displayed_in_search_results() {

		System.out.println(">> Valid product got displayed in Search results");
	}

	@When("User enters non-existing product into Search field")
	public void user_enters_non_existing_product_into_search_field() {

		System.out.println(">> Non-Existing product into Search field");
	}

	@Then("Proper text informing the User about no product matching should be displayed")
	public void proper_text_informing_the_user_about_no_product_matching_should_be_displayed() {

		System.out.println(">> No Product matching got displayed");
	}

	@When("User dont enter any product into Search field")
	public void user_dont_enter_any_product_into_search_field() {

		System.out.println("No product entered into search field");
	}

}
