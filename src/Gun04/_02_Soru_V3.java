package Gun04;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.junit.Test;

public class _02_Soru_V3 extends BaseDriver {

    @Test
    public void Test1()
    {
        driver.get("https://form.jotform.com/221934510376353");

        WebElement isimKutusu=driver.findElement(By.id("first_8"));
        isimKutusu.sendKeys("İsmet");

        WebElement soyisimKutusu = driver.findElement(By.id("last_8"));
        soyisimKutusu.sendKeys("Temur");

        MyFunc.Bekle(2);

        WebElement btnSubmit = driver.findElement(By.id("input_2"));
        btnSubmit.click();

        WebElement tesekkurYazisi = driver.findElement(By.className("thankyou-main-text"));

        Assert.assertTrue("Aranılan mesaj bulunmadı", tesekkurYazisi.getText().contains("Thank") );
        //Ben true bekliyorum, değilse göster, yoksa test passed

        BekleKapat();
    }

}
