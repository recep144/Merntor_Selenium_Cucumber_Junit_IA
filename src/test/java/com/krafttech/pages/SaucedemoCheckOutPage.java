package com.krafttech.pages;

import com.krafttech.utulities.BrowserUtils;
import com.krafttech.utulities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import java.security.Key;

public class SaucedemoCheckOutPage extends SaucedemoBasePage{

    public void fillTheCheckOutForm(String firstName, String lastName, String zipCode){
        WebElement name = Driver.get().findElement(By.cssSelector("#first-name"));
        WebElement continueButton = Driver.get().findElement(By.cssSelector("#continue"));
        Actions action = new Actions(Driver.get());
        action.click(name).sendKeys(firstName+Keys.TAB).sendKeys(lastName+Keys.TAB).
        sendKeys(zipCode).perform();
        BrowserUtils.waitForClickablility(continueButton,9);
        BrowserUtils.clickWithJS(continueButton);
    }
}
