package day14_TestNGFrameWork;

import org.testng.annotations.Test;

public class C01_Priority {

    /*
 JUnit framework'de testlerin calisma sirasi
        ONGORULEMEZ ve DUZENLENEMEZ
        TestNG testleri harf sirasina gore calistirir (ONGORULEBILIR)
        Ayrica priority degeri girerek testleri istedigimiz sira ile de calistirabiliriz
        (KONTROL EDILEBILIR SIRALAMA)
        priority sayisal olarak kucukten buyuge dogru testleri calistirir
        eger priority degeri ayni olan birden fazla test varsa, yine harf sirasina bakar
     */


    @Test(priority = 65)
    public void youtubeTesti(){
        System.out.println("Youtube");
    }

    @Test (priority = -3)
    public void wiseTesti (){
        System.out.println("Wise Quarter");
    }

    @Test
    public void amazonTesti(){ // priority yazılmazsa 0 degeri alır
        System.out.println("Amazon");
    }
}
