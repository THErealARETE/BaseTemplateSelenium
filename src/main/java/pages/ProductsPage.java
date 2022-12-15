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
    private static final By DECENDING_ORDER_LIST_ARRAY = By.className("inventory_item_name");
    private static final String SORT_PRICE_FROM_HIGH_TO_LOW = "hilo";
    private static final String SORT_ITEMS_IN_ALPHABETICAL_ORDER_DESENDING = "za";

    String HIGH_PRICE = "";
    String LOW_PRICE = "";
    String LOW_ITEM = "";
    String HIGH_ITEM = "";

    public boolean productsTitleIsVisible() {
        return isVisible(PRODUCTS_TITLE);
    }

    public void filterTheProductsFromHighToLow(){

        Select se = new Select(driver.findElement(FILTER_PRODUCT));
        se.selectByValue(SORT_PRICE_FROM_HIGH_TO_LOW);

        List<WebElement> allPrices =  driver.findElements(PRICE_LIST_ARRAY);

        HIGH_PRICE = allPrices.get(0).getText();
        LOW_PRICE = allPrices.get(allPrices.size() - 1).getText();
    }

    public void filterTheProductsAlphabeticallyDesendingOrder(){

        Select se = new Select(driver.findElement(FILTER_PRODUCT));
        se.selectByValue(SORT_ITEMS_IN_ALPHABETICAL_ORDER_DESENDING);

        List<WebElement> allItems =  driver.findElements(DECENDING_ORDER_LIST_ARRAY);

        LOW_ITEM = allItems.get(0).getText();
        HIGH_ITEM = allItems.get(allItems.size() - 1).getText();
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


    public String getHIGH_PRICE(){
        return HIGH_PRICE;
    }
    public String getLOW_PRICE(){
        return LOW_PRICE;
    }

    public String getHIGH_ITEM(){
        return HIGH_ITEM;
    }
    public String getLOW_ITEM(){
        return LOW_ITEM;
    }


}
