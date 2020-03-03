package tests;

import static pageObjects.PLP.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.testng.annotations.Test;
import pageObjects.PLP;
import utilities.HelperMethodsSeleniumJava7;
import utilities.HelperMethodsSeleniumJava8;
import utilities.WebElementFunctions;

public class SearchingForProductsTest extends BaseTest {

  @Autowired private HelperMethodsSeleniumJava7 helperMethodsSeleniumJava7;

  @Autowired private HelperMethodsSeleniumJava8 helperMethodsSeleniumJava8;

  @Test
  public void searchForAProductAndCheckTheNumbers() {
    String searchedProduct = "xmas";
    chromeDriver.findElement(PLP.SEARCH_INPUT).sendKeys(searchedProduct);
    chromeDriver.findElement(PLP.SEARCH_INPUT).submit();

    /** Exemplu de a numara elementele dintr-o lista */
    System.out.println("Se afiseaza numarul de elemente din liste");
    System.out.println(helperMethodsSeleniumJava7.getNumberOfWebElements(PRODUCTS_CONTAINERS));
    System.out.println(helperMethodsSeleniumJava8.getNumberOfWebElements(PRODUCTS_CONTAINERS));
    System.out.println("\n\n");
    /**
     * Refolosirea codului diferenta dintre metoda java 7 si java 8 Java 8 se poate refolosi foarte
     * simplu
     */
    System.out.println("Se afiseaza diferite siruri de numere");
    System.out.println(
        helperMethodsSeleniumJava7.getListOfElementsPriceLessThan(PRODUCT_PRICES, 100));
    System.out.println(
        helperMethodsSeleniumJava8.getListOfElementsPrice(PRODUCT_PRICES, value -> value > 100));
    System.out.println(
        helperMethodsSeleniumJava8.getListOfElementsPrice(PRODUCT_PRICES, value -> value < 100));
    System.out.println(
        helperMethodsSeleniumJava8.getListOfElementsPrice(PRODUCT_PRICES, value -> value == 100));
    System.out.println("\n\n");

    /** Colectarea preturilor unice */
    System.out.println("Se afiseaza siruri de numere unice de preturi");
    System.out.println(helperMethodsSeleniumJava7.getUniqueListOfPrices(PRODUCT_PRICES));
    System.out.println(helperMethodsSeleniumJava8.getUniqueListOfPrices(PRODUCT_PRICES));
    System.out.println("\n\n");

    /** Calculeaza suma preturilor mai mare de 300 de lei */
    System.out.println("Se afiseaza suma preturilor mai mare de 300");
    System.out.println(helperMethodsSeleniumJava7.getSumOfNumbersBiggerThan(PRODUCT_PRICES, 300));
    System.out.println(
        helperMethodsSeleniumJava8.getSumOfNumbers(PRODUCT_PRICES, price -> price > 300));
    // Suma tuturor numerelor
    System.out.println(helperMethodsSeleniumJava8.getSumOfNumbers(PRODUCT_PRICES, price -> true));
    // Suma nici unui numar
    System.out.println(helperMethodsSeleniumJava8.getSumOfNumbers(PRODUCT_PRICES, price -> false));
    // Suma numerelor pare
    System.out.println(
        helperMethodsSeleniumJava8.getSumOfNumbers(PRODUCT_PRICES, price -> price % 2 == 0));
    // Suma numerelor mai mici de 300
    System.out.println(
        helperMethodsSeleniumJava8.getSumOfNumbers(PRODUCT_PRICES, price -> price < 300));
    System.out.println("\n\n");

    /** Sa se afiseze cel mai mare pret */
    System.out.println("Se afiseaza cel mai mare pret");
    System.out.println(helperMethodsSeleniumJava7.getBiggestPrice(PRODUCT_PRICES));
    System.out.println(helperMethodsSeleniumJava8.getBiggestPrice(PRODUCT_PRICES));

    /** Functii argument in lambda expression */
    WebElementFunctions webElementFunctions = new WebElementFunctions();
    System.out.println(webElementFunctions.getWebElementLowercaseText(MY_ACCOUNT_BUTTON));
  }
}
