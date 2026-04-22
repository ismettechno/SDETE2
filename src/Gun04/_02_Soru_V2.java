package Gun04;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _02_Soru_V2 extends BaseDriver {

    public static void main(String[] args) {
        //DriverBaslat();

        driver.get("https://form.jotform.com/221934510376353");

        WebElement isimKutusu=driver.findElement(By.id("first_8"));
        isimKutusu.sendKeys("İsmet");

        WebElement soyisimKutusu = driver.findElement(By.id("last_8"));
        soyisimKutusu.sendKeys("Temur");

        MyFunc.Bekle(2);

        WebElement btnSubmit = driver.findElement(By.id("input_2"));
        btnSubmit.click();

        WebElement tesekkurYazisi = driver.findElement(By.className("thankyou-main-text"));

        if (tesekkurYazisi.getText().contains("Thank"))
            System.out.println("TEST Passed");
        else
            System.out.println("TEST Fail");


        BekleKapat();
    }




}
