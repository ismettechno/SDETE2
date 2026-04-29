package Gun08;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class _02_SelectClass extends BaseDriver {

    @Test
    public void test1() {
        driver.get("https://www.amazon.com.tr/");
        MyFunc.Bekle(2);

        WebElement webSelectAnaElement=driver.findElement(By.id("searchDropdownBox"));
        WebElement optionKitaplar=driver.findElement(By.xpath("//option[text()='Kitaplar']"));

        //1.Yöntem
//        webSelectAnaElement.click();
//        optionKitaplar.click();

        //2.Yöntem
//        optionKitaplar.click();

        //Eğer bu elemntin TAG SELECT ise
        Select menuSelect=new Select(webSelectAnaElement);
//        menuSelect.selectByVisibleText("Kitaplar");
        menuSelect.selectByValue("search-alias=stripbooks");
//        menuSelect.selectByIndex(11);

        for(WebElement e: menuSelect.getOptions())
            System.out.println(e.getText());

        BekleKapat();
    }
}
