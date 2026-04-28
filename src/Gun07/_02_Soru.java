package Gun07;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class _02_Soru extends BaseDriver {
    //    https://www.hepsiburada.com.tr/ sayfasına gidiniz.
    //    Moda -> Pantolon  click
    //    tıklatma işleminden sonra URL de
    //    pantolon kelimesinin geçtiğini doğrulayın.
    //    Yukarıdaki aksyonlar için Actions sınıfını kullanınız

    @Test
    public void test1() {
        driver.get("https://www.hepsiburada.com/");
        MyFunc.Bekle(2);

        WebElement element=driver.findElement(By.xpath("//*[text()='Moda']"));
        new Actions(driver).moveToElement(element).build().perform();

        WebElement pantolon= driver.findElement(By.xpath("(//*[text()='Pantolon'])[2]"));
        new Actions(driver).click(pantolon).build().perform(); //pantolon.click();
        MyFunc.Bekle(2);

        Assert.assertTrue("Pantolon URL de bulunamadı",driver.getCurrentUrl().toLowerCase().contains("pantolon"));
        BekleKapat();
    }

}
