Feature: feature to test google serach functionality

@googleSearch
  Scenario: Validate google search is working
    Given brower is open
    And User is on google search page
    When user enters a text in search box
    And hits enter
    Then User is navigated to search results
