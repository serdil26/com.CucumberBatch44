package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class DemoQaPage {
    public DemoQaPage (){
        PageFactory.initElements(Driver.getDriver(), this);
    }

@FindBy (xpath = "//button[@id='enableAfter']")
    public WebElement willEnable5SecondsElement;

    @FindBy (xpath = "//button[@id='visibleAfter']")
    public WebElement visibleAfter5secondsElement;
}
