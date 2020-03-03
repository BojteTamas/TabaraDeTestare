package utilities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import tests.BaseTest;

@Component
public class HelperMethodsSeleniumJava7 extends BaseTest implements MultipleInheritance {

  @Autowired
  public HelperMethodsSeleniumJava7() {}

  public int getNumberOfWebElements(By byObject) {
    return chromeDriver.findElements(byObject).size();
  }

  public ArrayList getListOfElementsPriceLessThan(By byObject, int maxPrice) {
    List<WebElement> webElementList = chromeDriver.findElements(byObject);
    ArrayList<Integer> priceList = new ArrayList<>();
    for (WebElement aWebElementList : webElementList) {
      int price = getPriceFromInnerHtml(aWebElementList);
      if (price < maxPrice) {
        priceList.add(price);
      }
    }
    return priceList;
  }

  public ArrayList getUniqueListOfPrices(By byObject) {
    List<WebElement> webElementList = chromeDriver.findElements(byObject);
    ArrayList<Integer> priceList = new ArrayList<>();
    for (WebElement aWebElementList : webElementList) {
      int price = getPriceFromInnerHtml(aWebElementList);
      if (!priceList.contains(price)) {
        priceList.add(price);
      }
    }
    return priceList;
  }

  public int getSumOfNumbersBiggerThan(By byObject, int number) {
    List<WebElement> webElementList = chromeDriver.findElements(byObject);
    int sum = 0;
    for (WebElement aWebElementList : webElementList) {
      int price = getPriceFromInnerHtml(aWebElementList);
      if (price > number) {
        sum += price;
      }
    }
    return sum;
  }

  public int getBiggestPrice(By productPrices) {
    List<WebElement> webElementList = chromeDriver.findElements(productPrices);
    ArrayList<Integer> priceList = new ArrayList<>();
    for (WebElement aWebElementList : webElementList) {
      int price = getPriceFromInnerHtml(aWebElementList);
      priceList.add(price);
    }
    return Collections.max(priceList);
  }

  private int getPriceFromInnerHtml(WebElement aWebElementList) {
    return Integer.parseInt(
        StringUtils.substringBefore(aWebElementList.getAttribute("innerHTML"), "<"));
  }
}
