package home;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;



import static home.HomeElements.*;

public class MotorsClass extends CommonAPI {

    @FindBy(how = How.CSS, using = MotorsCCS)
    public WebElement motors;
    @FindBy(how = How.XPATH, using = BoatXP)
    public WebElement boat;
    @FindBy(how = How.XPATH, using = BoatVerificationXP)
    public WebElement boatVerification;
    @FindBy(how = How.XPATH, using = ClassicsXP)
    public WebElement classics;
    @FindBy(how = How.XPATH, using = ClassicsVerificationXP)
    public WebElement classicsVerification;
    @FindBy(how = How.XPATH, using = MotorcyclesXP)
    public WebElement motorcycles;
    @FindBy(how = How.XPATH, using = MotorcyclesVerificationXP)
    public WebElement motorcyclesVerification;
    @FindBy(how = How.XPATH, using = PowersportsXP)
    public WebElement powersports;
    @FindBy(how = How.XPATH, using = PowersportsVerificationXP)
    public WebElement powersportsVerification;

    public void setBoat(){
        Actions actions = new Actions(driver);
        actions.moveToElement(motors).build().perform();
        sleepFor(3);
        boat.click();
        sleepFor(3);
    }
    public void setBoatVerification(){
         String ActualText =  boatVerification.getText();
         String ExpectedText = "Boats";
         Assert.assertEquals(ActualText,ExpectedText,"Text matched");
    }
    public void setClassics(){
        Actions actions = new Actions(driver);
        actions.moveToElement(motors).build().perform();
        sleepFor(3);
        classics.click();
        sleepFor(3);
    }
    public void setClassicsVerification(){
        String ActualText =  classicsVerification.getText();
        String ExpectedText = "Classic Cars";
        Assert.assertEquals(ActualText,ExpectedText,"Text matched");
    }
    public void setMotorcycles(){
        Actions actions = new Actions(driver);
        actions.moveToElement(motors).build().perform();
        sleepFor(3);
        motorcycles.click();
        sleepFor(3);
    }
    public void setMotorcyclesVerification(){
        String ActualText =  motorcyclesVerification.getText();
        String ExpectedText = "Motorcycles";
        Assert.assertEquals(ActualText,ExpectedText,"Text matched");
    }
    public void setPowersports(){
        Actions actions = new Actions(driver);
        actions.moveToElement(motors).build().perform();
        sleepFor(3);
        powersports.click();
        sleepFor(3);
    }
    public void setPowersportsVerification(){
        String ActualText =  powersportsVerification.getText();
        String ExpectedText = "Powersport Vehicles";
        Assert.assertEquals(ActualText,ExpectedText,"Text matched");
    }
}
