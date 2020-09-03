package homeTest;

import base.CommonAPI;
import home.MotorsClass;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class MotorsClassTest extends CommonAPI {

    MotorsClass obj;

    @BeforeMethod
    public void init(){
        obj = PageFactory.initElements(driver, MotorsClass.class);
    }

    @Test
    public void setBoatTest(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        obj.setBoat();
    }
    @Test
    public void setBoatVerificationTest(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        setBoatTest();
        obj.setBoatVerification();
    }
    @Test
    public void setClassicsTest(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        obj.setClassics();
    }
    @Test
    public void setClassicsVerificationTest(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        setClassicsTest();
        obj.setClassicsVerification();
    }
    @Test
    public void setMotorcyclesTest(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        obj.setMotorcycles();
    }
    @Test
    public void setMotorcyclesVerificationTest(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        setMotorcyclesTest();
        obj.setMotorcyclesVerification();
    }
    @Test
    public void setPowersportsTest(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        obj.setPowersports();
    }
    @Test
    public void setPowersportsVerificationTest(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        setPowersportsTest();
        obj.setPowersportsVerification();
    }
}
