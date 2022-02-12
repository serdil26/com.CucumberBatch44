package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features", // runner calismazsa pathler kontrol edilmeli
        glue = "stepdefinitions",
        tags = "@webUn",  //calistirmak istedigimiz tag yazilir
        dryRun = false            //default degeri false'tur(normal calistiriken false olmali)
                                   //hata bulmak istiyorsak true ile calistiririz

)

public class Runner {
    //runner class'inin body'sine hicbir kod yazilmayacak
    //bu class icin onemli olan kullanacagimiz 2 adet notation!

    // features ve glue olarak spesifik bir class veya feature dosyasini degil
    // tum klasor ve package'i sectik
    // dolayisiyla stepdefinitions package'i icerisinde hangi class'da olursa olsun
    // isimize yarayan bir stepdefition varsa rahatlikla kullanabiliriz
}
