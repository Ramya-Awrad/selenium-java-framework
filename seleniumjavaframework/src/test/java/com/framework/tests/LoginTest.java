package com.framework.tests;

import org.testng.annotations.Test;
import com.framework.pages.LoginPage;

import com.framework.utils.ConfigReader;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LoginTest extends BaseTest {

    private static final Logger logger =
        LogManager.getLogger(LoginTest.class);
    
    @Test
    public void loginTest() {

        logger.info("Starting login test");

        driver.get(ConfigReader.get("url"));
        logger.info("Opened SauceDemo application");

        LoginPage loginPage = new LoginPage(driver);
        logger.info("LoginPage object created");

        loginPage.login("standard_user", "secret_sauce");
        logger.info("Login completed successfully");
        
    }

    
}

