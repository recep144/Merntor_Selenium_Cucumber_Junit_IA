package com.krafttech.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ChangePasswordPage extends BasePage{


    @FindBy(css = "#currentPassword")
    public WebElement currentPasswordBox;

    @FindBy(css = "#newPassword")
    public WebElement newPasswordBox;

    @FindBy(css = "#renewPassword")
    public WebElement reEnterNewPasswordBox;

    @FindBy(xpath = "//button[@value='password' and .='Change Password']")
    public WebElement changePasswordButton;

    @FindBy(xpath = "//div[contains(text(),'Password Updated...')]")
    public WebElement assertTextInThePage;
    public String assertTextInNewPage(){
        return assertTextInThePage.getText();
    }



}
