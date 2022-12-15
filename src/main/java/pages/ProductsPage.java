package pages;

import controller.Controller;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class ProductsPage extends Controller {

    private static final By ADD_TO_CART_BUTTON = By.id("add-to-cart-sauce-labs-backpack");
    private static final By PRODUCTS_TITLE = By.cssSelector("div.page_wrapper div:nth-child(1) div.header_container:nth-child(1) div.header_secondary_container > span.title");
    private static final By PRODUCT1_CLICK = By.cssSelector("#item_4_title_link > div");
    private static final By BACK_TO_PRODUCTS_BUTTON = By.id("back-to-products");
    private static final By FILTER_PRODUCT = By.className("product_sort_container");
    private static final By PRICE_LIST_ARRAY = By.className("inventory_item_price");
    private static final String SORT_FROM_HIGH_TO_LOW = "hilo";

    private static final String SORT_FROM_LOW_TO_HIGH = "lohi";

    String HIGH_PRICE = "";
    String LOW_PRICE = "";

    public boolean productsTitleIsVisible() {
        return isVisible(PRODUCTS_TITLE);
    }

    public String filterTheProductsFromHighToLow(){

        this.HIGH_PRICE = HIGH_PRICE;
        this.LOW_PRICE = LOW_PRICE;

        Select se = new Select(driver.findElement(FILTER_PRODUCT));
        se.selectByValue(SORT_FROM_HIGH_TO_LOW);

        List<WebElement> allPrices =  driver.findElements(PRICE_LIST_ARRAY);
        for (WebElement singlePrices : allPrices){

            System.out.println("i got here ");
            HIGH_PRICE = allPrices.get(0).getText();
            LOW_PRICE = allPrices.get(allPrices.size() - 1).getText();
            System.out.println("i got here 2 ");
            System.out.println(singlePrices.getText());
        }

        return filterTheProductsFromHighToLow();
    }

    public String getHIGH_PRICE(){
        return HIGH_PRICE;
    }
    public String getLOW_PRICE(){
        return LOW_PRICE;
    }


    public void clickOnAddToCartBtn() {
        driver.findElement(ADD_TO_CART_BUTTON).click();

    }

    public void selectProduct1() {
        clickElement(PRODUCT1_CLICK);
    }

    public boolean backToProductsButtonIsVisible() {
        return isVisible(BACK_TO_PRODUCTS_BUTTON);
    }
}
