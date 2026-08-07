package com.framework.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;

public class BrowserTest {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        
        driver = new ChromeDriver();
    }

    @Test
    public void verifyBrowserLaunch() {

        driver.get("https://www.google.com");

        System.out.println("Google launched successfully.");

    }

    @AfterMethod
    public void tearDown() {

        driver.quit();

    }
    
}
