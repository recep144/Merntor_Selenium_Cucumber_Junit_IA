package com.krafttech.pages;

import com.krafttech.utulities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public abstract class SaucedemoBasePage {

    public SaucedemoBasePage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(xpath = "//span[@class='select_container']")
    public WebElement sortButton;
    @FindBy(xpath = "//span[text()='Price (high to low)']")
    public WebElement highToLow;

    public void sortButtonClick(String choice){
        sortButton.click();
        Select select = new Select(Driver.get().findElement(By.xpath("//select[@class='product_sort_container']")));
        select.selectByVisibleText(choice);
    }


}
