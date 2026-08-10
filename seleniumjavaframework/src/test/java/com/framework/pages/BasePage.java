package com.framework.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BasePage {

    protected WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    public void click(By locator) {
    driver.findElement(locator).click();    
    }

    public void sendKeys(By locator, String value) {
        driver.findElement(locator).sendKeys(value);
    }
    

}