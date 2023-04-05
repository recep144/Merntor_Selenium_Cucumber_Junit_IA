package com.krafttech.steps_defs;

import com.krafttech.pages.AddEducationPage;
import com.krafttech.pages.DashboardPage;
import com.krafttech.pages.LoginPage;
import com.krafttech.pages.OverviewPage;
import com.krafttech.utulities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;

public class Dashboard_StepDefs {

    DashboardPage dashboardPage = new DashboardPage();
    OverviewPage overviewPage = new OverviewPage();
    AddEducationPage addEducationPage = new AddEducationPage();
    LoginPage loginPage = new LoginPage();

    @Then("The user should be able to see userName: {string}")
    public void the_user_should_be_able_to_see_userName(String userName) {
    String actualName = dashboardPage.getAccountName(userName).getText();
    String expectedName=userName;
    Assert.assertEquals(expectedName,actualName);
    }

    @When("The user navigate to {string} and {string}")
    public void the_user_navigate_to_and(String tab, String module) {
        dashboardPage.navigateToModule(tab,module);

    }
    @Then("The user should be able to see overwiew page")
    public void the_user_should_be_able_to_see_overwiew_page() {
        Assert.assertTrue(overviewPage.textInThePage.isDisplayed());
    }
    @When("The user navigate to profile tab: {string}")
    public void the_user_navigate_to_profile_tab(String string) {
        overviewPage.tapOnTab(string);
    }
    @Then("The user should be able to see {string} button")
    public void the_user_should_be_able_to_see_button(String string) {
        BrowserUtils.waitForVisibility(addEducationPage.addEducatonButton,9);
        Assert.assertTrue(addEducationPage.addEducatonButton.isDisplayed());
    }

    @When("The user login using {string} and {string}")
    public void theUserLoginUsingAnd(String arg0, String arg1) {
        loginPage.login(arg0,arg1);
    }

    @And("The user should be able to see all tabs dhown on the dashboard page")
    public void theUserShouldBeAbleToSeeAllTabsDhownOnTheDashboardPage(List<String> expectedtabNames) {
         List<String> actualNames = BrowserUtils.getElementsText(dashboardPage.tabName);
        Assert.assertEquals(expectedtabNames,actualNames);
        System.out.println("expectedtabNames = " + expectedtabNames);
        System.out.println("actualNames = " + actualNames);
    }

    @When("The user fill the form with following list")
    public void theUserFillTheFormWithFollowingList(List<String> textInfo) {
        addEducationPage.educationInformations(textInfo.get(0),textInfo.get(1),textInfo.get(2),
                textInfo.get(3),textInfo.get(4),textInfo.get(5));
    }

    @Then("The user should see added record with: {string}")
    public void theUserShouldSeeAddedRecordWith(String text) {
        String actual = overviewPage.textInThePageEducationDetails(text);
        String expected = text;
        Assert.assertEquals(expected,actual);

    }

    @And("The user should be able to delete last added record with: {string}")
    public void theUserShouldBeAbleToDeleteLastAddedRecordWith(String deleteName) {
        overviewPage.deleteTuEducationDetails();
    }
}
