package step_def;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import pages.LoginSBPage;
import pages.WebOrdersSBPage;
import utils.Driver;

//Agile Story: When user is on the login page of SmartBear app user should
//  be able to log in using correct test data

public class SBLoginSteps {

    LoginSBPage loginSBPage = new LoginSBPage();
    WebOrdersSBPage webOrdersSBPage = new WebOrdersSBPage();
    Faker faker = new Faker();
    @When("User is on SmartBear login page")
    public void user_is_on_smart_bear_login_page() {
        Driver.getDriver().get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
    }
    @When("User enters correct  username2")
    public void user_enters_correct_username2() {
    loginSBPage.username2.sendKeys("Tester");

    }
    @When("User enters correct password")
    public void user_enters_correct_password() {
    loginSBPage.password.sendKeys("test");
    }
    @When("User clicks to login button")
    public void user_clicks_to_login_button() {
    loginSBPage.loginBtn.click();
    }
    @Then("User should be logged in and be able to verify Welcome text is displayed")
    public void user_should_be_logged_in_and_be_able_to_verify_welcome_text_is_displayed() {
      //  loginSBPage.actualMsg.isDisplayed();
        //or
        String expectedMsg = "Welcome, Tester!";
        String actualMsg = String.valueOf(Driver.getDriver().findElement(By.xpath("//div[@class=\"login_info\"]")));
        Assert.assertEquals(expectedMsg,actualMsg);

    }
    @When("User enters correct username")
    public void user_enters_correct_username() {
        loginSBPage.username.sendKeys(faker.internet().password());
    }
    @When("User enters incorrect password")
    public void user_enters_incorrect_password() {
        loginSBPage.password.sendKeys("tested");
    }
       @Then("User should see the error message displayed on the page")
    public void user_should_see_the_error_message_displayed_on_the_page() {
        loginSBPage.errorMsg.isDisplayed();

    }

}
