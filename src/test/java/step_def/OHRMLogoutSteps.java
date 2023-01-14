package step_def;

import io.cucumber.java.en.When;
import pages.OHRMLoginPage;
import utils.Config;
import utils.Driver;

public class OHRMLogoutSteps {
    OHRMLoginPage OHRMLoginPage = new OHRMLoginPage();
    OHRMLogoutSteps ohrmLogoutSteps = new OHRMLogoutSteps();

    //String expectedMsg = "Reset Password link sent successfully";
    @When("User is on OrangeHRM login page")
    public void user_is_on_orange_hrm_login_page() {
        Driver.getDriver().get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

    }
    @When("User enters correct  <{username}>")
    public void user_enters_the_correct() {
        OHRMLoginPage.usernameInput.sendKeys("Admin");
    }
    @When("User enters correct <{password}>")
    public void user_enters_correct() {
        OHRMLoginPage.passwordInput.sendKeys("admin123");
    }
    @When("User clicks on Submit button")
    public void user_clicks_on() {
        OHRMLoginPage.getLoginBtn.click();
    }
    @When("User should be logged in and taken to the Dashboard Tab and should be able to verify <\"tabText\"> is displayed on page")
    public void user_should_be_logged_in_and_taken_to_the_Dashboard_Tab_and_should_be_able_to_verify_tabText_is_displayed_on_page() {
        Driver.getDriver().get(Config.getProperty("ohrmLogoutURL"));
        OHRMLoginPage.getLoginBtn.click();
    }

}
//getErrorMsg
//And User should be logged in and taken to the Dashboard Tab be able to verify <"tabText"> is displayed on page
//And User will click on getIdPicture icon
//And User will then be able to see the getDropdownMenu and click on the Logout option
//Then User should taken back to the Login page