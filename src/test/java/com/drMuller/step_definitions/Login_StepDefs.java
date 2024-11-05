package com.drMuller.step_definitions;

import com.drMuller.pages.LoginPage;
import com.drMuller.utilities.BrowserUtils;
import com.drMuller.utilities.ConfigReader;
import com.drMuller.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class Login_StepDefs {
    LoginPage loginPage = new LoginPage();

    @Given("User logins with valid credentials {string} {string}")
    public void user_logins_with_valid_credentials(String email, String password) {
       loginPage.login(email, password);
    }
    @Then("The user should be able to logged in")
    public void the_user_should_be_able_to_logged_in() {
        String currentUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals("https://dr-muller.com/customer/info", currentUrl);
    }
    @Given("The user is on the main page")
    public void the_user_is_on_the_main_page() {
        Driver.getDriver().get(ConfigReader.get("url"));

    }
    @When("User enters invalid {string} username")
    public void user_enters_invalid(String Username) {
        loginPage.accountButton.click();
        loginPage.emailInput.sendKeys(Username);
        BrowserUtils.waitFor(3);

    }
    @When("User enters valid {string} password")
    public void user_enters_valid(String Password) {
        loginPage.passwordInput.sendKeys(Password + Keys.ENTER);
        BrowserUtils.waitFor(2);

    }
    @When("User clicks login button")
    public void user_clicks_login_button() {
        loginPage.loginButton.click();
        BrowserUtils.waitFor(2);

    }
    @Then("The user should be able to see {string}")
    public void the_user_should_be_able_to_see (String expectedWarningMessage) {
        String actualWarningMessage = loginPage.warningMessage.getText();
        Assert.assertEquals(expectedWarningMessage, actualWarningMessage);
    }
    @When("User enters valid {string} username")
    public void user_enters_valid_username(String Username) {
        loginPage.accountButton.click();
        loginPage.emailInput.sendKeys(Username);

    }
    @When("User enters invalid {string} password")
    public void user_enters_invalid_password(String Password) {
        loginPage.passwordInput.sendKeys(Password + Keys.ENTER);
        BrowserUtils.waitFor(2);

    }
    @When("User leaves the username field blank")
    public void user_leaves_the_username_blank() {
        loginPage.accountButton.click();

    }
    @Then("The user should not be able to log in")
    public void the_user_should_not_be_able_to_log_in() {
        String currentUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertNotEquals("https://dr-muller.com/customer/info", currentUrl);

    }
    @And("User leaves the password field blank")
    public void user_leaves_the_password_blank() {

    }
    @Then("The user should be able to see the password {string} as bullet signs")
    public void the_user_should_be_able_to_see_the_password_as_bullet_signs(String Password) {
        Assert.assertEquals(Password, loginPage.passwordInput.getAttribute("type"));

    }






}
