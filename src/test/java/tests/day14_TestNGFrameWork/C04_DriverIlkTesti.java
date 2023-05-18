package tests.day14_TestNGFrameWork;

import org.testng.annotations.Test;
import utilities.Driver;
import utilities.ReusableMethods;

public class C04_DriverIlkTesti {

    /*
        POM de driver olusturmak icin
        inheritance ile kullandigimiz TestBase class i yerine
        static yollarla ulasabilecegimiz bir method kullanilmasi tercih edilmistir.
     */

    @Test
    public void test01(){

        // amazon ana sayfaya gidin
        Driver.getDriver().get("https://www.amazon.com");

        Driver.getDriver().get("https://www.wisequarter.com");

        Driver.getDriver().get("https://www.youtube.com");
        // Nutella icin arama yapin

        // Arama sonuclarinin Nutella kelimesi icerdigini test edin
        ReusableMethods.bekle(5);
        Driver.closeDriver();

    }
}
