package regression;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class iFrameClass extends CommonAPI {

    public void setiFrame(){

        //Finding all iframe tags on a web page

        List<WebElement> elements = driver.findElements(By.tagName("iframe"));
        int numberOfTags = elements.size();
        System.out.println("No. of Iframes on this Web Page are: " +numberOfTags);

        for (WebElement st:elements) {
            System.out.println(st);
        }
        // switch to iframe by index
        driver.switchTo().frame(1);

        // switch back to a parent frame
        driver.switchTo().parentFrame();

        // Print the frame source code
        System.out.println("Frame Source" +driver.getPageSource());

        // Switch back to main web page
        driver.switchTo().defaultContent();
    }
}
