package cart;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CartPage;
import pages.LoginPage;
import pages.ProductsPage;

import java.io.IOException;

import static util.ConfigReader.getPassword;
import static util.ConfigReader.getUserName;


public class AddToCartTest extends BaseTests {
    private static final String PRODUCT1_NAME = "Sauce Labs Backpack";
    LoginPage loginPage = new LoginPage();
    ProductsPage productsPage = new ProductsPage();
    CartPage cartPage = new CartPage();

    @Test
    public void cartPageTest() throws IOException {
        loginPage.successLogin(getUserName(), getPassword());
        productsPage.clickOnAddToCartBtn();
        cartPage.clickShoppingCartBtn();
        Assert.assertEquals(cartPage.getProduct1Text(), PRODUCT1_NAME);

    }
}
