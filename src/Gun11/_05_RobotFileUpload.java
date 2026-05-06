package Gun11;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.awt.*;
import java.awt.event.KeyEvent;

public class _05_RobotFileUpload extends BaseDriver {

    @Test
    public void Test1() throws AWTException {
        driver.get("https://letcode.in/file");
        MyFunc.Bekle(2);

        Robot rbt = new Robot();

        //6 kere TAB a bas bırak
        for (int i = 0; i < 6; i++) {
            rbt.keyPress(KeyEvent.VK_TAB);
            rbt.keyRelease(KeyEvent.VK_TAB);
        }

        // sonra ENTER
        rbt.keyPress(KeyEvent.VK_ENTER);
        rbt.keyRelease(KeyEvent.VK_ENTER);
        MyFunc.Bekle(2);

        //10 kere TAB a bas bırak : Açılan pencereye gelecek
        for (int i = 0; i < 9; i++) {
            rbt.keyPress(KeyEvent.VK_TAB);
            rbt.keyRelease(KeyEvent.VK_TAB);
        }

        //10 kere TAB a bas bırak : Açılan pencereye gelecek
        rbt.keyPress(KeyEvent.VK_DOWN);
        rbt.keyRelease(KeyEvent.VK_DOWN);

        // sonra ENTER : desktop gözükmesi için
        rbt.keyPress(KeyEvent.VK_ENTER);
        rbt.keyRelease(KeyEvent.VK_ENTER);
        MyFunc.Bekle(1);

        // sağ satafa geçildi
        rbt.keyPress(KeyEvent.VK_TAB);
        rbt.keyRelease(KeyEvent.VK_TAB);
        MyFunc.Bekle(1);

        //10 kere TAB a bas bırak : Açılan pencereye gelecek
        for (int i = 0; i < 4; i++) {
            rbt.keyPress(KeyEvent.VK_DOWN);
            rbt.keyRelease(KeyEvent.VK_DOWN);
        }

        // sonra ENTER : seçilen dosya kabul edildi
        rbt.keyPress(KeyEvent.VK_ENTER);
        rbt.keyRelease(KeyEvent.VK_ENTER);

        MyFunc.Bekle(1);
        WebElement dosyaSecildiMesaji=driver.findElement(By.cssSelector("div[class='file']+p"));
        Assert.assertTrue("Dosya seçilemedi", dosyaSecildiMesaji.getText().toLowerCase().contains("test.txt"));

        BekleKapat();
    }



}
