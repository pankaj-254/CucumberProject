Feature: Test Login Functionlity

@POMwithDataTable
  Scenario Outline: 
    : Check Login is Successful with valid Credentials

    Given browser is open
    And User is on Login Page
    When User enters <username> and <Password>
    And User Click on Login
    Then User is navigated to the home page

    Examples: 
      | username | Password    |
      | student  | Password123 |
      | student  | Password123 |
