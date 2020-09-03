package regressionTest;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import regression.iFramesDemo;
import reporting.TestLogger;

public class iFrameDemoTest extends CommonAPI {

    iFramesDemo object;

    @BeforeMethod
    public void init(){
        object = PageFactory.initElements(driver,iFramesDemo.class);
    }

    @Test
    public void iFramesTest(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        object.setIframe();
    }
}
