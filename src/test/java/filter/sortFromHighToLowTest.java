package filter;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.ProductsPage;

import java.io.IOException;

import static util.ConfigReader.getPassword;
import static util.ConfigReader.getUserName;

public class sortFromHighToLowTest extends BaseTests {

    LoginPage loginPage = new LoginPage();
    ProductsPage productsPage = new ProductsPage();

    @Test
    public void testProductsLoad() throws IOException {
        loginPage.successLogin(getUserName(), getPassword());
        productsPage.filterTheProductsFromHighToLow();
//        assert productsPage.getHIGH_PRICE() > productsPage.getLOW_PRICE() ;
        Assert.assertEquals("$49.99" , productsPage.getHIGH_PRICE());
        Assert.assertEquals("$7.99" , productsPage.getLOW_PRICE());
    }
}
