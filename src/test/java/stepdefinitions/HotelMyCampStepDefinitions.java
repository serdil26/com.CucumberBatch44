package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.HMCpage;
import utilities.ConfigReader;

public class HotelMyCampStepDefinitions {
    HMCpage hmcPage=new HMCpage();
    @Given("login linkine tiklar")
    public void login_linkine_tiklar() {
        hmcPage.mainPageLogin.click();

    }
    @Then("kullanici adi olarak {string} girer")
    public void kullanici_adi_olarak_girer(String kullaniciTipi) {
hmcPage.userNameBox.sendKeys(ConfigReader.getProperty(kullaniciTipi));
    }
    @Then("password olarak {string} girer")
    public void password_olarak_girer(String passwordTuru) {
hmcPage.passwordBox.sendKeys(ConfigReader.getProperty(passwordTuru));
    }
    @Then("login butonuna basar")
    public void login_butonuna_basar() {
hmcPage.loginButonu.click();
    }
    @Then("basarili olarak giris yapildigini test eder")
    public void basarili_olarak_giris_yapildigini_test_eder() {
        Assert.assertTrue(hmcPage.basariliGirisYaziElementi.isDisplayed());

    }

    @And("giris yapilamadigini test eder")
    public void girisYapilamadiginiTestEder() {
        Assert.assertTrue(hmcPage.girisYapilamadiYaziElementi.isDisplayed());
    }
}
