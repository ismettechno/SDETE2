package Gun03;

import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class _05_FindElementVeFindElements {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://form.jotform.com/221934510376353");

        //WebElement element= driver.findElement(By.className("CookiesAccept"));
        // no such element: element bulunamadı

        List<WebElement> elementler= driver.findElements(By.className("CookiesAccept"));
        if (elementler.size() > 0) // elementi bulmuşsa >0
            System.out.println("Accept işlemleri yapıldı"); // elementler[0]. tıklanıyor
        else
            System.out.println("Element bulunamadı");

        // tek element olduğu halde, bazen çıkan bazen çıkmayan elementler için,
        // yine findelementS kullanılır, size ına bakılarak işlem yapılır veya devam edilir
        // böylece hata almadan işleme devam edilebilir

        MyFunc.Bekle(3);
        driver.quit();
    }
}
