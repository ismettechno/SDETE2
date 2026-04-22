package Gun04;

import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _01_GetAttributeGetCssValue {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://form.jotform.com/221934510376353");

        WebElement element=driver.findElement(By.id("sublabel_8_first"));

        // Parametrelerinin değerleri
        System.out.println("elemen.getAttribute(class) = " + element.getAttribute("class"));
        System.out.println("elemen.getAttribute(for) = " + element.getAttribute("for"));
        System.out.println("elemen.getAttribute(id) = " + element.getAttribute("id"));
        System.out.println("elemen.getAttribute(style) = " + element.getAttribute("style"));

        // Şekillendiren özellikleri, renk, fontu, background yani class ın içindekiler
        System.out.println("elemen.getCssValue(color) = " + element.getCssValue("color"));
        System.out.println("elemen.getCssValue(font-size) = " + element.getCssValue("font-size"));
        System.out.println("elemen.getCssValue(font-family) = " + element.getCssValue("font-family"));
        System.out.println("elemen.getCssValue(min-height) = " + element.getCssValue("min-height"));


        MyFunc.Bekle(5);
        driver.quit();
    }
}
