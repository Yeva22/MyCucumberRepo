package step_def;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.support.ui.Select;
import pages.LoginSBPage;
import pages.SBTestPage;
import pages.WebOrdersSBPage;
import utils.Config;

public class SBTestSteps {
    LoginSBPage loginSBPage = new LoginSBPage();
    WebOrdersSBPage webOrdersSBPage = new WebOrdersSBPage();
    SBTestPage sbTestPage = new SBTestPage();
    @Given("User is logged into SmartBear Tester account and on Order page")
    public void user_is_logged_into_smart_bear_tester_account_and_on_order_page() {
        loginSBPage.username.sendKeys(Config.getProperty("username"));
        loginSBPage.username.sendKeys(Config.getProperty("pass"));
        loginSBPage.loginBtn.click();
       // webOrdersSBPage.getOrdersTab.click();
    }
    @Given("User selects {string} from product dropdown")
    public void user_selects_from_product_dropdown(String productType) {
      //  Select product = new Select(webOrdersSBPage.getProductDropdown);
       // product.selectByVisibleText(productType);
    }
    @Given("User enters {string} to quantity input box")
    public void user_enters_to_quantity_input_box(String string) {

    }
    @Given("User enters {string} to costumer name input box")
    public void user_enters_to_costumer_name_input_box(String string) {

    }
    @Given("User enters {string} to street name input box")
    public void user_enters_to_street_name_input_box(String string) {

    }
    @Given("User enters {string} to city input box")
    public void user_enters_to_city_input_box(String string) {

    }
    @Given("User enters {string} to state input box")
    public void user_enters_to_state_input_box(String string) {

    }
    @Given("User enters {string} to zip input box")
    public void user_enters_to_zip_input_box(String string) {

    }
    @Given("User selects {string} as card type from radio buttons")
    public void user_selects_as_card_type_from_radio_buttons(String string) {

    }
    @Given("User enters {string} to card number input box")
    public void user_enters_to_card_number_input_box(String string) {

    }
    @Given("User enters {string} to expiration date into input box")
    public void user_enters_to_expiration_date_into_input_box(String string) {

    }
    @Given("User clicks process button")
    public void user_clicks_process_button() {

    }
    @Then("User verifies {string} is in the table")
    public void user_verifies_is_in_the_table(String string) {

    }

}
