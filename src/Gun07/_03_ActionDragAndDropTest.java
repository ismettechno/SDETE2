package Gun07;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class _03_ActionDragAndDropTest extends BaseDriver {

    @Test
    public void test1() {
        driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
        MyFunc.Bekle(2);

        WebElement sourceElement=driver.findElement(By.id("draggable"));
        WebElement targetElement=driver.findElement(By.id("droppable"));

        Actions aksiyonlar=new Actions(driver);

        //1.yöntem
       // aksiyonlar.clickAndHold(sourceElement).build().perform(); // taşınacak elemnti tıkla al
       // aksiyonlar.moveToElement(targetElement).release().build().perform(); // üzerine götür ve bırak

        //2.yöntem
        aksiyonlar.dragAndDrop(sourceElement, targetElement).build().perform();

        System.out.println(targetElement.getCssValue("background-color"));
        Assert.assertTrue("Taşıma işlemi yapaılamdı",
                targetElement.getCssValue("background-color").equals("rgba(255, 250, 144, 1)"));

        BekleKapat();
    }
}
