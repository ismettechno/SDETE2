package Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseDriver {
    public static WebDriver driver;

    // bunun sarti extends olmasi ve basta yer almasi
    // ilk burası çalışır extend olduğu yerde
    static
    {
        driver = new ChromeDriver();
    }

    public static void BekleKapat()
    {
        MyFunc.Bekle(3);
        driver.quit();
    }

}
