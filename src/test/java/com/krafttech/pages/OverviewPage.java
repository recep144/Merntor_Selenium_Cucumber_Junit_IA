package com.krafttech.pages;


import com.krafttech.utulities.BrowserUtils;
import com.krafttech.utulities.Driver;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OverviewPage extends BasePage {
    @FindBy(xpath = "//div[@role='alert']")
    public WebElement helperText;

    @FindBy(xpath = "//div[.='QA']")
    public WebElement jobName;

    @FindBy(xpath = "//div[@role='alert']")
    public WebElement profileUpdatedText;

    @FindBy(xpath = "//h5[.='About']")
    public WebElement textInThePage;

    @FindBy(xpath = "//span[.='KraftTech']")
    public WebElement textInThePageEducationDetails;

    public String textInThePageEducationDetails(String schoolName) {
        return Driver.get().findElement(By.xpath("//span[.='" + schoolName + "']")).getText();
    }

    @FindBy(xpath = "//td[@width='30px']//i")
    public WebElement deleteToEducationDetails;

    public void deleteTuEducationDetails() {
        BrowserUtils.clickWithJS(deleteToEducationDetails);
        Alert alert = Driver.get().switchTo().alert();
        alert.accept();
    }

    public String getHelperTextString() {
        //String expected = helperText.getText();
        //return expected;
        return helperText.getText();
    }

    public void tapOnTab(String str) {
        //driver.findElement(By.xpath("//*[.='Alperen']));
        WebElement tab = Driver.get().findElement(By.xpath("//li/button[.='" + str + "']"));
        tab.click();
    }
}

