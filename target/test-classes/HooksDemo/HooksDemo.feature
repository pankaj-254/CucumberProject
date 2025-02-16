Feature: check login functionality with Hooks

  @smoke
  Scenario: Hooks example Scenario - 1
    Given The user is on login page
    When user enter valid username and password
    And click on login button
    Then The user is navigated to the home page

  @test
  Scenario: Hooks example Scenario - 2
    Given The user is on login page
    When user enter valid username and password
    And click on login button
    Then The user is navigated to the home page
