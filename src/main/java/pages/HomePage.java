package pages;

import controller.Controller;
import org.openqa.selenium.By;

import java.io.IOException;

import static controller.Controller.openPage;

public class HomePage {

    private static final By sign_up_button = By.id("menu-cta");

    private void clickSignUpButton(){Controller.clickElement(sign_up_button);}


    public void moveToSignUp() throws IOException {
        openPage();
        clickSignUpButton();

    }
}
