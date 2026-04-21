package Gun03;

import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _03_FindingByName {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://form.jotform.com/221934510376353");
        MyFunc.Bekle(2);

        WebElement isimKutusu=driver.findElement(By.name("q8_name[first]"));
        isimKutusu.sendKeys("İsmet");

        MyFunc.Bekle(2);

        WebElement soyisimKutusu = driver.findElement(By.name("q8_name[last]"));
        soyisimKutusu.sendKeys("Temur");

        MyFunc.Bekle(3);
        driver.quit();
    }
}
