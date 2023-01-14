@forgotPasswordOHRM
Feature: Forgot Password Functionality

  Scenario Outline: As an Admin user I should be able to reset password using correct credentials
    Given User is on OrangeHRM login page
    When User clicks on getForgotPassLink
    And User is taken to the password reset page and enters correct username Input
    And User clicks on getResetPassBtn
    Then User should see a confirmation message  and be able to verify getResetSuccessMsg is displayed on page

    Examples:
      | forgot password link | username      | reset password button | confirmation message |
      | getForgotPassLink    | usernameInput | getResetPassBtn       | getResetSuccessMsg   |