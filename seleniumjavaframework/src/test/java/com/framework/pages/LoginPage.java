package com.framework.pages;

import org.openqa.selenium.WebDriver;
import com.framework.locators.LoginLocators;

public class LoginPage extends BasePage{

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void enterUsername(String username) {
        sendKeys(LoginLocators.USERNAME, username);
    }

    public void enterPassword(String password) {
        sendKeys(LoginLocators.PASSWORD, password);
    }

    public void clickLogin() {
        click(LoginLocators.LOGIN_BUTTON);
    }

    public void login(String username, String password) {
        enterUsername(username);
        enterPassword(password);
        clickLogin();

    }
  
}
