package Gun11;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Set;

public class _01_WindowsGiris extends BaseDriver {

    @Test
    public void Test1() {
        driver.get("https://www.selenium.dev/");
        MyFunc.Bekle(2);

        String currentWindowID= driver.getWindowHandle(); // Bulunduğum window un ID sini verdi

        JavascriptExecutor js=(JavascriptExecutor)driver;

        List<WebElement> linkler=driver.findElements(By.cssSelector("a[target='_blank']")); // yeni tabda açılan pencereler
        for (WebElement link : linkler)
            js.executeScript("arguments[0].click();", link);

        Set<String> windowsIDler=driver.getWindowHandles(); // tüm açık olan Windowların ID leri
        for(String id : windowsIDler)
            System.out.println("id = " + id);

        //en baştaki window a tab a nasıl geçir yapardım
        driver.switchTo().window(currentWindowID);

        MyFunc.Bekle(3);
        BekleKapat();
    }


}
