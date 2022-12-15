package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class BasePage {

    // this is our base test covering components common to the whole suite
    protected static WebDriver driver;

    public static void initWebDriver() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();

    }

    public void quitWebDriver() {
        if (driver != null) {
            driver.close();
            driver.quit();
        }
    }


}