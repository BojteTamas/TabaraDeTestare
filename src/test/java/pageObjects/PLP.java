package pageObjects;

import org.openqa.selenium.By;

public class PLP {
  public static final By SEARCH_INPUT = By.cssSelector("#searchboxTrigger");
  public static final By PRODUCTS_CONTAINERS =
      By.cssSelector("div[class='card-item js-product-data']");
  public static final By PRODUCT_PRICES =
      By.cssSelector("div[class='card-item js-product-data'] .product-new-price");
  public static final By MY_ACCOUNT_BUTTON = By.cssSelector("#my_account span");
}
