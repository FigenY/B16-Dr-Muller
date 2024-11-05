package com.drMuller.step_definitions;

import com.drMuller.pages.HomePage;
import com.drMuller.pages.LoginPage;
import com.drMuller.utilities.BrowserUtils;
import com.drMuller.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebDriver;

public class Purchase_StepDefs {

    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();
    private WebDriver driver;

    @When("The user clicks on \"Restorative Produkte.")
    public void the_user_clicks_on_restorative_produkte() {
        homePage.restorativeProdukte.click();

    }

    @Then("The user selects a product and adds it to the cart.")
    public void the_user_selects_a_product_and_adds_it_to_the_cart() {
        homePage.restorativeProdukte.click();
        homePage.composite.click();
        homePage.ersteProduktComposite.click();

    }

    @Then("The user proceeds to the {string} page.")
    public void the_user_proceeds_to_the_page(String string) {
        BrowserUtils.waitFor(2);
        homePage.warenKorb.click();
        BrowserUtils.waitFor(2);
        BrowserUtils.scrollToElement(homePage.kasse2);
        BrowserUtils.clickWithJS(homePage.kasse2);

    }
    @And("The user selects an same existing billing address and clicks continue button")
    public void theUserSelectsAnSameExistingBillingAddressAndClicksContinueButton() {
        BrowserUtils.waitFor(3);
        homePage.versandContinue.click();
    }

    @Then("The user checks {string} \\(default)")
    public void the_user_checks_default(String string) {
        BrowserUtils.clickWithJS(homePage.zahlungsinformationWeiter);
    }

    @Then("The user selects a {string} and clicks continue button")
    public void theUserSelectsAAndClicksContinueButton(String arg0) {
        try {
            WebDriver driver = Driver.getDriver();
            Alert alert = driver.switchTo().alert();
            alert.accept();
        } catch (NoAlertPresentException e) {

        }

        try {
            BrowserUtils.clickWithJS(homePage.zahlungsinformationWeiter);
        } catch (UnhandledAlertException e) {
            Alert alert = Driver.getDriver().switchTo().alert();
            alert.accept();
            BrowserUtils.clickWithJS(homePage.zahlungsinformationWeiter);
        }
    }


    @And("The user clicks Payment Information and clicks continue button")
    public void theUserClicksPaymentInformationAndClicksContinueButton() {
        BrowserUtils.waitFor(2);
        BrowserUtils.clickWithJS(homePage.lieferanschriftWeiter);

    }

    @Then("The user clicks Confirm Order and clicks continue button")
    public void theUserClicksConfirmOrderAndClicksContinueButton() {
        BrowserUtils.clickWithJS(homePage.lieferanschriftWeiter);
    }


    @Then("The user clicks and clicks continue button")
    public void theUserClicksAndClicksContinueButton(String arg0) {

    }



    @And("The user chooses to add a different new address")
    public void theUserChoosesToAddADifferentNewAddress() {
        BrowserUtils.waitFor(2);
        homePage.neuAdresseWahlenButton.click();
        BrowserUtils.waitFor(2);
        homePage.neuAdresseOptionWahlen.click();
    }

    @Then("The user unchecks {string}and clicks continue button")
    public void theUserUnchecksAndClicksContinueButton(String arg0) {
        BrowserUtils.clickWithJS(homePage.versendeAnDieSelbeAdresseLoschen);
        BrowserUtils.waitFor(3);
        BrowserUtils.clickWithJS(homePage.versandContinue);
    }

    /*
        @Then("The user fills in the {string} fields and clicks continue button")
        public void the_user_fills_in_the_fields_and_clicks_continue_button(String string) {
            BrowserUtils.waitFor(2);
            homePage.lieferanschriftWeiter.click();
            BrowserUtils.waitFor(2);
            homePage.auftragBestatigenWeiter.click();
        }


     */
    @Then("The user selects a {string}")
    public void the_user_selects_a(String string) {
        try {
            WebDriver driver = Driver.getDriver();
            Alert alert = driver.switchTo().alert();
            alert.accept();
        } catch (NoAlertPresentException e) {

        }

        try {
            BrowserUtils.clickWithJS(homePage.zahlungsinformationWeiter);
        } catch (UnhandledAlertException e) {
            Alert alert = Driver.getDriver().switchTo().alert();
            alert.accept();
            BrowserUtils.clickWithJS(homePage.zahlungsinformationWeiter);
        }
    }



}


