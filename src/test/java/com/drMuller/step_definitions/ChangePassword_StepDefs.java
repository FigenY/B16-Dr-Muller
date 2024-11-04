package com.drMuller.step_definitions;

import com.drMuller.pages.ChangePasswordPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;


public class ChangePassword_StepDefs {

    ChangePasswordPage changePasswordPage = new ChangePasswordPage();

    @When("User clicks password ändern")
    public void user_clicks_password_ändern() {
        changePasswordPage.passwordChange.click();
    }

    @Then("Verify that a change password button")
    public void verify_that_a_change_password_button() {
        Assert.assertTrue(changePasswordPage.passwordÄndernButton.isDisplayed());
    }

    @When("User enters {string} altes Passwort")
    public void user_enters_altes_passwort(String altesPasswort) {
        changePasswordPage.oldPasswordInput.sendKeys(altesPasswort);
    }

    @When("User enters {string} neues Passwort")
    public void user_enters_neues_passwort(String neuesPasswort) {
        changePasswordPage.newPasswordInput.sendKeys(neuesPasswort);
    }

    @When("User enters {string} Passwort bestätigen")
    public void user_enters_passwort_bestätigen(String passwortBestätigen) {
        changePasswordPage.confirmNewPasswordInput.sendKeys(passwortBestätigen);
    }

    @When("User clicks password ändern button on the change password page")
    public void user_clicks_password_ändern_button_on_the_change_password_page() {
        changePasswordPage.passwordÄndernButton.click();
    }

    @Then("verify that user can see message {string}")
    public void verify_that_user_can_see_message(String successMessage) {
        Assert.assertEquals(changePasswordPage.successMessageForPasswordChange.getText(), successMessage);
    }
}
