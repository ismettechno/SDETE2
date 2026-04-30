package Gun09;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class _03_ImplicitlyWait extends BaseDriver {

    @Test
    public void Test1() {
        driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");

        WebElement btn=driver.findElement(By.xpath("//button[@onclick='timedText()']"));
        btn.click();

        //MyFunc.Bekle(600);  600 dn her durumda bekler, web tarafıyla ilgisi yok

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(600));
        //findElement için verilen mühlet, fakat locator bulunduğu anda devam eder
        // geri kalan süreyi beklemez

        WebElement msj=driver.findElement(By.xpath("//*[text()='WebDriver']"));
        System.out.println("msj = " + msj.getText());

        BekleKapat();
    }


}
