package Gun06;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _06_ActionRightClickTest extends BaseDriver {

    @Test
    public void test1() {
        driver.get("https://demoqa.com/buttons");

        WebElement rightClickBtn = driver.findElement(By.xpath("//button[@id='rightClickBtn']"));
        MyFunc.Bekle(2);

        Actions aksiyonlar = new Actions(driver);
        Action aksiyon = aksiyonlar.moveToElement(rightClickBtn).contextClick().build();
        aksiyon.perform();

        //new Actions(driver).contextClick(rightClickBtn).build().perform();
        BekleKapat();
    }
}