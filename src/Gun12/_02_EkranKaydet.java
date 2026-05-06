package Gun12;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class _02_EkranKaydet extends BaseDriver {

    @Test
    public void Test1() throws IOException {
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        MyFunc.Bekle(2);

//        WebElement username=driver.findElement(By.name("username"));
//        username.sendKeys("ismet");

        driver.findElement(By.name("username")).sendKeys("ismet");
        driver.findElement(By.name("password")).sendKeys("111111");
        driver.findElement(By.cssSelector("button[type='submit']")).click();

        List<WebElement> errorMsg=driver.findElements(By.xpath("//*[text()='Invalid credentials']"));
        if (errorMsg.size() > 0)  //hata olmuş demektir, ekran kaydını alalım
        {
            System.out.println("Hata oldu, ekran görüntüsünü alalım");

            TakesScreenshot ts=(TakesScreenshot)driver; // ekran kaydını alabilir hale getirildi
            File hafizadakiEkranGoruntusu= ts.getScreenshotAs(OutputType.FILE);  // dosyaya yazacak formatta ekrna görünütüsü al

            // hafızadaki bu bilgiyi fiziksel DOSYAYA yaz, fakat Java nın böyle bir komutu yok
            // bunun içilmiş içinde bir çokl utility olan commons.io  yu projemize ekleyelim.
            FileUtils.copyFile(hafizadakiEkranGoruntusu, new File("ekranGoruntuleri/screenShot.jpg"));
        }



        BekleKapat();
    }



}
