package dataDriven;

import base.CommonAPI;
import home.MotorsClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;


public class DataSource extends CommonAPI {


    MotorsClass category;

    public static List<String> getItemValue() {
        List<String> itemsList = new ArrayList<String>();
        itemsList.add("Hand sanitizer");
        itemsList.add("iphone 11 pro max");
        itemsList.add("T-shirt");
        itemsList.add("Mens shirt");
        itemsList.add("Shoes");
        itemsList.add("Camera");
        itemsList.add("Bike");
        itemsList.add("Tv");
        return itemsList;
    }








    public List<WebElement> getListOfWebElementsByXpath(String locator) {
        List<WebElement> list = new ArrayList<WebElement>();
        list = driver.findElements(By.xpath("//ul[@class='hl-cat-nav__container']"));

        for (WebElement st: list) {
            System.out.println(st);
        }

        return list;
    }

//    public void searchBoxCheckUsingGetItemValue() throws InterruptedException {
//        List<String> itemList= DataSource.getListOfWebElementsByXpath;
//        for (String st:itemList) {
//            searchBox.sendKeys(st);
//            searchBox.submit();
//            String expectedResult="\""+st+"\"";
//            System.out.println("Expected Result : "+expectedResult);
//            String actualResult = searchText.getText();
//            System.out.println("Actual Result : "+actualResult);
//            Assert.assertEquals(actualResult, expectedResult, "Search Item not match");
//            sleepFor(3);
//            searchBox.clear();
//        }


}
