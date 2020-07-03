package utilities;

import java.util.List;
import java.util.function.IntPredicate;
import java.util.stream.Collectors;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import tests.BaseTest;

@Component
public class HelperMethodsSeleniumJava8 extends BaseTest implements MultipleInheritance {

  @Autowired
  public HelperMethodsSeleniumJava8() {}

  public long getNumberOfWebElements(By byObject) {
    List<WebElement> webElements = chromeDriver.findElements(byObject);
    return webElements.stream().count();
  }

  public List getListOfElementsPrice(By byObject, IntPredicate predicate) {
    List<WebElement> webElementList = chromeDriver.findElements(byObject);
    return webElementList.stream()
        .mapToInt(MultipleInheritance::getInnerHTML)
        .filter(predicate)
        .boxed()
        .collect(Collectors.toList());
  }

  public List getUniqueListOfPrices(By productPrices) {
    List<WebElement> webElementList = chromeDriver.findElements(productPrices);
    return webElementList.stream()
        .mapToInt(MultipleInheritance::getInnerHTML)
        .boxed()
        .distinct()
        .collect(Collectors.toList());
  }

  public Integer getSumOfNumbers(By productPrices, IntPredicate predicate) {
    List<WebElement> webElementList = chromeDriver.findElements(productPrices);
    return webElementList.stream()
        .mapToInt(MultipleInheritance::getInnerHTML)
        .filter(predicate)
        .boxed()
        .reduce(0, Integer::sum); // sau sum direct
  }

  public int getBiggestPrice(By productPrices) {
    List<WebElement> webElementList = chromeDriver.findElements(productPrices);
    return webElementList.stream().mapToInt(MultipleInheritance::getInnerHTML).max().getAsInt();
  }
}
