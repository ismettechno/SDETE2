package Gun08;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _05_Alertler extends BaseDriver {

    @Test
    public void Test1() {
        driver.get("https://www.selenium.dev/selenium/web/alerts.html");
        MyFunc.Bekle(2);

        WebElement clickMe= driver.findElement(By.id("alert"));
        clickMe.click();
        MyFunc.Bekle(2);
        //su anda alert çıkmış oldu

        driver.switchTo().alert().accept();  // Alertin OK butonuna bas

        BekleKapat();
    }

    @Test
    public void Test2() {
        driver.get("https://www.selenium.dev/selenium/web/alerts.html");
        MyFunc.Bekle(2);

        WebElement clickMe= driver.findElement(By.id("confirm"));
        clickMe.click();
        MyFunc.Bekle(2);
        //su anda alert çıkmış oldu

        driver.switchTo().alert().dismiss();  // Alertin Cancel butonuna bas

        BekleKapat();
    }

}
