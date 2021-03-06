package pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AutomationPracticePage {
    public AutomationPracticePage(){
        PageFactory.initElements(Driver.getDriver(),this);


    }
    @FindBy (xpath = "//a[@class='login']")
    public WebElement signInButton;

    @FindBy (xpath = "//input[@id='email_create']")
    public WebElement emailBox;

    @FindBy(xpath = "//li[text()='Invalid email address.']")
    public WebElement invalidEmailYazisiElementi;

    @FindBy (xpath = "//button[@id='SubmitCreate']")
    public WebElement createAccountButton;
}
