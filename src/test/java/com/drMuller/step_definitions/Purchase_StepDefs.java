package com.drMuller.step_definitions;

import com.drMuller.pages.HomePage;
import com.drMuller.pages.LoginPage;
import com.drMuller.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Purchase_StepDefs {

        HomePage homePage = new HomePage();
        LoginPage loginPage=new LoginPage();

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
    @And("The user selects an existing billing address and clicks continue button")
    public void theUserSelectsAnExistingBillingAddressAndClicksContinueButton() {

    }



        @Then("The user checks {string} \\(default)")
        public void the_user_checks_default(String string) {
            //homePage.versandWeiter.click();
        }

        @Then("The user fills in new address fields if {string} is selected and clicks continue button")
        public void the_user_fills_in_new_address_fields_if_is_selected_and_clicks_continue_button(String string) {
            //homePage.zahlungsinformationWeiter.click();
        }

        @Then("The user unchecks {string}")
        public void the_user_unchecks(String string) {
            //  homePage.auftragBestatigenWeiter.click();
        }

        @Then("The user fills in the {string} fields and clicks continue button")
        public void the_user_fills_in_the_fields_and_clicks_continue_button(String string) {

        }

        @Then("The user selects a {string} and clicks continue button")
        public void the_user_selects_a_and_clicks_continue_button(String string) {
//            homePage.versandWeiter.click();
        }

        @Then("The user selects a {string}")
        public void the_user_selects_a(String string) {
//            homePage.zahlungsinformationWeiter.click();
        }

        @Then("The user sees the Payment Information and clicks continue button")
        public void the_user_sees_the_payment_information_and_clicks_continue_button() {
            homePage.auftragBestatigenWeiter.click();
        }

        @Then("The user clicks {string} and clicks continue button")
        public void the_user_clicks_and_clicks_continue_button(String string) {

        }

        @Then("The user chooses to add a new address")
        public void the_user_chooses_to_add_a_new_address() {

        }

        @Then("The user leaves required fields blank in {string}")
        public void the_user_leaves_required_fields_blank_in(String string) {

        }

        @Then("The user attempts to proceed with the purchase")
        public void the_user_attempts_to_proceed_with_the_purchase() {

        }



}


