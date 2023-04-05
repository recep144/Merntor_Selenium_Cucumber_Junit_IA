package com.krafttech.pages;

import com.krafttech.utulities.BrowserUtils;
import com.krafttech.utulities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SaucedemoLoginPage extends SaucedemoBasePage{

    @FindBy(xpath = "//input[@id='user-name']")
    public WebElement username;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement userPassword;

    @FindBy(xpath = "//input[@id='login-button']")
    public WebElement loginButton;

    public void login(String email, String password){
        username.sendKeys(email);
        userPassword.sendKeys(password);
        BrowserUtils.waitForClickablility(loginButton,9);
        loginButton.click();
    }


}
