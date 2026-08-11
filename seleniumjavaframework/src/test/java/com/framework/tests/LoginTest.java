package com.framework.tests;

import org.testng.annotations.Test;
import com.framework.pages.LoginPage;

import com.framework.utils.ConfigReader;

public class LoginTest extends BaseTest {
    
    @Test
    public void loginTest() {

        driver.get(ConfigReader.get("url"));

        LoginPage loginPage = new LoginPage(driver);

        System.out.println(ConfigReader.get("url"));
        System.out.println(ConfigReader.get("browser"));

        loginPage.login("standard_user", "secret_sauce");
    }

    
}

