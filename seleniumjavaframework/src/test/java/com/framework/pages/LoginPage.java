package com.framework.pages;

import org.openqa.selenium.WebDriver;
import com.framework.locators.LoginLocators;

import com.framework.utils.WaitUtils;

public class LoginPage extends BasePage{

    private WaitUtils waitUtils;

    public LoginPage(WebDriver driver) {
        super(driver);
        this.waitUtils = new WaitUtils(driver);
    }

    public void enterUsername(String username) {
        this.waitUtils.waitForElementVisible(LoginLocators.USERNAME).sendKeys(username);
    }

    public void enterPassword(String password) {
        this.waitUtils.waitForElementVisible(LoginLocators.PASSWORD).sendKeys(password);
    }

    public void clickLogin() {
        this.waitUtils.waitForElementClickable(LoginLocators.LOGIN_BUTTON).click();
    }

    public void login(String username, String password) {
        enterUsername(username);
        enterPassword(password);
        clickLogin();
    }
  
}
