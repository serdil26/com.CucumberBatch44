package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class WebUniversityPage {
    public WebUniversityPage(){
        PageFactory.initElements(Driver.getDriver(), this);


    }
    @FindBy (xpath = "//h1[text()='LOGIN PORTAL']")
    public WebElement WebUnLoginPortalButton;

    @FindBy(xpath = "//input[@id='text']")
    public WebElement webUniversityUserNameBox;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement webUniversityPasswordBox;

    @FindBy (xpath = "//button[@id='login-button']")
    public WebElement webUniversityLoginButton;


}
