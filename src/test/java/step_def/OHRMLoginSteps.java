package step_def;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.OHRMForgotPassPage;
import pages.OHRMLoginPage;
import utils.Driver;

public class OHRMLoginSteps {

    OHRMLoginPage OHRMLoginPage = new OHRMLoginPage();
    OHRMForgotPassPage OHRMForgotPassPage = new OHRMForgotPassPage();
    String expectedMsg = "Reset Password link sent successfully";
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
    @Then("User should be logged in and taken to the Dashboard Tab be able to verify <{string}> is displayed on page")
    public void user_should_be_logged_in_and_taken_to_the_dashboard_tab_be_able_to_verify_is_displayed_on_page(String string) {
        OHRMLoginPage.getTabText.isDisplayed();
    }

    @When("User clicks on <{string}>")
    public void user_clicks_on(String string) {
        OHRMForgotPassPage.getForgotPassLink.click();

    }
    @Then("User should see an error message and be able to verify <{string}> is displayed on page")
    public void user_should_see_an_error_message_and_be_able_to_verify_is_displayed_on_page(String string) {
        OHRMForgotPassPage.getResetPassBtn.click();
        Assert.assertEquals(expectedMsg, OHRMForgotPassPage.getResetSuccessMsg);
    }

}
