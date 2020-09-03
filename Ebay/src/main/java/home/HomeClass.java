package home;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import static home.HomeElements.*;

public class HomeClass extends CommonAPI {

    @FindBy(how = How.XPATH, using = LogoSignXP)
    public WebElement loginSign;

    public void setLoginSign(){
        loginSign.click();
        sleepFor(3);
    }

    public void setLoginSignValidation(){

        String ActualResult = driver.getCurrentUrl();
        String ExpectedResult = "https://www.ebay.com/";
        Assert.assertEquals(ActualResult,ExpectedResult,"test passed");
        if (ActualResult.equalsIgnoreCase(ExpectedResult)){
            System.out.println("test passed");
        }else{
            System.out.println("test failed");
        }
    }
}
