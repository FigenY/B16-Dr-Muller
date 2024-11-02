package com.drMuller.step_definitions;

import com.drMuller.pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class changeLanguage_StepDefs {
    HomePage homePage = new HomePage();

    @When("The user changes the language to English using the toggle at the top right.")
    public void the_user_changes_the_language_to_english_using_the_toggle_at_the_top_right() {
        homePage.englishButton.click();
    }

    @Then("The user sees that the page title has not been updated in English.")
    public void theUserSeesThatThePageTitleHasNotBeenUpdatedInEnglish() {
        homePage.restorativeProdukte.click();
        String expectedTitle = "Dr Müller. Restorative Products";
        String actualTitle = homePage.getPageTitle();
        Assert.assertFalse("Page title is not English", expectedTitle.equals(actualTitle));
    }

    @When("The user is on the homepage.")
    public void theUserIsOnTheHomepage() {
        homePage.restorativeProdukte.isDisplayed();
    }

    @Then("The user changes the language to German using the toggle.")
    public void the_user_changes_the_language_to_german_using_the_toggle() {
        homePage.catalog.click();
        homePage.deutschButton.click();
    }

    @Then("The user sees page title update to German.")
    public void the_user_sees_page_title_update_to_german() {
        System.out.println("homePage.catalog.getText() = " + homePage.catalog.getText());
    }

    @And("The user sees that the page title has not been updated in German.")
    public void theUserSeesThatThePageTitleHasNotBeenUpdatedInGerman() {
        String expectedTitle = "Dr Müller. katalog";
        String actualTitle = homePage.getPageTitle();
        Assert.assertFalse("Page title is not Deutsch", expectedTitle.equals(actualTitle));
    }
}
