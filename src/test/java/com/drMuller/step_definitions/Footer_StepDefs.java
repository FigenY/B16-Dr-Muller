package com.drMuller.step_definitions;

import com.drMuller.pages.BasePage;
import com.drMuller.pages.HomePage;
import com.drMuller.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Footer_StepDefs extends BasePage {
    HomePage homePage = new HomePage();

    @When("The user clicks on the {int} category in the footer")
    public void the_user_clicks_on_the_category_in_the_footer(int informationCategory) {
        homePage.getInformationCategory(informationCategory).click();
        BrowserUtils.waitFor(2);

    }
    @Then("The user should be redirected to the {string} category page")
    public void the_user_should_be_redirected_to_the_category_page(String informationCategoryPage) {
      String actualPageTitel = homePage.getInformationFooterPages(informationCategoryPage).getText();
        Assert.assertEquals(actualPageTitel, informationCategoryPage);

    }
    @When("The user clicks on the {int}  Hilfe und Service category in the footer")
    public void the_user_clicks_on_the_hilfe_und_service_category_in_the_footer(Integer hilfeUndServiceCategory) {
        homePage.getHilfeUndServiceCategory(hilfeUndServiceCategory).click();
        BrowserUtils.waitFor(2);

    }
    @Then("The user should be redirected to the {string} Hilfe und Service category pages")
    public void the_user_should_be_redirected_to_the_hilfe_und_service_category_pages(String hilfeUndServiceCategoryPage) {
        String actualPageTitle = homePage.getHilfeUndServiceFooterPages(hilfeUndServiceCategoryPage).getText();
        Assert.assertEquals(actualPageTitle, hilfeUndServiceCategoryPage);

    }

    @When("The user clicks on the {int}  My Account category in the footer")
    public void the_user_clicks_on_the_my_account_category_in_the_footer(Integer myAccountCategory) {
        homePage.getMyAccountCategory(myAccountCategory).click();
        BrowserUtils.waitFor(2);

    }
    @Then("The user should be redirected to the {string} My Account category pages")
    public void the_user_should_be_redirected_to_the_my_account_category_pages(String myAccountCategoryPage) {
        String actualPageTitle = homePage.getMyAccountFooterPages(myAccountCategoryPage).getText();
        Assert.assertEquals(actualPageTitle, myAccountCategoryPage);

    }
    @When("The user clicks on the email box under Follow us footer section")
    public void the_user_clicks_on_the_email_box_under_follow_us_footer_section() {
        homePage.newsletterEmailBox.click();
        BrowserUtils.waitFor(2);

    }
    @When("The user enters the email address {string}")
    public void the_user_enters_the_email_address(String email){
        homePage.newsletterEmailBox.sendKeys(email);
        BrowserUtils.waitFor(2);

    }
    @When("The user clicks on the Subscribe button")
    public void the_user_clicks_on_the_subsbcribe_button() {
        homePage.subscribeButton.click();
        BrowserUtils.waitFor(2);

    }
    @Then("The user should be able to see following  mesagge {string}")
    public void the_user_should_be_able_to_see_following_mesagge(String message) {
        Assert.assertEquals(homePage.newsletterResult.getText(), message);

    }

}
