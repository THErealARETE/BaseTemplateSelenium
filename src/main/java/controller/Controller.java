package controller;

import base.BasePage;
import org.openqa.selenium.By;

import java.io.IOException;

import static util.ConfigReader.getUrl;

public class Controller extends BasePage {

    // here we defined our controllers/ locators
    public static void clickElement(By locator) {
        driver.findElement(locator).click();
    }

    public String getText(By locator) {
        return driver.findElement(locator).getText();
    }

    public boolean isVisible(By location) {
        return driver.findElement(location).isDisplayed();
    }

    public static void openPage() throws IOException {
        driver.get(getUrl());
    }

}
