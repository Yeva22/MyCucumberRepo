package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

public class LoginSBPage {

    public LoginSBPage(){

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//input[@type=\"text\"]")
    public WebElement username2;

    @FindBy(xpath = "//input[@type=\"text\"]")
    public WebElement username;

    @FindBy (xpath = "//input[@type=\"password\"]")
    public WebElement password;

    @FindBy(xpath = "//input[@type=\"submit\"]")
    public WebElement loginBtn;

    @FindBy(xpath = "//span[@class=\"error\"]")
    public WebElement errorMsg;

}
