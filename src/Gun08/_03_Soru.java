package Gun08;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class _03_Soru extends BaseDriver {

// 1- https://formsmarts.com/form/yu?mode=h5 sitesini açın
// 2- discover XYZ ye tıklatın ve online Advertising i seçin
// 3- using XYZ yi tıklatın ve 3.seçeneği seçin

    @Test
    public void Test1() {
        driver.get("https://formsmarts.com/form/yu?mode=h5");
        MyFunc.Bekle(2);

        WebElement dropDownDiscover=driver.findElement(By.cssSelector("[id$='_4588']"));
        WebElement dropdownHowLong=driver.findElement(By.cssSelector("[id$='_4597']"));

        Select menuDiscover=new Select(dropDownDiscover);
        menuDiscover.selectByVisibleText("Online Advertising");

        Select menuHowLong=new Select(dropdownHowLong);
        menuHowLong.selectByVisibleText("I'm using XYZ for a month or more");

        BekleKapat();
    }



}
