@oHRMLogoutOutline
Feature: OrangeHRM Log out function
Background:
Given User is on OrangeHRM login page
When User enters the correct  "<username>"
And User enters correct "<password>"
And User clicks on loginButton

@logoutOHRM
Scenario Outline: As an Admin user I should be able to log out of Orange HRM
And User should be logged in and taken to the Dashboard Tab and should be able to verify <"tabText"> is displayed on page
And User will click on getIdPicture icon
And User will then be able to see the getDropdownMenu and click on the Logout option
Then User should taken back to the Login page



  Examples:
| "admin" | "Admin123" | loginButton | "Dashboard" |