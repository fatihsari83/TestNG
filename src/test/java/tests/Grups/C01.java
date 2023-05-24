package tests.Grups;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.List;

public class C01 {

    @Test
    public void test01(){

        // Soru 1 :
        //Ø Amazon anasayfaya gidebilecek sekilde bir page sayfasi olusturun : AmazonPage
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));

        //Ø Amazon ana sayfasinda en altta bulunan Webtable’i inceleyebilmek icin
        //AmazonPage clasinda en altta gitme isini yapacak bir method olusturun
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.END).perform();
        ReusableMethods.bekle(2);


        //Ø Tests paketi altinda yeni bir class olusturun: D26_AmazonSatirSutunSayisi



        //Ø Bu class’in altinda bir test method olusturun : satirSayisi( ) ve webtable’da 10
        //satir oldugunu test edin

        AmazonPage amazonPage = new AmazonPage();
        int expectedSize= 9;
        int actualSize = amazonPage.satirSayisiElementi.size();

        SoftAssert softAssert= new SoftAssert();
        softAssert.assertEquals(actualSize,expectedSize,"Satir sayisi ");



        //Ø Yeni bir method olusturun : sutunSayisi( ) ve yazi olan sutun sayisinin 7oldugunu
        //test edin

        expectedSize =7;

        actualSize= ReusableMethods.doluSutunSayisiHesapla(amazonPage.sutunSayisiElementi);
        //actualSize= yaziliSutunSayisi;

        softAssert.assertEquals(actualSize,expectedSize,"Sutun sayisi");

        softAssert.assertAll();
        Driver.closeDriver();



    }



}
