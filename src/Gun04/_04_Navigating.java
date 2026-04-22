package Gun04;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _04_Navigating extends BaseDriver {

    @Test
    public void Test1()
    {
        driver.navigate().to("https://testpages.eviltester.com/styled/index.html");
        // navigate().to -> get ile aynı, history için kullanılır, ileri - geri için
        MyFunc.Bekle(3);

        WebElement link=driver.findElement(By.linkText("Javalin"));
        link.click(); // linke tıklattım yeni sayfayı açtım
        MyFunc.Bekle(3);
        System.out.println("Sayfanın title ı = " + driver.getTitle());
        System.out.println("Sayfanın url si = " + driver.getCurrentUrl());

        driver.navigate().back();  // back: geri,  bir önceki sayfaya git
        MyFunc.Bekle(3);
        System.out.println("Sayfanın title ı = " + driver.getTitle());
        System.out.println("Sayfanın url si = " + driver.getCurrentUrl());

        driver.navigate().forward(); // forward:ileri ,   bir sonraki sayfaya git.
        MyFunc.Bekle(3);
        System.out.println("Sayfanın title ı = " + driver.getTitle());
        System.out.println("Sayfanın url si = " + driver.getCurrentUrl());

        Assert.assertTrue("En ileri sayfa bulunamadı",driver.getTitle().contains("Javalin") );

        BekleKapat();
    }


}
