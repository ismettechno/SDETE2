package Gun09;

import Utility.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _08_IFrameGiris extends BaseDriver {

    @Test
    public void Test1() {
        driver.get("https://demo.automationtesting.in/Frames.html");

        driver.switchTo().frame("SingleFrame");

        WebElement text=driver.findElement(By.xpath("//input[@type='text']"));
        text.sendKeys("merhaba");

        driver.switchTo().defaultContent(); // ana sayfaya git
        driver.switchTo().parentFrame(); // bir geri yani parente git

        BekleKapat();
    }


}
