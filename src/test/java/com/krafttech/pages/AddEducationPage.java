package com.krafttech.pages;


import com.krafttech.utulities.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class AddEducationPage extends BasePage {

    Actions actions = new Actions(Driver.get());
    @FindBy(css = "#school")
    public WebElement schoolOrBootCampInputBox;

    @FindBy(css = "#degree")
    public WebElement degreeOrCertificateInputBox;

    @FindBy(css = "#study")
    public WebElement studyInputBox;

    @FindBy(xpath = "(//input[@id='fromdate'])[2]")
    public WebElement fromDateInputBox;

    @FindBy(xpath = "//input[@id='currentedu']")
    public WebElement currentSchoolButton;

    @FindBy(xpath = "//input[@id='todateedu']")
    public WebElement toDateInputBox;

    @FindBy(xpath = "(//textarea[@id='description'])[2]")
    public WebElement programDescriptionInpuBox;

    @FindBy(xpath = "(//button[.='Add Education'])[2]")
    public WebElement addEducatonButton;

    @FindBy(xpath = "(//h5[.='About'])")
    public WebElement textInThePage;

    public String textForTest(){
        return textInThePage.getText();
    }

    public void educationInformations(String school, String degree, String study, String fromDate,
                                      String toDate, String programDescription){

        actions.click(schoolOrBootCampInputBox).sendKeys(school+ Keys.TAB)
                .sendKeys(degree+Keys.TAB).sendKeys(study+Keys.TAB)
                .sendKeys(fromDate+Keys.TAB+Keys.TAB).sendKeys(toDate+Keys.TAB).
                sendKeys(programDescription+Keys.TAB+Keys.ENTER).perform();



    }

}

