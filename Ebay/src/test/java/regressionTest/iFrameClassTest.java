package regressionTest;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import regression.iFrameClass;
import reporting.TestLogger;

public class iFrameClassTest extends CommonAPI {

    iFrameClass obj;

    @BeforeMethod
    public void init(){
        obj = PageFactory.initElements(driver,iFrameClass.class);
    }
    @Test
    public void setiFrameTest(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        obj.setiFrame();
    }
}
