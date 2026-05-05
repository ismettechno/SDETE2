package Gun11;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Set;

public class _02_WindowsSoru extends BaseDriver {
    /*
    Senaryo:
    https://www.selenium.dev/ adresindeki ayrı tab da açılan linklere tıklatınız.
    Açılan bütün yeni tablardaki sayfaların title ve url lerini yazdırınız.
    Daha sonra Anasayfa harici diğer tüm sayfaları kapatınız.

    // driver.quit();  // bütün açılmış windowları kapatır
    // driver.close(); // sadece bulunduğun window u kapatır.
    */
    @Test
    public void Test1() {
        driver.get("https://www.selenium.dev/");
        MyFunc.Bekle(2);

        String anaSayfaWindowID= driver.getWindowHandle();

        JavascriptExecutor js=(JavascriptExecutor)driver;

        List<WebElement> linkler=driver.findElements(By.cssSelector("a[target='_blank']"));
        for (WebElement link : linkler)
            if (link.getAttribute("href").length() > 5 )
                js.executeScript("arguments[0].click();", link);

        Set<String> windowsIDler=driver.getWindowHandles(); // tüm açık olan Windowların ID leri
        for(String id : windowsIDler) {
            System.out.println("id = " + id);

            driver.switchTo().window(id);  // sıradaki window a geç
            System.out.println(driver.getCurrentUrl()+" "+driver.getTitle());
        }

        for(String id : windowsIDler) {
            if (id.equals(anaSayfaWindowID)) continue; // anasayfaya denk geldiysen pas geç

            driver.switchTo().window(id);  // sıradaki window a geç
            driver.close(); // bulunduğum window u kapatır
        }


        BekleKapat();
    }



}
