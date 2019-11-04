package utilities;

import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import tests.BaseTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HelperMethodsSeleniumJava7 extends BaseTest implements MultipleInheritance {

    public static int getNumberOfWebElements(By byObject) {
        return chromeDriver.findElements(byObject).size();
    }

    public static ArrayList getListOfElementsPriceLessThan(By byObject, int maxPrice) {
        List<WebElement> webElementList = chromeDriver.findElements(byObject);
        ArrayList<Integer> priceList = new ArrayList<>();
        for (WebElement aWebElementList : webElementList) {
            int price = Integer.parseInt(StringUtils.substringBefore(aWebElementList.getAttribute("innerHTML"), "<"));
            if (price < maxPrice) {
                priceList.add(price);
            }
        }
        return priceList;
    }

    public static ArrayList getUniqueListOfPrices(By byObject) {
        List<WebElement> webElementList = chromeDriver.findElements(byObject);
        ArrayList<Integer> priceList = new ArrayList<>();
        for (WebElement aWebElementList : webElementList) {
            int price = Integer.parseInt(StringUtils.substringBefore(aWebElementList.getAttribute("innerHTML"), "<"));
            if (!priceList.contains(price)) {
                priceList.add(price);
            }
        }
        return priceList;
    }

    public static int getSumOfNumbersBiggerThan(By byObject, int number) {
        List<WebElement> webElementList = chromeDriver.findElements(byObject);
        int sum = 0;
        for (WebElement aWebElementList : webElementList) {
            int price = Integer.parseInt(StringUtils.substringBefore(aWebElementList.getAttribute("innerHTML"), "<"));
            if (price > number) {
                sum += price;
            }
        }
        return sum;
    }

    public static int getBigestPrice(By productPrices) {
        List<WebElement> webElementList = chromeDriver.findElements(productPrices);
        ArrayList<Integer> priceList = new ArrayList<>();
        for (WebElement aWebElementList : webElementList) {
            int price = Integer.parseInt(StringUtils.substringBefore(aWebElementList.getAttribute("innerHTML"), "<"));
            priceList.add(price);
        }
        return Collections.max(priceList);
    }
}
