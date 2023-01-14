package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

public class SBTestPage {
       public SBTestPage(){
           PageFactory.initElements(Driver.getDriver(),this);
       }

    @FindBy(xpath = "//input[@id=\"searchInput\"]")
    public WebElement getOrdersTab;

    @FindBy (xpath = "//select[@name=\"ctl00$MainContent$fmwOrder$ddlProduct\"]")
    public WebElement getProductDropdown;

    @FindBy (xpath = "//span[@class=\"mw-page-title-main\"]")
    public WebElement getTextHeader;

    @FindBy (xpath = "//div[@class=\"fn\"]")
    public WebElement getImageHeader;
}
