package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.HerokuPage;
import utilities.ReusableMethods;

public class HerokuStepDefinitions {
    HerokuPage herokuPage=new HerokuPage();

    @When("Add Element butonuna basar")
    public void add_element_butonuna_basar() {
        herokuPage.addButtonElement.click();

    }
    @Then("Delete butonu gorununceye kadar bekler")
    public void delete_butonu_gorununceye_kadar_bekler() {
        ReusableMethods.waitForVisibility(herokuPage.deleteButtonElement,20);

    }
    @Then("Delete butonunun gorundugunu test eder")
    public void delete_butonunun_gorundugunu_test_eder() {
        Assert.assertTrue(herokuPage.deleteButtonElement.isDisplayed());

    }
    @Then("Delete butonuna basarak butonu siler")
    public void delete_butonuna_basarak_butonu_siler() {
        herokuPage.deleteButtonElement.click();

    }
}
