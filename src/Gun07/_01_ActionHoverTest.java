package Gun07;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class _01_ActionHoverTest extends BaseDriver {

    @Test
    public void test1() {
        driver.get("https://www.hepsiburada.com/");
        MyFunc.Bekle(2);

        WebElement element=driver.findElement(By.xpath("//*[text()='Moda']"));

        new Actions(driver).moveToElement(element).build().perform();

        BekleKapat();
    }
}
