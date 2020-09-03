package homeTest;

import base.CommonAPI;
import home.SearchClass;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class SearchClassTest extends CommonAPI {

    SearchClass object;

    @BeforeMethod
    public void init(){
        object = PageFactory.initElements(driver,SearchClass.class);
    }

    @Test
    public void setSearchBoxTest(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        object.setSearchBox("i phone 11 pro max");
    }
    @Test
    public void setSearchBoxVerificationTest(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        setSearchBoxTest();
        object.setSearchBoxVerification();
    }
}
