package com.framework.tests;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import com.framework.pages.LoginPage;

import com.framework.utils.ConfigReader;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import com.framework.utils.JsonReader;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class LoginTest extends BaseTest {

    private static final Logger logger =
        LogManager.getLogger(LoginTest.class);

    @DataProvider(name = "loginData")
    public Object[][] loginData() throws IOException {

        List<Map<String, String>> data =
                JsonReader.readJson(
                    "src/test/resources/testdata/login_data.json"
                );

        Object[][] testData = new Object[data.size()][2];

        for (int i = 0; i < data.size(); i++) {
            testData[i][0] = data.get(i).get("username");
            testData[i][1] = data.get(i).get("password");
        }

        return testData;
    }
    
    @Test(dataProvider = "loginData", groups = {"smoke"})
    public void loginTest(String username, String password) {

        logger.info("Starting login test");

        driver.get(ConfigReader.get("url"));
        logger.info("Opened SauceDemo application");

        LoginPage loginPage = new LoginPage(driver);
        logger.info("LoginPage object created");

        loginPage.login(username, password);        
        logger.info("Login completed successfully");
        
    }

    
}

