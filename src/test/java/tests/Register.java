package tests;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Register {

	@Given("User navigates to Register Account page")
	public void User_navigates_to_Register_Account_page() {

		System.out.println(">> User got navigated to Register Account page");
	}

	@When("User enters firstname {string} into the First Name field")
	public void User_enters_firstname_into_the_First_Name_field(String firstNameText) {

		System.out.println(">> Users has entered firstname: " + firstNameText + " into the FirstName field");
	}

	@And("Enters lastname {string} into the Last Name field")
	public void enters_lastname_into_the_last_name_field(String lastNameText) {

		System.out.println(">> Users has entered lastname: " + lastNameText + " into the Lastname field");
	}

	@And("Enters email address {string} into the EMail field")
	public void enters_email_address_into_the_e_mail_field(String emailText) {

		System.out.println(">> Users has entered email: " + emailText + " into the Email field");
	}

	@And("Enters telephone {string} into the Telephone field")
	public void enters_telephone_into_the_telephone_field(String telephoneText) {

		System.out.println(">> Users has entered telephone: " + telephoneText + " into the TelePhone field");
	}

	@And("Enters password {string} into the Password field")
	public void enters_password_into_the_password_field(String passwordText) {

		System.out.println(">> Users has entered password: " + passwordText + " into the Password field");
	}

	@And("Enters password {string} into the Password Confirm field")
	public void enters_password_into_the_password_confirm_field(String passwordText) {

		System.out.println(">> Users has entered password: " + passwordText + " into the Password Confirm field");
	}

	@And("Selects Privacy Policy field")
	public void selects_privacy_policy_field() {

		System.out.println(">> User has selected the Privacy Policy field");
	}

	@And("Clicks on Continue button")
	public void clicks_on_continue_button() {

		System.out.println(">> User has clicked on Continue button");
	}

	@Then("Account should get successfully created")
	public void account_should_get_successfully_created() {

		System.out.println(">> User account got successfully created");
	}

	@And("Selects Yes for Newsletter")
	public void selects_yes_for_newsletter() {

		System.out.println(">> User has selected Yes for Newsletter");
	}

	@When("User dont enter details into any fields")
	public void user_dont_enter_details_into_any_fields() {

		System.out.println(">> User has kept all the fields blank");
	}

	@Then("Warning messages should be displayed under all the mandatory fields")
	public void warning_messages_should_be_displayed_under_all_the_mandatory_fields() {

		System.out.println("Warning messages for all the mandatory fields got displayed");
	}

	@Then("Warning message informing the User about duplicate email address should be displayed")
	public void warning_message_informing_the_user_about_duplicate_email_address_should_be_displayed() {

		System.out.println("Warning message informing the User about duplicate email is displayed");
	}

}
