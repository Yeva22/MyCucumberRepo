@smoke @UI
Feature: Verify user can open page
    This is testing google page.
#  comments - Ctrl + /
#  Keywords: Given, When, And, Then

  @GX859
  Scenario: Google title verification
    Given I am at google homepage
    Then I verify the title is Google

    @searchVerification
  Scenario: Google search test
    Given I am at google homepage
    When I search for saucelabs
    Then I verify the title is Saucelabs
