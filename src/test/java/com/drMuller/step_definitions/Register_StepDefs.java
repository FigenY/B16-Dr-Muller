package com.drMuller.step_definitions;

import com.drMuller.pages.LoginPage;
import com.drMuller.pages.RegisterPage;
import com.drMuller.utilities.ConfigReader;
import com.drMuller.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Register_StepDefs {

    LoginPage loginPage= new LoginPage();
    RegisterPage registerPage= new RegisterPage();

    @Given("User is on the home page")
    public void user_is_on_the_home_page() {
        Driver.getDriver().get(ConfigReader.get("url"));
    }

    @When("User clicks Konto icon for registrierung")
    public void user_clicks_konto_icon_for_registrierung() {
        loginPage.accountButton.click();
    }

    @When("User clicks Registrierung Button")
    public void user_clicks_registrierung_button() {
        loginPage.registrierungButton.click();
    }

    @Then("Verify that a registration form page is displayed with {string}")
    public void verify_that_a_registration_form_page_is_displayed_with(String text) {
        Assert.assertEquals(text, registerPage.registrierungText.getText());
    }

    @When("user clicks gender")
    public void user_clicks_gender() {
        registerPage.genderForWeiblich.click();
    }

    @When("user enters {string} vorname")
    public void user_enters_vorname(String vorname) {
        registerPage.vornameInput.sendKeys(vorname);
    }

    @When("user enters {string} nachname")
    public void user_enters_nachname(String nachname) {
        registerPage.nachnameInput.sendKeys(nachname);
    }

    @When("user enters {string} email")
    public void user_enters_email(String email) {
        registerPage.emailInput.sendKeys(email);
    }

    @When("user enters {string} password")
    public void user_enters_password(String password) {
        registerPage.passwordInput.sendKeys(password);
    }

    @When("user enters {string} password Confirm")
    public void user_enters_password_confirm(String passwordConfirm) {
        registerPage.confirmPasswordInput.sendKeys(passwordConfirm);
    }

    @And("user clicks registering button")
    public void userClicksRegisteringButton() {
        registerPage.registerButton.click();
    }

    @Then("verify that user can see {string} message")
    public void verify_that_user_can_see_message(String successMessage) {
        Assert.assertEquals(registerPage.successMessage.getText(),successMessage);
    }

    @Then("verify that user can see error message for already E-Mail {string}")
    public void verify_that_user_can_see_error_message_for_already_e_mail(String errorMessageForAlreadyEmail) {
        Assert.assertEquals(registerPage.errorMessageForAlreadyMail.getText(),errorMessageForAlreadyEmail);
    }

    @Then("verify that user can see error message for not match Passwords {string}")
    public void verify_that_user_can_see_error_message_for_not_match_passwords(String errorMessageForNotMatchPasswords) {
        Assert.assertEquals(registerPage.errorMessageForConfirmPassword.getText(),errorMessageForNotMatchPasswords);
    }

    @Then("verify that user can see error message for Vorname {string}")
    public void verify_that_user_can_see_error_message_for_vorname(String errorMessageForVorname) {
       Assert.assertEquals(registerPage.errorMessageForFirstname.getText(),(errorMessageForVorname));
    }

    @Then("verify that user can see error message for Nachname {string}")
    public void verify_that_user_can_see_error_message_for_nachname(String errorMessageForNachname) {
        Assert.assertEquals(registerPage.errorMessageForLastname.getText(),errorMessageForNachname);
    }

    @Then("verify that user can see error message for Email {string}")
    public void verify_that_user_can_see_error_message_for_email(String errorMessageForEmail) {
       Assert.assertEquals(registerPage.errorMessageForEmail.getText(),errorMessageForEmail);
    }

    @Then("verify that user can see error message for Password {string}")
    public void verify_that_user_can_see_error_message_for_password(String errorMessageForPassword) {
        Assert.assertEquals(registerPage.errorMessageForConfirmPassword.getText(),errorMessageForPassword);
    }

    @Then("verify that user can see error message for Password Confirm {string}")
    public void verify_that_user_can_see_error_message_for_password_confirm(String errorMessageForPasswordConfirm) {
       Assert.assertEquals(registerPage.errorMessageForConfirmPassword.getText(),errorMessageForPasswordConfirm);
    }

    @Then("verify that user can see error message for Password {string} and for Password Confirm {string}")
    public void verify_that_user_can_see_error_message_for_password_and_for_password_confirm(String password, String passwordConfirm) {
        Assert.assertEquals(registerPage.errorMessageForConfirmPassword.getText(),passwordConfirm);
        Assert.assertEquals(registerPage.errorMessageForPassword.getText(),password);
    }

    @Then("verify that user can see error message for invalid Password {string}")
    public void verify_that_user_can_see_error_message_for_invalid_password(String errorMessageForInvalidPassword) {
        Assert.assertEquals(registerPage.errorMessageBeidePassword.getText(),errorMessageForInvalidPassword);
    }

    @Then("verify that user can see other error message for invalid Password {string}")
    public void verify_that_user_can_see_other_error_message_for_invalid_password(String otherErrorMessageForInvalidPassword) {
        Assert.assertEquals(registerPage.otherErrorMessageBeidePassword.getText(),otherErrorMessageForInvalidPassword);
    }

}
