package Gun10;

import Utility.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class _02_Soru extends BaseDriver {
    // Senaryo:
    // https://demo.automationtesting.in/Frames.html sayfasına gidiniz
    // "Iframe with in an Iframe"   butonuna tıklatınız.
    // Açılan kutucuğa isminizi yazdırınız
    // Daha sonra  "iFrame Demo" isimli yazının olduğu elemanın getText ini yazıdırnız.
    // Daha sonra  "Nested iFrames" isimli yazının olduğu elemanın getText ini yazdırınız.
    // en son ana sayfanın Title ını yazdırınız.
    @Test
    public void Test1() {
        driver.get("https://demo.automationtesting.in/Frames.html");

        List<WebElement> consentButton= driver.findElements(By.xpath("//*[text()='Consent']"));
        if (consentButton.size()>0) // bu element var ise ekranda
            consentButton.get(0).click();

        WebElement ciftFrameLink= driver.findElement(By.xpath("//a[@href='#Multiple']"));
        ciftFrameLink.click();

        WebElement iframe1=driver.findElement(By.xpath("//div[@id='Multiple']/iframe"));
        driver.switchTo().frame(iframe1);

        driver.switchTo().frame(0); // en içerdeki iframe sayfaya ulaşmış oldum

        //şu anda en içteki iframe deyim
        WebElement yaziKutusu=driver.findElement(By.xpath("//input[@type='text']"));
        yaziKutusu.sendKeys("İsmet Temur");

        WebElement ictekiYazi=driver.findElement(By.xpath("//*[@class='container']/h5"));
        System.out.println("ictekiYazi.getText() = " + ictekiYazi.getText());

        driver.switchTo().parentFrame();  // en içten bir frame geri geldim
        WebElement parentYazi=driver.findElement(By.xpath("//*[@class='iframe-container']/h5"));
        System.out.println("parentYazi = " + parentYazi.getText());

        //driver.switchTo().parentFrame();  // bir geri çık
        driver.switchTo().defaultContent(); // en dışa git
        System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl());

        BekleKapat();
    }



}
