package com.drMuller.step_definitions;

import com.drMuller.pages.HomePage;
import com.drMuller.pages.SearchPage;
import com.drMuller.utilities.BrowserUtils;
import com.drMuller.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class searchBar_StepDefs {

    HomePage homePage = new HomePage();
    SearchPage searchPage = new SearchPage();

    @When("The user clicks on the searchbar")
    public void the_user_clicks_on_the_searchbar() {
        homePage.searchbar.click();
    }
    @When("The user enters a product name {string} on the searchbar")
    public void the_user_enters_a_product_name_on_the_searchbar(String productName) {
        homePage.searchbar.sendKeys(productName);
    }
    @Then("The user should be able to see that the product is displayed when the user searches for the item on the website")
    public void the_user_should_be_able_to_see_that_the_product_is_displayed_when_the_user_searches_for_the_item_on_the_website() {
        Assert.assertEquals("Adler Selective Etch Bond",homePage.searchResult.getText());
    }
    @Then("The user clicks on the product name in the search bar")
    public void the_user_clicks_on_the_product_name_in_the_search_bar() {
        homePage.searchResult.click();
    }
    @Then("The user should be able to see the detail page of the relevant product")
    public void the_user_should_be_able_to_see_the_detail_page_of_the_relevant_product() {
        String expectedTitle = "Dr Müller. Adler Selective Etch Bond";
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals(actualTitle,expectedTitle);
    }
    @When("The user clicks on the search icon")
    public void the_user_clicks_on_the_search_icon() {
        searchPage.searchIcon.click();
    }
    @Then("The user should be able to see the message {string} on the search page.")
    public void the_user_should_be_able_to_see_the_message_on_the_search_page(String expectedMessage) {
        searchPage.noProductsFound.getText();
        Assert.assertNotEquals("Apple", expectedMessage);
    }
}
