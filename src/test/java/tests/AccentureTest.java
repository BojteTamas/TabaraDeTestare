package tests;

import static java.lang.Thread.sleep;
import static pageObjects.MainPage.SERVICES;
import static pageObjects.MainPage.TECHNOLOGY_SERVICES;

import java.util.List;
import org.openqa.selenium.WebElement;
import org.springframework.beans.factory.annotation.Autowired;
import org.testng.annotations.Test;
import utilities.HelperMethodsSeleniumJava7;
import utilities.HelperMethodsSeleniumJava8;

public class AccentureTest extends BaseTest {

  @Autowired private HelperMethodsSeleniumJava7 helperMethodsSeleniumJava7;

  @Autowired private HelperMethodsSeleniumJava8 helperMethodsSeleniumJava8;

  @Test
  public void searchForAProductAndCheckTheNumbers() throws InterruptedException {
    chromeDriver.get("https://www.accenture.com/ro-en");

    chromeDriver.findElement(SERVICES).click();
    sleep(3000);
    List<WebElement> technologyServices = chromeDriver.findElements(TECHNOLOGY_SERVICES);
    technologyServices.stream()
        .peek(webElement -> System.out.println(webElement.getText()))
        .filter(webElement -> webElement.getText().split(" ").length > 1)
        .forEach(webElement -> colorTheElement(webElement));

    sleep(10000);
  }
}
