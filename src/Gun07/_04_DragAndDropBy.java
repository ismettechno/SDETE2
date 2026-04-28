package Gun07;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class _04_DragAndDropBy extends BaseDriver {

    @Test
    public void test1() {
        driver.get("http://talkerscode.com/webtricks/demo/demo_price-range-slider-using-jquery-css-and-php.php");
        MyFunc.Bekle(2);

        // consent
        List<WebElement> ConsentButton=driver.findElements(By.xpath("//*[text()='Consent']"));
        if (ConsentButton.size() > 0) // Consent ekranda gözüktüyse
            ConsentButton.get(0).click();

        Actions aksiyonDriver = new Actions(driver);
        WebElement solSurgu = driver.findElement(By.xpath("//div[@id='slider-range']/span[1]"));
        aksiyonDriver.dragAndDropBy(solSurgu, 100 ,0).build().perform();
        // yatay yönde 100 ileri, dikey yönde 0 hareket
        // + değer girdiğimizde sağa dogru, - değer girdiğimizde sola dogru kaydırıyor

        MyFunc.Bekle(2);
        WebElement sagSurgu = driver.findElement(By.xpath("//div[@id='slider-range']/span[2]"));
        aksiyonDriver.dragAndDropBy(sagSurgu, -100, 0);


        BekleKapat();
    }



}
