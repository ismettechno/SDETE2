package Gun02;

import Utility.MyFunc;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _01_OpeningWebsite {
    public static void main(String[] args) {

        WebDriver tarayici=new ChromeDriver();

        tarayici.get("https://www.google.com/");


        MyFunc.Bekle(3);
        tarayici.quit();
    }
}
