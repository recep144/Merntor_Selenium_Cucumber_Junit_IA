package com.krafttech.steps_defs;

import com.krafttech.utulities.ConfigurationReader;
import com.krafttech.utulities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login_StepsDefs {

    @Given("The user is on the login page")
    public void the_user_is_on_the_login_page() {
        Driver.get().get(ConfigurationReader.get("url"));
    }

    @When("The user type in Selim's credentials")
    public void the_user_type_in_selim_s_credentials() {

    }

    @Then("The user should be able to login successfuLogin_Stelly")
    public void the_user_should_be_able_to_login_successfu_login_stelly() {

    }


}
