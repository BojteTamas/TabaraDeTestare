package utilities;

import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.function.IntPredicate;

public interface MultipleInheritance {

    static int getInnerHTML(WebElement element) {
        return Integer.parseInt(StringUtils.substringBefore(element.getAttribute("innerHTML"), "<"));
    }

    static int add(List<Integer> numList, IntPredicate predicate) {
        int sum = 0;
        for (int number : numList) {
            if (predicate.test(number)) {
                sum += number;
            }
        }
        return sum;
    }
}