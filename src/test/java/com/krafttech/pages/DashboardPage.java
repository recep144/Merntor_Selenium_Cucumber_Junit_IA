package com.krafttech.pages;


import com.krafttech.utulities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashboardPage extends BasePage{

    @FindBy(xpath = "//li[.='Dashboard']")
    public WebElement dashboardPageSubTitle;

    @FindBy(css = ".d-none.d-md-block.dropdown-toggle.ps-2")
    public WebElement userAccountName;

    @FindBy(xpath = "//span[.='John']")
    public WebElement userNameText;

    public String getProfilDetails(String job){
        return Driver.get().findElement(By.xpath("//div[.='"+job+"']")).getText();
    }

    public WebElement getAccountName(String name){
        WebElement element = Driver.get().findElement(By.xpath("//span[.='"+name+"']"));
        return element;
    }

    @FindBy(xpath = "//main[@id='main']//li[1]")
    public WebElement firstTitle;

    @FindBy(xpath = "//main[@id='main']//li[2]")
    public WebElement secondTitle;

    @FindBy(xpath = "//main[@id='main']//li[3]")
    public WebElement thirdTitle;


}