package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import step_def.OHRMForgotPassSteps;
import utils.Driver;

public class OHRMForgotPassPage {
    OHRMForgotPassSteps ohrmForgotPassSteps = new OHRMForgotPassSteps();
    public OHRMForgotPassPage(){

        PageFactory.initElements(Driver.getDriver(),this);

    }
    @FindBy(xpath = "//input[@name=\"username\"]")
    public WebElement usernameInput;

    @FindBy(xpath = "//p[@class=\"oxd-text oxd-text--p orangehrm-login-forgot-header\"]")
    public WebElement getForgotPassLink;

    @FindBy(xpath = "//button[@type=\"submit\"]")
    public WebElement getResetPassBtn;

    @FindBy(xpath = "//h6[@class=\"oxd-text oxd-text--h6 orangehrm-forgot-password-title\"]")
    public WebElement getResetSuccessMsg;
    //https://opensource-demo.orangehrmlive.com/web/index.php/auth/sendPasswordReset
}
