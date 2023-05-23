package tests.day18_TestNGReports_ParalelCalistirma;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class C01_RaporluAmazonSearch extends TestBaseRapor {

    @Test
    public void test01(){

        extentTest= extentReports.createTest("Amazon arama testi",
                                              "Kullanici istedigi kelimeyi aratabilmeli");


        // amazon a gidin
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
        extentTest.info("Kullanici amazon ana sayfaya gider");


        // Nutella icin arama yapin
        AmazonPage amazonPage= new AmazonPage();
        amazonPage.aramaKutusu.sendKeys(ConfigReader.getProperty("amazonAranacakKelime") + Keys.ENTER);
        extentTest.info("Arama kutusuna belirlenen aranacak kelimeyi yazar ve aratir");



        // arama sonuclarinin Nutella icerdiğini test edin
        String actulaSonucYazisi= amazonPage.aramaSonucuElementi.getText();
        String expectedIcerik = ConfigReader.getProperty("amazonExpectedIcerik");

        Assert.assertTrue(actulaSonucYazisi.contains(expectedIcerik));
        extentTest.pass("Belirlenen "+ ConfigReader.getProperty("amazonAranacakKelime") +" aratildiginda, arama sonucunda expected icerik oldugu test edildi");

        Driver.closeDriver();

    }

}
