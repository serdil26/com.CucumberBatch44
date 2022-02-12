package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.WebUniversityPage;
import utilities.Driver;
import utilities.ReusableMethods;

public class WebUniversityStepDefinitions {
    WebUniversityPage webUniversityPage=new WebUniversityPage();

    @Given("Login Portal'a kadar asagi iner")
    public void login_portal_a_kadar_asagi_iner() {
        Actions actions=new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).perform();

    }
    @Given("Login Portal'a tiklar")
    public void login_portal_a_tiklar() {
webUniversityPage.WebUnLoginPortalButton.click();
    }
    @Then("acilan diger window'a gecer")
    public void acilan_diger_window_a_gecer() {
        ReusableMethods.switchToWindow("WebDriver | Login Portal");

    }
    @Then("{string} ve {string} kutularina deger yazdirir")
    public void ve_kutularina_deger_yazdirir(String username, String password) {
webUniversityPage.webUniversityUserNameBox.sendKeys(username);
webUniversityPage.webUniversityPasswordBox.sendKeys(password);
    }
    @Then("WebUniversity login butonuna basar")
    public void web_university_login_butonuna_basar() {
        webUniversityPage.webUniversityLoginButton.click();

    }
    @Then("Popupta cikan yazinin {string} oldugunu test eder")
    public void popupta_cikan_yazinin_oldugunu_test_eder(String popupYazi) {
String alertYazisi= Driver.getDriver().switchTo().alert().getText();
        Assert.assertEquals(popupYazi, alertYazisi);
    }
    @Then("Ok diyerek popup'i kapatir")
    public void ok_diyerek_popup_i_kapatir() {
        Driver.getDriver().switchTo().alert().accept();

    }
    @Then("ilk sayfaya geri doner")
    public void ilk_sayfaya_geri_doner() {
        ReusableMethods.switchToWindow("WebDriverUniversity.com");

    }
    @Then("ilk sayfaya donuldugunu test eder")
    public void ilk_sayfaya_donuldugunu_test_eder() {
        String actualTitle= Driver.getDriver().getTitle();
        String expectedTitle="WebDriverUniversity.com";
        Assert.assertEquals(actualTitle, expectedTitle);

    }

    @And("{int} saniye bekler")
    public void saniyeBekler(int arg0) {
        ReusableMethods.waitFor(2);
    }
}
