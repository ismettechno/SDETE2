package Gun11;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.WindowType;

public class _03_WindowYeni extends BaseDriver {

    @Test
    public void Test1() {
        driver.get("https://www.selenium.dev/");
        MyFunc.Bekle(2);

        driver.switchTo().newWindow(WindowType.TAB);
        // hem yeni window açıyor, hemde açılan bu taba a geçiş yapıyor

        driver.get("https://www.facebook.com/");

        BekleKapat();
    }
}
