package tests.day14_TestNGFrameWork;

import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class C03_DependsOnMethods {

    /*

        DependsOnmethods oncelik sirasina karismaz

        dependsOnMethods bir test methodun calismasini
        baska bir method un calisip passed olmasina baglar

        baglanilan method calismaz veya calisir ama failed olursa
        baglanan method hic calismaz

        @Test rotasyonu sayesinde her test bagımsiz olarak calistirilabilir

        Ancak bir test dependsOnMethods ile baska bir methoda baglanmıs ise
        tek basina calismasi istendiginde, once bagli oldugu test methodunu calistiri
        o method calisip passed olursa asil calistirmak istedigimiz methodda calisir



     */

    @Test (dependsOnMethods = "wiseTesti")
    public void youtubeTesti(){
        System.out.println("Youtube");

    }

    @Test (priority = 3)
    public void wiseTesti (){
        System.out.println("Wise Quarter");
    }

    @Test (dependsOnMethods = "youtubeTesti")
    public void amazonTesti(){ // priority yazılmazsa 0 degeri alır
        System.out.println("Amazon");
    }
}
