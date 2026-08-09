package com.framework.tests;

import org.testng.annotations.Test;
import com.framework.pages.LoginPage;

public class LoginTest extends BaseTest {
     @Test
    public void loginTest() {

        driver.get("https://www.saucedemo.com/");

        LoginPage loginPage = new LoginPage(driver);

        loginPage.login("standard_user", "secret_sauce");
    }

    
}

