Feature: User Login
  Registered user should be able to login to access account details

  Background: 
    Given User naviagtes to Login page

  Scenario Outline: 
    Login with valid credentials

    When User enters valid email address <email>
    And Enters valid password <password>
    And Clicks on Login button
    Then User should login successfully

    Examples: 
      | email                  | password |
      | relipriyanka@gmail.com | Test@123 |
      | rel1priyanka@gmail.com | Test@123 |
      | rel3priyanka@gmail.com | Test@123 |

  Scenario: Login with invalid credentials
    When User enters invalid email address "priyanka@gmail.com"
    And Enters invalid password "Tsfsd@123"
    And Clicks on Login button
    Then User should get a proper warning message

  Scenario: Login with valid email address and invalid password
    When User enters valid email address "relipriyanka@gmail.com"
    And Enters invalid password "Tsfsd@123"
    And Clicks on Login button
    Then User should get a proper warning message

  Scenario: Login with invalid email address and valid password
    When User enters invalid email address "priyanka@gmail.com"
    And Enters valid password "Test@123"
    And Clicks on Login button
    Then User should get a proper warning message

  Scenario: Login without providing any credentials
    When User dont enter any credentials
    And Clicks on Login button
    Then User should get a proper warning message
