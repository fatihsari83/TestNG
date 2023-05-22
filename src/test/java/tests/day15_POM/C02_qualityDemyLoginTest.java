package tests.day15_POM;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.QualitydemyPage;
import utilities.Driver;

public class C02_qualityDemyLoginTest {

    @Test(groups = "smoke")
    public void test01(){

        // QUALİTYDEMY anasayfaya gidin

        Driver.getDriver().get("https://www.qualitydemy.com");
        QualitydemyPage qualitydemyPage = new QualitydemyPage();




        // login linkine tıklayin


        qualitydemyPage.ilkloginLinki.click();



        // gecerli username ve sifre yi ilgili kutulara yazin
        qualitydemyPage.emailKutusu.sendKeys("anevzatcelik@gmail.com");
        qualitydemyPage.passwordKutusu.sendKeys("Nevzat152032");



        // login butonuna basin
        qualitydemyPage.loginButonu.click();


        // basarili olarak giris yapıldıgını test edin
        Assert.assertTrue(qualitydemyPage.basariligirisKontrolElementi.isDisplayed());
        // sayfayi kapatin
        Driver.closeDriver();
    }

}
