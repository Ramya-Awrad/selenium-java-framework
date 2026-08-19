package com.framework.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.framework.utils.ConfigReader;
import org.testng.ITestResult;
import com.framework.utils.ScreenshotUtil;

public class BaseTest {

    protected WebDriver driver;

    @BeforeMethod(alwaysRun = true)
    public void setUp() {
        System.out.println("===== SETUP STARTED =====");
        String browser = ConfigReader.get("browser");

        if (browser.equalsIgnoreCase("chrome")) {
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("firefox")) {
            driver = new FirefoxDriver();
        } else {
            throw new IllegalArgumentException(
                    "Unsupported browser: " + browser);
        }
        System.out.println("===== DRIVER CREATED: " + driver + " =====");
        driver.manage().window().maximize();
}

    @AfterMethod(alwaysRun = true)
    public void tearDown(ITestResult result) {

        if (result.getStatus() == ITestResult.FAILURE) {

            ScreenshotUtil.captureScreenshot(
                driver,
                result.getMethod().getMethodName()
            );
        }
    

        if (driver != null) {
            driver.quit();
        }
    }
}