package Gun04;

import Utility.BaseDriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _03_Soru extends BaseDriver {
    // Senaryo:
    // 1-  https://qa-practice.netlify.app/auth_ecommerce  sayfasınız açınız
    // 2-  Email kutucuğuna "admin@admin.com" i yaziniz
    // 3-  Password kutucuğuna "admin123" yazdırınız
    // 4-  Submit butona tıklatınız (click)
    // 5-  Açılan yeni sayfada "SHOPPING CART" yazısının göründüğünü Assert ile doğrulayınız

    @Test
    public void Test1()
    {
        driver.get("https://qa-practice.netlify.app/auth_ecommerce");

        WebElement email=driver.findElement(By.id("email"));
        email.sendKeys("admin@admin.com");

        WebElement password=driver.findElement(By.id("password"));
        password.sendKeys("admin123");

        WebElement submit=driver.findElement(By.id("submitLoginBtn"));
        submit.click();

        WebElement shoppingCartMesaj=driver.findElement(By.className("section-header"));

        Assert.assertTrue("Aranılan mesaj bulunmadı",shoppingCartMesaj.getText().contains("SHOPPING CART") );

        BekleKapat();
    }


}
