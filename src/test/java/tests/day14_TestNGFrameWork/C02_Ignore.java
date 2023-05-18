package tests.day14_TestNGFrameWork;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class C02_Ignore {

    /*
    @Ignore rotasyonu
    basina yazdigi testin Ignore edilmesini saglar
     */

    @Test(priority = 65)
    public void youtubeTesti(){
        System.out.println("Youtube");
    }

    @Test (priority = -3) @Ignore
    public void wiseTesti (){
        System.out.println("Wise Quarter");
    }

    @Test
    public void amazonTesti(){ // priority yazılmazsa 0 degeri alır
        System.out.println("Amazon");
    }
}
