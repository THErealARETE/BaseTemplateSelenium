package signUp;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;


import java.io.IOException;

import static util.ConfigReader.getPassword;
import static util.ConfigReader.getUserName;

public class signUpTest {
    HomePage homePage = new HomePage();

    @Test
    public void testSuccessfulSignUp() throws IOException {
        homePage.moveToSignUp();
    }



}
