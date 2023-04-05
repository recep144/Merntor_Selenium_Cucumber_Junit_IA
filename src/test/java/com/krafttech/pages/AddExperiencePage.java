package com.krafttech.pages;


import com.krafttech.utulities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddExperiencePage extends BasePage {

    @FindBy(xpath = "//input[@placeholder='Job Title *']")
    public WebElement jobTitleInputBox;

    @FindBy(xpath = "//input[@placeholder='Company *']")
    public WebElement companyInputBox;

    @FindBy(xpath = "//input[@placeholder='Location']")
    public WebElement locationInputBox;

    @FindBy(xpath = "(//input[@id='fromdate'])[1]")
    public WebElement fromDateInputBox;

    @FindBy(xpath = "//input[@class='form-control' and @id='todateexp']")
    public WebElement toDateInputBox;

    @FindBy(xpath = "//textarea[@placeholder='Job Description']")
    public WebElement jobDescriptionInputBox;
    @FindBy(xpath = "(//button[.='Add Experience'])[2]")
    public WebElement addExperienceButton;

    @FindBy(xpath = "//h5[.='About']")
    public WebElement textInThePage;

    public void jobTittle(String jobTitle){
        jobTitleInputBox.click();
        jobTitleInputBox.sendKeys(jobTitle);
    }
    public void currentJobBox(){
        Driver.get().findElement(By.xpath("//input[@id='currentexp']")).click();
    }
    public void date(String date){
        Driver.get().findElement(By.xpath("//input[@id='currentexp']"+ Keys.TAB+Keys.ENTER)).sendKeys(date);
    }

    public String ExcellentText(){
        return textInThePage.getText();
    }

}