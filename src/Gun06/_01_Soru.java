package Gun06;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class _01_Soru extends BaseDriver {
    //        Senaryo
//        1- https://www.saucedemo.com/
//        2- login işlemini yapınız.
//        3- Sauce Labs Backpack  a tıklatın ve sepete ekletin.
//        4- Sonra geri dönün (Back to products e tıklatın)
//        5- Sauce Labs Bolt T-Shirt  a tıklatın ve sepete ekleyin.
//        6- sepete tıklatın
//        7- CheckOut a tıklatın
//        8- kullanıcı bilgilerini doldurup Continue ya tıklatın
//        9- Burada her bir eşyanın ücretlerinin toplamının aşağıdaki
//        Item total e eşit olup olmadığını Assert ile test ediniz.
//
//        Bu soruda tamamen XPATH kullanılacaktır.

    @Test
    public void Test1()
    {
        driver.get("https://www.saucedemo.com/");
        MyFunc.Bekle(2);

        WebElement username=driver.findElement(By.xpath("//input[@id='user-name']"));
        username.sendKeys("standard_user");
        MyFunc.Bekle(2);

        WebElement password=driver.findElement(By.xpath("//input[@id='password']"));
        password.sendKeys("secret_sauce");
        MyFunc.Bekle(1);

        WebElement loginButton= driver.findElement(By.xpath("//input[@id='login-button']"));
        loginButton.click();
        MyFunc.Bekle(1);


        //1.Ürün sepete ekleniyor
        MyFunc.Bekle(5);
        WebElement product1= driver.findElement(By.xpath("//*[text()='Sauce Labs Backpack']"));
        product1.click();
        MyFunc.Bekle(2);

        WebElement addToCart= driver.findElement(By.xpath("//button[@id='add-to-cart']"));
        addToCart.click();
        MyFunc.Bekle(2);

        WebElement btnBack= driver.findElement(By.xpath("//button[@id='back-to-products']"));
        btnBack.click();
        MyFunc.Bekle(2);

        //2.Ürün sepete ekleniyor
        WebElement product2= driver.findElement(By.xpath("//a[@id='item_1_title_link']/div")); //By.xpath("//*[text()='Sauce Labs Bolt T-Shirt']")
        product2.click();
        MyFunc.Bekle(2);

        WebElement addToCart2= driver.findElement(By.xpath("//button[@id='add-to-cart']"));
        addToCart2.click();
        MyFunc.Bekle(2);

        //sepete tıklatılıyor
        MyFunc.Bekle(2);
        WebElement sepet= driver.findElement(By.xpath("//a[@class='shopping_cart_link']")); //By.xpath("//div[@id='shopping_cart_container']")
        sepet.click();

        //checkout tıklatılıyor
        MyFunc.Bekle(2);
        WebElement buttonCheckOut= driver.findElement(By.xpath("//button[@id='checkout']"));
        buttonCheckOut.click();

        //Kullanıcı bilgileri giriliyor
        MyFunc.Bekle(2);
        WebElement firstname= driver.findElement(By.xpath("//input[@id='first-name']"));
        firstname.sendKeys("Kaan Hakan");

        MyFunc.Bekle(2);
        WebElement lastname= driver.findElement(By.xpath("//input[@id='last-name']"));
        lastname.sendKeys("Gül");

        MyFunc.Bekle(2);
        WebElement zipcode= driver.findElement(By.xpath("//input[@id='postal-code']"));
        zipcode.sendKeys("34777");

        //continue ya tıklatılıyor
        MyFunc.Bekle(2);
        WebElement btnContinue= driver.findElement(By.xpath("//input[@id='continue']"));
        btnContinue.click();

        //Sepetteki tüm ürünlerin fiyatlarını toptan alma
        List<WebElement> urunFiyatlari=driver.findElements(By.xpath("//*[@class='inventory_item_price']"));

        double urunFiyatlariToplami=0;
        for (WebElement e: urunFiyatlari) {
            System.out.println(e.getText()); //$29.99
            urunFiyatlariToplami+= Double.parseDouble(e.getText().replaceAll("[^0-9.,]","")); //$29.99  -> 29.99
        }
        System.out.println("urunFiyatlariToplami = " + urunFiyatlariToplami);

        //Alt toplamı bulalım:  item total alınıyor
        WebElement itemtotalElement= driver.findElement(By.xpath("//div[@class='summary_subtotal_label']"));
        double itemTotal=Double.parseDouble(itemtotalElement.getText().replaceAll("[^0-9,.]",""));

        Assert.assertTrue("Toplamlar hatalı" , itemTotal == urunFiyatlariToplami);

        BekleKapat();
    }



}
