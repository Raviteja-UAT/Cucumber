Feature: User Registeration

  Background: 
    Given User navigates to Register Account page

  Scenario: Register with mandatory fields
    When User enters firstname "Ravi" into the First Name field
    And Enters lastname "Golla" into the Last Name field
    And Enters email address "ravi.golla@gmail.com" into the EMail field
    And Enters telephone "1234567890" into the Telephone field
    And Enters password "12345" into the Password field
    And Enters password "12345" into the Password Confirm field
    And Selects Privacy Policy field
    And Clicks on Continue button
    Then Account should get successfully created

  Scenario: Register with all fields
    When User enters firstname "Ravi" into the First Name field
    And Enters lastname "Golla" into the Last Name field
    And Enters email address "ravi.golla@gmail.com" into the EMail field
    And Enters telephone "1234567890" into the Telephone field
    And Enters password "12345" into the Password field
    And Enters password "12345" into the Password Confirm field
    And Selects Yes for Newsletter
    And Selects Privacy Policy field
    And Clicks on Continue button
    Then Account should get successfully created

  Scenario: Register without providing any fields
    When User dont enter details into any fields
    And Clicks on Continue button
    Then Warning messages should be displayed under all the mandatory fields

  Scenario: Register with duplicate email address
    When User enters firstname "Ravi" into the First Name field
    And Enters lastname "Golla" into the Last Name field
    And Enters email address "ravi.golla@gmail.com" into the EMail field
    And Enters telephone "1234567890" into the Telephone field
    And Enters password "12345" into the Password field
    And Enters password "12345" into the Password Confirm field
    And Selects Yes for Newsletter
    And Selects Privacy Policy field
    And Clicks on Continue button
    Then Warning message informing the User about duplicate email address should be displayed
