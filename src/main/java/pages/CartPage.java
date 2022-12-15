package pages;

import controller.Controller;
import org.openqa.selenium.By;

import static org.openqa.selenium.By.*;


public class CartPage extends Controller {

    private static final By PRODUCT_ONE_TEXT = cssSelector("#item_4_title_link > div");
    private static final By SHOPPING_CART_BUTTON = By.xpath("/html/body/div/div/div/div[1]/div[1]/div[3]/a");

    public String getProduct1Text() {
        return driver.findElement(PRODUCT_ONE_TEXT).getText();
    }

    public void clickShoppingCartBtn() {
        clickElement(SHOPPING_CART_BUTTON);
    }
}
