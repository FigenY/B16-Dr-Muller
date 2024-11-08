package com.drMuller.step_definitions;

import com.drMuller.pages.AddressPage;
import com.drMuller.utilities.BrowserUtils;
import com.drMuller.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class myAccountAddress_StepDefs {
    AddressPage addressPage = new AddressPage();
    WebDriver driver = Driver.getDriver();

    @And("The user clicks on the address button")
    public void the_user_clicks_on_the_address_button() {
        addressPage.addressesButton.click();

    }
    @When("The user clicks on the add new button")
    public void the_user_clicks_on_the_add_new_button() {
        addressPage.addNewAddressButton.click();

    }
    @When("The user clicks on the {string} info boxes respectively")
    public void the_user_clicks_on_the_respectively(String infoBoxes) {
        addressPage.clickAddressInfoBox(infoBoxes).click();
    }
    @When("The user enters {string} informations")
    public void the_user_enters(String informations) {
        addressPage.clickAddressInfoBox(informations).sendKeys(informations);
    }

    @When("The user selects country")
    public void the_user_selects_country() {
        WebElement dropdown = driver.findElement(By.id("Address_CountryId"));
        Select select = new Select(dropdown);
        select.selectByVisibleText("Germany");

    }
    @When("The user selects State Province")
    public void the_user_selects_state_province() {
        WebElement dropdown = driver.findElement(By.id("Address_StateProvinceId"));
        Select select = new Select(dropdown);
        select.selectByVisibleText("Berlin");


    }
    @When("The user clicks on the save button")
    public void the_user_clicks_on_the_save_button() {
        addressPage.addressesSaveButton.click();
    }
    @Then("The user should be able to add a new address")
    public void the_user_should_be_able_to_add_a_new_address() {
        Assert.assertEquals("John Doe", addressPage.title);

    }
    @When("The user clicks on the edit button")
    public void the_user_clicks_on_the_edit_button() {
       addressPage.editAddressButton.click();
    }
    @When("The user clicks on the {string} info boxes respectively and clears")
    public void the_user_clicks_on_the_info_boxes_respectively_and_clears(String infoBoxes) {
        addressPage.clickAddressInfoBox(infoBoxes).click();
        addressPage.clickAddressInfoBox(infoBoxes).clear();
    }
    @Then("The user should be able to update address")
    public void the_user_should_be_able_to_update_address() {
        Assert.assertEquals("Jane Doe", addressPage.title);
    }
    @When("The user clicks on the account button")
    public void the_user_clicks_on_the_account_button() {
       addressPage.accountButton.click();
    }


}
