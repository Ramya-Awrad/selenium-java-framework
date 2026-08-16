package com.framework.tests;

import org.testng.annotations.Test;
import com.framework.pages.LoginPage;

import com.framework.utils.ConfigReader;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import com.framework.utils.JsonReader;

import java.io.IOException;
import java.util.Map;

public class LoginTest extends BaseTest {

    private static final Logger logger =
        LogManager.getLogger(LoginTest.class);
    
    @Test
    public void loginTest() throws IOException {

        logger.info("Starting login test");

        driver.get(ConfigReader.get("url"));
        logger.info("Opened SauceDemo application");

        Map<String, String> loginData =
        JsonReader.readJson("src/test/resources/testdata/login_data.json");

        LoginPage loginPage = new LoginPage(driver);
        logger.info("LoginPage object created");

        loginPage.login(loginData.get("username"), loginData.get("password"));
        logger.info("Login completed successfully");
        
    }

    
}

