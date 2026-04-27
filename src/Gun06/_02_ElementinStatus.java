package Gun06;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _02_ElementinStatus extends BaseDriver {

    @Test
    public void Test1() {
        driver.get("http://samples.gwtproject.org/samples/Showcase/Showcase.html#!CwCheckBox");
        MyFunc.Bekle(2);

        WebElement sali=driver.findElement(By.xpath("//input[@id='gwt-debug-cwCheckBox-Tuesday-input']"));
        // WebElementin durumları: GörünürDurumdaMı,EtkinDurumdaMı,SeçiciliDurumdaMı

        System.out.println("sali.isDisplayed() = " + sali.isDisplayed()); // web de görünüyor mu
        System.out.println("sali.isEnabled() = " + sali.isEnabled()); // web de etkin mi
        System.out.println("sali.isSelected() = " + sali.isSelected()); // seçili mi (çekli mi)

        sali.click();
        System.out.println("sali.isSelected() = " + sali.isSelected()); // seçili mi (çekli mi)

        /*** cumartesi ***/
        WebElement cumartesi=driver.findElement(By.xpath("//input[@id='gwt-debug-cwCheckBox-Saturday-input']"));
        System.out.println("cumartesi.isDisplayed() = " + cumartesi.isDisplayed()); // web de görünüyor mu
        System.out.println("cumartesi.isEnabled() = " + cumartesi.isEnabled());  // web de etkin mi
        System.out.println("cumartesi.isSelected() = " + cumartesi.isSelected());  // seçili mi (çekli mi)

        BekleKapat();
    }


}
