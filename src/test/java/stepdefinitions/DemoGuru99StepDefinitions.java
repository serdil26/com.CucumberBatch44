package stepdefinitions;

import io.cucumber.java.en.Given;
import org.openqa.selenium.WebElement;
import pages.DemoGuruPage;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.List;

public class DemoGuru99StepDefinitions {
DemoGuruPage demoGuruPage=new DemoGuruPage();

    @Given("{string}, sutunundaki tum degerleri yazdirir")
    public void sutunundaki_tum_degerleri_yazdirir(String istenenBaslikStr) {
        Driver.getDriver().switchTo().frame(demoGuruPage.iframe);
        demoGuruPage.cookiesKabulEtButonu.click();

      List<WebElement> baslikWebElementListesi= demoGuruPage.baslikWebElementListesi;
      List<String> baslikStringListesi= ReusableMethods.getElementsText(baslikWebElementListesi);


        int istenenSutunIndexi= baslikStringListesi.indexOf(istenenBaslikStr);

       List<WebElement> istenenSutunWebelementListesi= demoGuruPage.sutunListesiGetir(istenenSutunIndexi);
       List<String> istenenSutunStrList= ReusableMethods.getElementsText(istenenSutunWebelementListesi);

        System.out.println(istenenBaslikStr + " sutunundaki elementler \n" + istenenSutunStrList);
    }
}
