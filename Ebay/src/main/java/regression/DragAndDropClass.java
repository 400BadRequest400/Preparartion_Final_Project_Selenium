package regression;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static regression.RegressionElements.*;

public class DragAndDropClass extends CommonAPI {

    @FindBy(how = How.XPATH, using = BankButtonXP)
    public WebElement bankButton;
    @FindBy(how = How.XPATH, using = AccountDebitSideXp)
    public WebElement accountDebitSide;

    @FindBy(how = How.XPATH, using = Money5000XP)
    public WebElement money5000;
    @FindBy(how = How.XPATH, using = AmountDebitSideXp)
    public WebElement amountDebitSide;

    @FindBy(how = How.XPATH, using = SalesButtonXP)
    public WebElement salesButton;
    @FindBy(how = How.XPATH, using = AccountCreditSideXP)
    public WebElement acountCreditSide;

    @FindBy(how = How.XPATH, using = AmountCreditSideXP)
    public WebElement amountCreditSide;

    @FindBy(how = How.XPATH, using = DragAndDropVerificationXp)
    public WebElement dragAndDropVerification;


    public void setdragAndDrop(){
//        // This  will scroll down the page by  1000 pixel vertical
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("window.scrollBy(0,4000)");
//        sleepFor(3);

        Actions action = new Actions(driver);
        sleepFor(3);
        action.dragAndDrop(bankButton,accountDebitSide).build().perform();
        sleepFor(3);
        action.dragAndDrop(money5000,amountDebitSide).build().perform();
        sleepFor(3);
        action.dragAndDrop(salesButton,acountCreditSide).build().perform();
        sleepFor(3);
        action.dragAndDrop(money5000,amountCreditSide).build().perform();
        sleepFor(3);
    }
    public void DragAndDropVerification(){
        String st = dragAndDropVerification.getText();
        sleepFor(2);
        if (st.equalsIgnoreCase("Perfect!")){
            System.out.println("Drag And Drop is Working");
        }else{
            System.out.println("Drag And Drop is not Working");
        }
    }
}
