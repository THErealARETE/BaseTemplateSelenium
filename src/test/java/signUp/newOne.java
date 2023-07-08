package signUp;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class newOne {

    public class something {

        static WebDriver driver = new ChromeDriver();
        static WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));


//        public static void main(String[] args) {
//
//            try{
//                theFlow();
//            }catch (Exception e){
//                e.printStackTrace();
//                e.getMessage();
//            }
//        }

        public static void theFlow() throws StaleElementReferenceException {

            WebDriver driver = new ChromeDriver();

            driver.get("https://chess.com/");
            driver.manage().window().maximize();

            driver.findElement(By.id("menu-cta")).click();

            driver.findElement(By.className("registration[username]")).sendKeys("NewUser");
            driver.findElement(By.id("registration_email")).sendKeys("newUser@gmail.com");
            driver.findElement(By.id("registration_password")).sendKeys("newPassword");

            driver.findElement(By.className("register-form-line")).click();



        }
    }
}
