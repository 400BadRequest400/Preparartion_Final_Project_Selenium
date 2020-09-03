package regressionTest;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import regression.NewWindowClass;
import reporting.TestLogger;

public class NewWindowClassTest extends CommonAPI {

    NewWindowClass object;

    @BeforeMethod
    public void init(){
        object = PageFactory.initElements(driver,NewWindowClass.class);
    }
    @Test
    public void NewWindowTest(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        object.NewWindow();
    }
    @Test
    public void NewWindowValidationTest(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        NewWindowTest();
        object.NewWindowValidation();
    }
}
