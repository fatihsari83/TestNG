package tests.day15_POM;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.Driver;

public class C01_PagesIlkTest {

    @Test
    public void amazonTest(){

        // amazon ana sayfaya gidelim

        Driver.getDriver().get("https://wwww.amazon.com");


        // Nutella icin arama yapalim
        // arama kutusunun locate i pages sayfasinda
        // POM de pages sayfasindaki locate lere erismek icin
        // pages sayfalarindan bir obje olusturulur

       AmazonPage amazonPage = new AmazonPage();
        amazonPage.aramaKutusu.sendKeys("Nutella"+ Keys.ENTER);


        // sonuclarin Nutella icerdiğini test edelim

        String expectedIcerik = "Nutella";
        String actualAramaSonucYazisi= amazonPage.aramaSonucuElementi.getText();
        Assert.assertTrue(actualAramaSonucYazisi.contains(expectedIcerik));



        // sayfayi kapatalim

        }




    }

