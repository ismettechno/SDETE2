package Gun07;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class _05_ActionTusKontrolSendKeys extends BaseDriver  {

    @Test
    public void test1() {
        driver.get("https://demoqa.com/auto-complete");
        MyFunc.Bekle(3);

        WebElement txtBox = driver.findElement(By.id("autoCompleteMultipleInput"));

        new Actions(driver)
                .moveToElement(txtBox)
                .click()
                .keyDown(Keys.SHIFT)
                .sendKeys("a")
                .keyUp(Keys.SHIFT)
                .sendKeys("hmet")
                .build()
                .perform();

        BekleKapat();
    }


}
