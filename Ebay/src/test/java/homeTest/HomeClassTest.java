package homeTest;

import base.CommonAPI;
import home.HomeClass;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class HomeClassTest extends CommonAPI {

    HomeClass object;

    @BeforeMethod
    public void init(){
        object = PageFactory.initElements(driver,HomeClass.class);
    }

    @Test
    public void setLoginSignTest(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        object.setLoginSign();
    }
    @Test
    public void setLoginSignValidationTest(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        setLoginSignTest();
        object.setLoginSignValidation();
    }
}
