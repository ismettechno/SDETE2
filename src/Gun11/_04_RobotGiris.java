package Gun11;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.Set;

public class _04_RobotGiris extends BaseDriver {

    @Test
    public void Test1() throws AWTException {
        driver.get("https://www.selenium.dev/");
        MyFunc.Bekle(2);

        //Klavyeden ctrl+tab a basarak yeni bir sekme açıp, başka sayfa çağıralım.
        // Bunu bu sefer ROBOT class la yapalım
        Robot rbt=new Robot(); //Klavye robotu

        // ctr basıyorum sonra T ye basıyorum , T yi bırakıyorum sonra ctrl yi borakıyorum
        rbt.keyPress(KeyEvent.VK_CONTROL); // ctrl  ye bastım
        rbt.keyPress(KeyEvent.VK_T); // T ye bas
        rbt.keyRelease(KeyEvent.VK_T); // T yi bırak
        rbt.keyRelease(KeyEvent.VK_CONTROL);  // ctrl yi bırak
        MyFunc.Bekle(2);

        // yeni açılmış TAB(window) a geçelim
        Set<String> idler=driver.getWindowHandles();
        Iterator gosterge= idler.iterator();
        gosterge.next();  // anasayfanın id si
        String yeniWindowID=gosterge.next().toString();  // sonraki sayafanın id si

        driver.switchTo().window(yeniWindowID); // yeniwindow a geçtim
        driver.get("https://www.facebook.com/");

        BekleKapat();
    }

}
