package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

@SpringBootTest(classes = {SpringConfig.class})
public class BaseTest extends AbstractTestNGSpringContextTests {
  private static String HTTPS_WWW_EMAG_RO = "https://www.emag.ro";
  public static ChromeDriver chromeDriver;

  @Autowired
  protected BaseTest() {}

  @BeforeTest
  public void setup() {
    setupTheWebDriver();
    chromeDriver = new ChromeDriver();
    chromeDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    chromeDriver.get(HTTPS_WWW_EMAG_RO);
    chromeDriver.manage().window().maximize();
  }

  @AfterTest
  public void tearDown() {
    chromeDriver.quit();
  }

  private static void setupTheWebDriver() {
    WebDriverManager.chromedriver().setup();
  }
}
