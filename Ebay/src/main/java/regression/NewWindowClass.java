package regression;

import base.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import static regression.RegressionElements.*;

public class NewWindowClass extends CommonAPI {

    @FindBy(how = How.CSS, using = FashionButtonCSS)
    public WebElement fashionButton;
    @FindBy(how = How.XPATH, using = FashionVerificationXP)
    public WebElement fashionVerification;

    public void NewWindow(){

        Actions actions = new Actions(driver);
        actions.moveToElement(fashionButton).contextClick().sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).sendKeys(Keys.ENTER).build().perform();
        sleepFor(5);
    }

    public void NewWindowValidation(){
        String ActualResult = fashionVerification.getText();
        String ExpectedResult = "Fashion";
        System.out.println(ActualResult+"  "+ExpectedResult);
        Assert.assertEquals(ActualResult,ExpectedResult, "Test Passed");
        sleepFor(3);
    }
}
