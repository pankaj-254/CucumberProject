Feature: Check home Page Functionality

  Background: User is logged in
    Given User is on Login page
    When User enter username and password
    And click's on login button
    Then User is navigated to the homepage

  Scenario: Check Logout Link
    #    Given User is logged in
    When User click on Welcome Link
    Then Logout link is displayed

  Scenario: Verify quick launch tool bar is present
    #   Given User is logged in
    When user clicks on dashboard link
    Then quick launch toolbar is displayed
