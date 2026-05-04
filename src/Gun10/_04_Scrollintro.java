package Gun10;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;

public class _04_Scrollintro extends BaseDriver {

    @Test
    public void Test1() {
        driver.get("https://www.selenium.dev/selenium/web/scrolling_tests/frame_with_nested_scrolling_frame_out_of_view.html");
        MyFunc.Bekle(2);

        JavascriptExecutor js=(JavascriptExecutor)driver;

        js.executeScript("window.scrollTo(0,1000)");  // dikey yönde 1000 pixel baştan kaydır
        MyFunc.Bekle(2);

        js.executeScript("window.scrollBy(0,1000)");  // dikey yönde bulunduğun yerden 1000 pixel kaydır
        MyFunc.Bekle(2);

        js.executeScript("window.scrollBy(0,-2000)");  // dikey yönde bulunduğun yerden 2000 pixel geri kaydır


        BekleKapat();
    }

}
