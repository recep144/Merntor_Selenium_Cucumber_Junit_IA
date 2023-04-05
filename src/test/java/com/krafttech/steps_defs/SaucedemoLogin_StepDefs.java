package com.krafttech.steps_defs;

import com.krafttech.pages.*;
import com.krafttech.utulities.BrowserUtils;
import com.krafttech.utulities.ConfigurationReader;
import com.krafttech.utulities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

public class SaucedemoLogin_StepDefs {

    SaucedemoLoginPage saucedemoLoginPage = new SaucedemoLoginPage();
    SaucedemoProductsPage saucedemoProductsPage = new SaucedemoProductsPage();
    SaucedemoYourCardPage saucedemoYourCardPage = new SaucedemoYourCardPage();
    SaucedemoCheckOutPage saucedemoCheckOutPage = new SaucedemoCheckOutPage();
    SaucedemoOverwiewPage saucedemoOverwiewPage = new SaucedemoOverwiewPage();
    @When("The user is on the login page of Saucedemo")
    public void theUserIsOnTheLoginPageOfSaucedemo() {
        String url = ConfigurationReader.get("urlSaucedemo");
        Driver.get().get(url);
    }
    @When("The user logs in using {string} and {string}")
    public void theUserLogsInUsingAnd(String userName, String password) {
        saucedemoLoginPage.login(userName,password);

    }

    @Then("The user Sort the products high to  low with {string}")
    public void theUserSortTheProductsHighToLowWith(String choice) {
        saucedemoLoginPage.sortButtonClick(choice);
        BrowserUtils.waitFor(10);
    }

    @Then("The user add to cart one item {string}")
    public void theUserAddToCartOneItem(String urun) {
        saucedemoProductsPage.secilenUrun(urun);

    }

    @And("Verify that the basket shows the true number of {string}")
    public void verifyThatTheBasketShowsTheTrueNumberOf(String sayi) {
        saucedemoProductsPage.assertTheBasketNumber(sayi);
    }

    @Then("The user Navigate to Your cart page")
    public void theUserNavigateToYourCartPage() {
        saucedemoProductsPage.sepetButton();
    }

    @And("Verify that the right items added to cart {string}")
    public void verifyThatTheRightItemsAddedToCart(String urun) {
        saucedemoYourCardPage.urunDogrulama(urun);
    }


    @Then("The user go to checkout page and fill the form")
    public void theUserGoToCheckoutPageAndFillTheForm() {
        BrowserUtils.clickWithJS(saucedemoYourCardPage.checkOutButton);
    }


    @Then("The user and fill the  with {string} , {string} and {string}")
    public void theUserAndFillTheWithAnd(String name, String lastName, String zipCode) {
        saucedemoCheckOutPage.fillTheCheckOutForm(name,lastName,zipCode);
        BrowserUtils.waitFor(5);
    }

    @And("Verify that the price of items {string}")
    public void verifyThatThePriceOfItems(String urun) {
        saucedemoOverwiewPage.assertPriceOfItems(urun);
    }

    @Then("The user Click finish button")
    public void theUserClickFinishButton() {
        saucedemoYourCardPage.checkOutButton();
    }

    @And("Verify that the success shopping message")
    public void verifyThatTheSuccessShoppingMessage() {
        String expectedMessage = "Thank you for your order!";
        String actual = Driver.get().findElement(By.xpath("//h2[.='Thank you for your order!']")).getText();
        Assert.assertEquals(expectedMessage,actual);
        BrowserUtils.waitFor(5);
    }
}
