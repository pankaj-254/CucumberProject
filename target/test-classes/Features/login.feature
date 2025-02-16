# Author #is use for comment in feature file  
# Date  
# Description
@SmokeScenario
Feature: feature to test Login Functionality
	
@SmokeTest
  Scenario: Check login is successful with valid crediantials
    Given user is on login page
    When user enters username and password
    And clicks on login button
    Then user is navigated to the home page



#  Scenario Outline: Check login is successful with valid crediantials
#   Given user is on login page
#    When user enters <username> and <password>
#    And clicks on login button
#   Then user is navigated to the home page

#    Examples: 
#     | username | password |
#     | user1    | pass1    |
#      | user2    | pass2    |
