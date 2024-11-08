package com.drMuller.step_definitions;

import com.drMuller.pages.BasePage;
import com.drMuller.pages.HomePage;
import com.drMuller.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class NavigationBar_StepDefs {
    HomePage homePage = new HomePage();



    @When("The user navigates to restorative produkte")
    public void the_user_navigates_to_restorative_produkte() {
        BrowserUtils.hover(homePage.restorativeProdukteButton);
        BrowserUtils.waitFor(1);
    }
    @And("The user clicks on the {int} category under Restorative Products")
    public void the_user_clicks_on_the_category_under_restorative_products(Integer restorativeCategory) {
        homePage.getRestorativeCategory(restorativeCategory).click();
        BrowserUtils.waitFor(2);

    }
    @Then("The user should be redirected to the {string} products page")
    public void the_user_should_be_redirected_to_the_products_page(String produktePage) {
        String actualPageTitel = homePage.getRestorativeProduktePages(produktePage).getText();
        Assert.assertEquals(actualPageTitel, produktePage);

    }
    @When("The user clicks on the {int} categories in navigation bar")
    public void the_user_clicks_on_the_categories_in_navigation_bar(Integer navbarCategories) {
        homePage.getnavbarCategories(navbarCategories).click();
        BrowserUtils.waitFor(2);

    }
    @Then("The user should be redirected to the {string} categories page")
    public void the_user_should_be_redirected_to_the_categories_page(String navbarCategoriesPage) {
        String actualPageTitel = homePage.getnavbarPagesTitel(navbarCategoriesPage).getText();
        Assert.assertEquals(actualPageTitel, navbarCategoriesPage);

    }

}
