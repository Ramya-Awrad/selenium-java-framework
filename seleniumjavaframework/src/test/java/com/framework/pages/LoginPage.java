package com.framework.pages;

import org.openqa.selenium.WebDriver;
import com.framework.locators.LoginLocators;

public class LoginPage {

    private WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterUsername(String username) {
        driver.findElement(LoginLocators.USERNAME).sendKeys(username);
    }

    public void enterPassword(String password) {
        driver.findElement(LoginLocators.PASSWORD).sendKeys(password);
    }

    public void clickLogin() {
        driver.findElement(LoginLocators.LOGIN_BUTTON).click();
    }

    public void login(String username, String password) {
        enterUsername(username);
        enterPassword(password);
        clickLogin();

    }
  
}
