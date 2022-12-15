package login;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.ProductsPage;

import java.io.IOException;

import static util.ConfigReader.getPassword;
import static util.ConfigReader.getUserName;

public class LoginTests extends BaseTests {

    LoginPage loginPage = new LoginPage();
    ProductsPage productsPage = new ProductsPage();

    @Test
    public void testSuccessfulLogin() throws IOException {
        loginPage.successLogin(getUserName(), getPassword());
        Assert.assertTrue(productsPage.productsTitleIsVisible(), "Login Unsuccessful...");

    }

}
