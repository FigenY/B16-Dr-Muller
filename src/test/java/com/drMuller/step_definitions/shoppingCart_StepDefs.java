package com.drMuller.step_definitions;

import com.drMuller.pages.HomePage;
import com.drMuller.pages.LinersPage;
import com.drMuller.pages.ShoppingCartPage;
import com.drMuller.utilities.BrowserUtils;
import com.drMuller.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class shoppingCart_StepDefs {

    HomePage homePage = new HomePage();
    LinersPage linersPage = new LinersPage();
    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();

    @When("The user clicks on the shopping cart icon")
    public void the_user_clicks_on_the_shopping_cart_icon() {
        BrowserUtils.waitFor(2);
        homePage.shoppingCartIcon.click();
    }

    @Then("The user should be able to see the shopping cart page")
    public void the_user_should_be_able_to_see_the_shopping_cart_page() {
        Assert.assertEquals(homePage.pageTitle.getText(),"Shopping Cart");
    }
    @When("The user scrolls down")
    public void the_user_scrolls_down() {
        ((JavascriptExecutor) Driver.getDriver()).executeScript("window.scrollTo(0, document.body.scrollHeight / 2)");
        BrowserUtils.waitFor(2);
    }

    @When("The user clicks on {string} category")
    public void the_user_clicks_on_category(String categoryName) {
        WebElement categoryElement = homePage.getCategory(categoryName);
        categoryElement.click();
    }

    @When("The user clicks Add to cart button on the {string} item")
    public void the_user_clicks_add_to_cart_button_on_the_item(String index) {
        linersPage.getProductContainer(index).click();
        BrowserUtils.waitFor(2);
    }

    @Then("The user should be able to see on the top of page {string}")
    public void the_user_should_be_able_to_see_on_the_top_of_page(String expectedMessage) {
        String actualMessage = "The product has been added to your shopping cart";
        Assert.assertEquals(expectedMessage, actualMessage);
    }

    @Then("The user sets the quantity of the first item to {string}")
    public void the_user_sets_the_quantity_of_the_first_item_to(String quantity) {
        shoppingCartPage.getQuantityBox("1").click();
        BrowserUtils.waitFor(1);
        shoppingCartPage.getSelectQuantity(quantity);
    }
    @Then("The user sets the quantity of the second item to {string}")
    public void the_user_sets_the_quantity_of_the_second_item_to(String quantity) {
        shoppingCartPage.getQuantityBox("2").click();
        BrowserUtils.waitFor(1);
        shoppingCartPage.getSelectQuantity(quantity);
    }
    @Then("The user should see the quantity values updated to {string} and {string} on the shopping cart page")
    public void the_user_should_see_the_quantity_values_updated_to_and_on_the_shopping_cart_page(String expectedValue1, String expectedValue2) {
        String actualValue1 = shoppingCartPage.getSelectQuantity("2");
        String actualValue2 = shoppingCartPage.getSelectQuantity("2");
        Assert.assertEquals(expectedValue1, actualValue1);
        Assert.assertEquals(expectedValue2, actualValue2);
    }
}
