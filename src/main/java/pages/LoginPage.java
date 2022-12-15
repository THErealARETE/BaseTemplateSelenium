package pages;


import controller.Controller;
import org.openqa.selenium.By;

import java.io.IOException;

public class LoginPage extends Controller {

    private static final By USER_NAME = By.id("user-name");
    private static final By PASSWORD = By.id("password");
    private static final By LOGIN_BUTTON = By.id("login-button");
    private static final By ERROR_MESSAGE = By.tagName("h3");


    private void setUsername(String username) {
        driver.findElement(USER_NAME).sendKeys(username);
    }

    private void setPassword(String password) {
        driver.findElement(PASSWORD).sendKeys(password);
    }


    private void clickLoginButton() {
        clickElement(LOGIN_BUTTON);
    }

    public void successLogin(String username, String password) throws IOException {
        openPage();
        setUsername(username);
        setPassword(password);
        clickLoginButton();
    }

    public String getErrorMessage() {
        return getText(ERROR_MESSAGE);
    }

}
