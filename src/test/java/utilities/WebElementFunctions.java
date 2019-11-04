package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import tests.BaseTest;

public class WebElementFunctions {
    interface WebElementString {
        String get(WebElement webElement);
    }

    public String webElementOperation(WebElement webElement, WebElementString webElementString) {
        return webElementString.get(webElement);
    }

    /**
     * Function Argument in Lambda Expression
     */
    WebElementString webElementLowercaseString = (r) -> r.getText().toLowerCase();
    WebElementString webElementUppercaseString = (r) -> r.getText().toUpperCase();

    public String getWebElementLowercaseText(By byObject) {
        return new WebElementFunctions().webElementOperation(BaseTest.chromeDriver.findElement(byObject), webElementLowercaseString);
    }
}
