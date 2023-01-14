@RunWithParameters
Feature: Wikipedia search functionality

  Scenario: Wikipedia search functionality
    Given user click on wikipedia page
    When User type "Jay Leno" in the wiki search box
    And User click search button
    Then User see "Jay Leno" in the wiki page title