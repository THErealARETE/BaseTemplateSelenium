package login;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;

import java.io.IOException;

import static util.ConfigReader.getPassword;
import static util.ConfigReader.getUserName;


public class InvalidLoginTest extends BaseTests {

    LoginPage loginPage = new LoginPage();

    @Test
    public void LoginWithEmptyUsername() throws IOException {
        loginPage.successLogin("", getPassword());
        Assert.assertEquals(loginPage.getErrorMessage(), "Epic sadface: Username is required");

    }

    @Test
    public void LoginWithEmptyPassword() throws IOException {
        loginPage.successLogin(getUserName(), "");
        Assert.assertEquals(loginPage.getErrorMessage(), "Epic sadface: Password is required");

    }

    @Test
    public void LoginWithEmptyUsernameAndPassword() throws IOException {
        loginPage.successLogin("", "");
        Assert.assertEquals(loginPage.getErrorMessage(), "Epic sadface: Username is required");
    }
}
