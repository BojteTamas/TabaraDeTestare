package tests;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

public class BaseTest {
    protected static String HTTPS_WWW_EMAG_RO = "https://www.emag.ro";
    public static ChromeDriver chromeDriver;

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
        String OS = System.getProperty("os.name").toLowerCase();

        if (OS.contains("mac")) {
            System.setProperty("webdriver.chrome.driver", "src/main/resources/mac/chromedriver");
        } else {
            System.setProperty("webdriver.chrome.driver", "src/main/resources/windows/chromedriver.exe");
        }
    }
}