//package filter;
//
//public class sortFromLowToHighTest {
//
//
//}


package filter;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.ProductsPage;

import java.io.IOException;

import static util.ConfigReader.getPassword;
import static util.ConfigReader.getUserName;

public class sortItemsInDesendingOrder extends BaseTests {

    LoginPage loginPage = new LoginPage();
    ProductsPage productsPage = new ProductsPage();
    @Test
    public void testProductsLoad() throws IOException {
        loginPage.successLogin(getUserName(), getPassword());
        productsPage.filterTheProductsAlphabeticallyDesendingOrder();
        Assert.assertEquals("Test.allTheThings() T-Shirt (Red)" , productsPage.getLOW_ITEM());
        Assert.assertEquals("Sauce Labs Backpack" , productsPage.getHIGH_ITEM());
    }
}
