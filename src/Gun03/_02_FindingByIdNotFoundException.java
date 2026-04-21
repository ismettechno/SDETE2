package Gun03;

import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _02_FindingByIdNotFoundException {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://form.jotform.com/221934510376353");

        try {
            driver.findElement(By.id("first"));
        }
        catch(Exception ex)
        {
            System.out.println("Web element bulunamadı");
        }

        MyFunc.Bekle(5);
        driver.quit();
    }
}
