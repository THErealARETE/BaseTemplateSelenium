package products;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.ProductsPage;

import java.io.IOException;

import static util.ConfigReader.getPassword;
import static util.ConfigReader.getUserName;

public class ProductsLoadTest extends BaseTests {
    LoginPage loginPage = new LoginPage();
    ProductsPage productsPage = new ProductsPage();

    @Test
    public void testProductsLoad() throws IOException {
        loginPage.successLogin(getUserName(), getPassword());
        productsPage.selectProduct1();
        Assert.assertTrue(productsPage.backToProductsButtonIsVisible(), "Product Item not loaded...");
    }

}
