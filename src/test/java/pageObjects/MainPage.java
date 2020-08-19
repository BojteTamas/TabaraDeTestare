package pageObjects;

import org.openqa.selenium.By;

public class MainPage {
  public static final By SERVICES = By.cssSelector("div[aria-label='Services']");
  public static final By TECHNOLOGY_SERVICES =
      By.cssSelector("[data-tertiary='services-technology'] a");
}
