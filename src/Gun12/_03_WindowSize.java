package Gun12;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.Dimension;


public class _03_WindowSize extends BaseDriver {

    @Test
    public void Test1() {
        driver.get("https://www.youtube.com/");
        MyFunc.Bekle(5);

        driver.manage().window().maximize(); //  tarayıcıyı max size getiriyor
        Dimension tarayiciBoyutu= driver.manage().window().getSize();
        System.out.println("tarayiciBoyutu.width = " + tarayiciBoyutu.width);
        System.out.println("tarayiciBoyutu.height = " + tarayiciBoyutu.height);
        MyFunc.Bekle(2);

        Dimension yeniBoyut=new Dimension(516,600);
        driver.manage().window().setSize(yeniBoyut);
        //testler e devam ediyorum

        BekleKapat();
    }

}
