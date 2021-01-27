package com.hrms.stepdefinitions;

import com.hrms.pages.LoginPage;
import com.hrms.utils.CommonMethods;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.omg.CORBA.DynAnyPackage.Invalid;

public class LoginStepDefinition extends CommonMethods {

    @Given("navigate to HRMS login page")
    public void navigate_to_hrms_login_page() {
        setUp();
    }

    @When("enter valid credentials")
    public void enter_valid_credentials() {
        loginPage.login("Admin", "Hum@nhrm123");

    }

    @When("click on login button")
    public void click_on_login_button() {
        loginPage.clickOnLoginButton();
    }

    @Then("verify dashboard is displayed")
    public void verify_dashboard_is_displayed() {
        Assert.assertTrue(dashboardPage.welcomeMessage.isDisplayed());

    }

    @Then("quit the browser")
    public void quit_the_browser() {
        tearDown();
    }

    @When("enter invalid credentials")
    public void enter_invalid_credentials() {
        loginPage.login("Admin3", "Hum@nhrm1233");
    }

    @Then("verify error message is displayed")
    public void verify_error_message_is_displayed() {
         Assert.assertEquals("Verifying error message", "Invalid credentials", loginPage.getErrorMessageText());
    }

    @When("leave username empty and put valid password")
    public void leave_username_empty_and_put_valid_password() {
        loginPage.login("", "Hum@nhrm123");
    }

    @Then("verify error message {string}")
    public void verify_error_message(String string) {
        Assert.assertEquals("Verifying Error Message", "Username cannot be empty", loginPage.getErrorMessageText());

    }

    @When("leave password empty and put valid username")
    public void leave_password_empty_and_put_valid_username() {
        loginPage.login("Admin", "");
    }

    @Then("validate error message {string}")
    public void validate_error_message(String string) {
        Assert.assertEquals("Verifying Error Message", "Password cannot be empty", loginPage.getErrorMessageText());
    }

}
