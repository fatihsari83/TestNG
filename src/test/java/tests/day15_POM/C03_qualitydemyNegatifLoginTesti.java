package tests.day15_POM;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.QualitydemyPage;
import utilities.Driver;

public class C03_qualitydemyNegatifLoginTesti {

    @Test
    public void test01(){

        // qalitydemy anasayfaya gidin

        Driver.getDriver().get("https://www.qualitydemy.com");


        // ilk login linkine tıklayin
        QualitydemyPage qualitydemyPage = new QualitydemyPage();
        qualitydemyPage.ilkloginLinki.click();

        // kullanici adi olarak selenium
        qualitydemyPage.emailKutusu.sendKeys("selenium");

        // password olarak heyecendir yazin
        qualitydemyPage.passwordKutusu.sendKeys("heyecandir");

        // login butonuna tıklayin
        qualitydemyPage.loginButonu.click();

        // giris yapılamadiğini test edin
        Assert.assertTrue(qualitydemyPage.emailKutusu.isEnabled());

        // sayfayi kapatin

        Driver.closeDriver();



    }
}
