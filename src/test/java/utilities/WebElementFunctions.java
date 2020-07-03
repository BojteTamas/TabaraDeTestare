package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import tests.BaseTest;

public class WebElementFunctions {
  interface WebElementStringOperation {
    String get(WebElement webElement);
  }

  private String webElementOperation(
      WebElement webElement, WebElementStringOperation webElementString) {
    return webElementString.get(webElement);
  }

  /** Function Argument in Lambda Expression */
  private WebElementStringOperation getWebElementLowercaseString = r -> r.getText().toLowerCase();

  private WebElementStringOperation getWebElementUppercaseString = r -> r.getText().toUpperCase();

  public String getWebElementLowercaseText(By byObject) {
    return new WebElementFunctions()
        .webElementOperation(
            BaseTest.chromeDriver.findElement(byObject), getWebElementLowercaseString);
  }

  public String getWebElementUpperCaseText(By byObject) {
    return new WebElementFunctions()
        .webElementOperation(
            BaseTest.chromeDriver.findElement(byObject), getWebElementUppercaseString);
  }
}
