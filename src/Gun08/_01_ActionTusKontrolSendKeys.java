package Gun08;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class _01_ActionTusKontrolSendKeys extends BaseDriver {

    @Test
    public void Test1() {
        driver.get("https://demoqa.com/auto-complete");
        MyFunc.Bekle(2);

        // txt a git, içine tıklat,b harfine bas, aşağı tuşa bas, enter a bas
        Actions aksiyonDriver=new Actions(driver);
        WebElement txtBox = driver.findElement(By.id("autoCompleteSingleInput"));

        aksiyonDriver
                .moveToElement(txtBox)
                .click()
                .sendKeys("b")
                .build()
                .perform();

        MyFunc.Bekle(2);

        aksiyonDriver
                .sendKeys(Keys.DOWN)
                .sendKeys(Keys.ENTER)
                .build()
                .perform();

        BekleKapat();
    }


}
