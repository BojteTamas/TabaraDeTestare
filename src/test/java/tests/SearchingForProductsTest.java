package tests;

import org.testng.annotations.Test;
import pageObjects.PLP;
import utilities.HelperMethodsSeleniumJava7;
import utilities.HelperMethodsSeleniumJava8;
import utilities.WebElementFunctions;

import static pageObjects.PLP.*;

public class SearchingForProductsTest extends BaseTest {

    @Test
    public void searchForAProductAndCheckTheNumbers() throws InterruptedException {
        String searchedProduct = "xmas";
        chromeDriver.findElement(PLP.searchInput).sendKeys(searchedProduct);
        chromeDriver.findElement(PLP.searchInput).submit();

        /**
         * Exemplu de a numara elementele dintr-o lista
         */
        System.out.println("Se afiseaza numarul de elemente din liste");
        System.out.println(HelperMethodsSeleniumJava7.getNumberOfWebElements(productsContainers));
        System.out.println(HelperMethodsSeleniumJava8.getNumberOfWebElements(productsContainers));
        System.out.println("\n\n");
        /**
         * Refolosirea codului diferenta dintre metoda java 7 si java 8
         * Java 8 se poate refolosi foarte simplu
         */
        System.out.println("Se afiseaza diferite siruri de numere");
        System.out.println(HelperMethodsSeleniumJava7.getListOfElementsPriceLessThan(productPrices, 100));
        System.out.println(HelperMethodsSeleniumJava8.getListOfElementsPrice(productPrices, value -> value > 100));
        System.out.println(HelperMethodsSeleniumJava8.getListOfElementsPrice(productPrices, value -> value < 100));
        System.out.println("\n\n");

        /**
         * Colectarea preturilor unice
         */
        System.out.println("Se afiseaza siruri de numere unice de preturi");
        System.out.println(HelperMethodsSeleniumJava7.getUniqueListOfPrices(productPrices));
        System.out.println(HelperMethodsSeleniumJava8.getUniqueListOfPrices(productPrices));
        System.out.println("\n\n");

        /**
         * Calculeaza suma preturilor mai mare de 100 de lei
         */
        System.out.println("Se afiseaza suma preturilor mai mare de 100");
        System.out.println(HelperMethodsSeleniumJava7.getSumOfNumbersBiggerThan(productPrices, 300));
        System.out.println(HelperMethodsSeleniumJava8.getSumOfNumbers(productPrices, price -> price > 300));
        //Suma tuturor numerelor
        System.out.println(HelperMethodsSeleniumJava8.getSumOfNumbers(productPrices, price -> true));
        //Suma nici unui numar
        System.out.println(HelperMethodsSeleniumJava8.getSumOfNumbers(productPrices, price -> false));
        //Suma numerelor pare
        System.out.println(HelperMethodsSeleniumJava8.getSumOfNumbers(productPrices, price -> price % 2 == 0));
        //Suma numerelor mai mici de 300
        System.out.println(HelperMethodsSeleniumJava8.getSumOfNumbers(productPrices, price -> price < 300));
        System.out.println("\n\n");

        /**
         * Sa se afiseze cel mai mare pret
         */
        System.out.println("Se afiseaza cel mai mare pret");
        System.out.println(HelperMethodsSeleniumJava7.getBigestPrice(productPrices));
        System.out.println(HelperMethodsSeleniumJava8.getBigestPrice(productPrices));


        /**
         * Functii argument in lambda expression
         */
        WebElementFunctions webElementFunctions = new WebElementFunctions();
        System.out.println(webElementFunctions.getWebElementLowercaseText(myAccountButton));

    }
}
