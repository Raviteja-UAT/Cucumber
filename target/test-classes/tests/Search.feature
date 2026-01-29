Feature: Search functionality

  Background: 
    Given User opens the Application

  Scenario: Search for a valid product
    When User enters valid product into Search field
    And User clicks on Search button
    Then Valid Product should get displayed in search results

  Scenario: Search for a non-existing product
    When User enters non-existing product into Search field
    And User clicks on Search button
    Then Proper text informing the User about no product matching should be displayed

  Scenario: Search without providing any product
    When User dont enter any product into Search field
    And User clicks on Search button
    Then Proper text informing the User about no product matching should be displayed
