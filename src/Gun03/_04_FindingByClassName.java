package Gun03;

import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class _04_FindingByClassName {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://form.jotform.com/221934510376353");
        MyFunc.Bekle(2);

        WebElement element=driver.findElement(By.className("form-sub-label"));
        System.out.println("element in gözüken yazısı= " + element.getText());
        // getText() -> WebElemntin ekranda gözüken yazısını verir
        // findElement:  locator birden fazla elemanı işaret ediyorsa bile, ilkini bulur

        // Bütün elemanları almak için findElemenS kullanılır
        List<WebElement> elementler= driver.findElements(By.className("form-sub-label"));
        System.out.println("elementler.size() = " + elementler.size());
        for(WebElement e : elementler)
            System.out.println(e.getText());

        MyFunc.Bekle(3);
        driver.quit();
    }
}
