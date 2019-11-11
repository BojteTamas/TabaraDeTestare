package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import tests.BaseTest;

import java.util.List;
import java.util.function.IntPredicate;
import java.util.stream.Collectors;

public class HelperMethodsSeleniumJava8 extends BaseTest implements MultipleInheritance {

    public static long getNumberOfWebElements(By byObject) {
        List<WebElement> webElements = chromeDriver.findElements(byObject);
        return webElements.stream().count();
    }

    public static List getListOfElementsPrice(By byObject, IntPredicate predicate) {
        List<WebElement> webElementList = chromeDriver.findElements(byObject);
        return webElementList.stream()
                .mapToInt(MultipleInheritance::getInnerHTML)
                .filter(predicate)
                .boxed()
                .collect(Collectors.toList());
    }

    public static List getUniqueListOfPrices(By productPrices) {
        List<WebElement> webElementList = chromeDriver.findElements(productPrices);
        return webElementList.stream()
                .mapToInt(MultipleInheritance::getInnerHTML)
                .boxed()
                .distinct()
                .collect(Collectors.toList());
    }

    public static Integer getSumOfNumbers(By productPrices, IntPredicate predicate) {
        List<WebElement> webElementList = chromeDriver.findElements(productPrices);
        return webElementList.stream()
                .mapToInt(MultipleInheritance::getInnerHTML)
                .filter(predicate)
                .boxed()
                .reduce(0, Integer::sum);
    }

    public static int getBigestPrice(By productPrices) {
        List<WebElement> webElementList = chromeDriver.findElements(productPrices);
        return webElementList.stream()
                .mapToInt(MultipleInheritance::getInnerHTML)
                .max()
                .getAsInt();
    }
}
