package Gun10;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class _07_JavaScriptClick extends BaseDriver {

    @Test
    public void Test1() {
        driver.get("https://demo.automationtesting.in/Frames.html");
        MyFunc.Bekle(2);

        WebElement ciftFrameLink= driver.findElement(By.xpath("//a[@href='#Multiple']"));

        JavascriptExecutor js=(JavascriptExecutor)driver;

        js.executeScript("arguments[0].click();" , ciftFrameLink);
        // içerden kod ile tıklatıldı

        MyFunc.Bekle(5);
        BekleKapat();
    }



}
