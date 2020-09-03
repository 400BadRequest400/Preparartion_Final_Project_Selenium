package regressionTest;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import regression.DragAndDropClass;
import reporting.TestLogger;
import sun.jvm.hotspot.debugger.Page;

public class DragAndDropTest extends CommonAPI {

    DragAndDropClass obj;

    @BeforeMethod
    public void init(){
        obj= PageFactory.initElements(driver,DragAndDropClass.class);
    }


    @Test
    public void setdragAndDropTest(){
        obj.setdragAndDrop();
    }
    @Test
    public void DragAndDropVerificationTest(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        setdragAndDropTest();
        obj.DragAndDropVerification();
    }
}
