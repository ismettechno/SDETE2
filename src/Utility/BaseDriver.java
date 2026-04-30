package Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BaseDriver {
    public static WebDriver driver;
    public static WebDriverWait bekle;

    // bunun sarti extends olmasi ve basta yer almasi
    // ilk burası çalışır extend olduğu yerde
    static
    {
        KalanOncekileriKapat();
        driver = new ChromeDriver();

        driver.manage().window().maximize(); // Ekranı max yapıyor.
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30)); // 20 sn mühlet: sayfayı yükleme mühlet
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); // 5 sn mühlet: elementi bulma mühleti

        bekle=new WebDriverWait(driver, Duration.ofSeconds(20));
    }

    public static void BekleKapat()
    {
        MyFunc.Bekle(3);
        driver.quit();
    }

    // hafızada kalmış, Selenium açtığı boştaki tarayıcıları temizler
    public static void KalanOncekileriKapat() {
        try {
            Runtime.getRuntime().exec("taskkill /F /IM chromedriver.exe /T");
        } catch (Exception ignored) {
        }
    }

}
