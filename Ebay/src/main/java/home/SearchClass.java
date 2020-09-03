package home;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import static home.HomeElements.*;

public class SearchClass extends CommonAPI {

    @FindBy(how = How.XPATH, using = SearchBoxXP)
    public WebElement searchBox;
    @FindBy(how = How.CSS, using = SearchBoxVerificationXP)
    public WebElement searchBoxVerification;
    @FindBy(how = How.ID, using = SearchButtonID)
    public WebElement searchButton;

    // Action Method
    public void setSearchBox(String item){
        searchBox.sendKeys(item);
        sleepFor(4);
        searchButton.click();
    }

    //Validation Method
    public void setSearchBoxVerification(){
        String ActualText = searchBoxVerification.getText();
        String ExpectedText = "i phone 11 pro max";
        Assert.assertEquals(ActualText,ExpectedText,"text matches");
    }
}
