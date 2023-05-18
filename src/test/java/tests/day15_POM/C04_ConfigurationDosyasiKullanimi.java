package tests.day15_POM;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C04_ConfigurationDosyasiKullanimi {

    /*

        POM de hedef test class inda
        manuel olarak hic bir Test Data sini GİRMEMEKTİR

        Test datalari:
        1- Kullanacağimiz WebDriver : Driver classından dinamik olarak kullaniyoruz
        2- Locate : Locate'leri pages sayfalarindan dinamik olarak kullaniyoruz.
        3- kullanilan URL, aranan kelime, expected icerik, dogru kullanici adi
            yanlıs kullanici adi, yanlıs sifre... gibi datalar
     */

    @Test
    public void test01(){

        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));

        AmazonPage amazonPage = new AmazonPage();
        amazonPage.aramaKutusu.sendKeys(ConfigReader.getProperty("amazonAranacakKelime")+ Keys.ENTER);

        String expectedIcerik = ConfigReader.getProperty("amazonExpectedIcerik");
        String actualSonucYazisi = amazonPage.aramaSonucuElementi.getText();
        Assert.assertTrue(actualSonucYazisi.contains(expectedIcerik));

        Driver.closeDriver();


    }

}
