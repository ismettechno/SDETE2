package Gun05;

import Utility.BaseDriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _02_Soru extends BaseDriver {
    // Senaryo:
    // 1-  https://qa-practice.netlify.app/auth_ecommerce  sayfasınız açınız
    // 2-  Email kutucuğuna "admin@admin.com" i yaziniz
    // 3-  Password kutucuğuna "admin123" yazdırınız
    // 4-  Submit butona tıklatınız (click)
    // 5-  Açılan yeni sayfada "SHOPPING CART" yazısının göründüğünü Assert ile doğrulayınız
    // Not : (Bu soruda bulunacak elemanın hiç bir attribute kullanılmadan elemanlar bulunmalıdır.)

    @Test
    public void Test1()
    {
        driver.get("https://qa-practice.netlify.app/auth_ecommerce");

        WebElement email=driver.findElement(By.cssSelector("[id='emailHelp']~input"));
        email.sendKeys("admin@admin.com");

        WebElement password=driver.findElement(By.cssSelector("form[id='login']> :nth-child(2) > input"));
        password.sendKeys("admin123");

        WebElement submit=driver.findElement(By.cssSelector("form[id='login']> button"));
        submit.click();

        WebElement shoppingCartMesaj=driver.findElement(By.cssSelector("[id='prooood'] h2"));

        Assert.assertTrue("Aranılan mesaj bulunmadı",shoppingCartMesaj.getText().contains("SHOPPING CART") );

        BekleKapat();

    }


}
