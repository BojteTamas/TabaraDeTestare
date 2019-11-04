package pageObjects;

import org.openqa.selenium.By;

public class PLP {
    public final static By searchInput = By.cssSelector("#searchboxTrigger");
    public final static By productsContainers = By.cssSelector("div[class='card-item js-product-data']");
    public final static By productPrices = By.cssSelector("div[class='card-item js-product-data'] .product-new-price");
    public final static By myAccountButton = By.cssSelector("#my_account span");

}
