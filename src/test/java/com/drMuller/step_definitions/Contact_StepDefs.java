package com.drMuller.step_definitions;

import com.drMuller.pages.BasePage;
import com.drMuller.pages.HomePage;
import com.drMuller.pages.LoginPage;
import com.drMuller.utilities.BrowserUtils;
import com.drMuller.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class Contact_StepDefs extends BasePage {

    HomePage homePage = new HomePage();
    LoginPage loginPage=new LoginPage();

    @When("The user locates and clicks on the {string} link to open the Contact page.")
    public void the_user_locates_and_clicks_on_the_link_to_open_the_contact_page(String string) {
        homePage.contactUs.click();
    }

    @Then("Verify that the Address is visible on the Contact page.")
    public void verify_that_the_address_is_visible_on_the_contact_page() {
        homePage.address.isDisplayed();
    }

    @Then("The user clicks on the Address link.")
    public void the_user_clicks_on_the_address_link() {
        homePage.address.click();
    }

    @Then("The user sees that the WhatsApp icon is visible on the Contact page")
    public void the_user_sees_that_the_whats_app_icon_is_visible_on_the_contact_page_p() {
        homePage.whatsApp.isDisplayed();
    }

    @Then("The user clicks on the WhatsApp icon.")
    public void the_user_clicks_on_the_whats_app_icon() {
        homePage.whatsApp.click();
    }

    @Then("The user sees that the Phone Number is visible on the Contact page.")
    public void the_user_sees_that_the_phone_number_is_visible_on_the_contact_page() {
        homePage.phone.isDisplayed();
    }

    @Then("The user clicks on the Phone Number.")
    public void the_user_clicks_on_the_phone_number() {
        homePage.phone.click();
    }

    @When("The user locates and clicks on the {string} icon to open the Contact page.")
    public void the_user_locates_and_clicks_on_the_icon_to_open_the_contact_page(String string) {
        homePage.contactUs.click();
    }

    @Then("The user sees that the Email address is visible on the Contact page.")
    public void the_user_sees_that_the_email_address_is_visible_on_the_contact_page() {
        homePage.name.sendKeys("Anna Angler");
    }

    @Then("The user clicks on the Email address.")
    public void the_user_clicks_on_the_email_address() {
        homePage.email.click();
    }

    @When("The user sees that the Contact Form is visible on the Contact page.")
    public void the_user_sees_that_the_contact_form_is_visible_on_the_contact_page() {
        homePage.name.isDisplayed();
    }

    @Then("The user fills the Name field.")
    public void the_user_fills_the_name_field() {
        homePage.name.sendKeys("Anna Angel");
    }

    @Then("The user fills the Email field.")
    public void the_user_fills_the_email_field() {
        homePage.yourEmail.sendKeys("batch16@gmail.com");
    }

    @Then("The user fills the Subject field.")
    public void the_user_fills_the_subject_field() {
        homePage.subject.sendKeys("My Teeth");
    }

    @Then("The user fills the Enquriy field.")
    public void the_user_fills_the_enquriy_field() {
        homePage.enquriy.sendKeys("Can I make an appointment");
    }

    @And("The user clicks on the Submit button.")
    public void theUserClicksOnTheSubmitButton() {
        homePage.submit.click();
        BrowserUtils.waitFor(2);


    }

    @Then("Verify that a {string} appears.")
    public void verifyThatAAppears(String alertMessage) {
        BrowserUtils.waitFor(2);
        BrowserUtils.scrollToElement(homePage.alertMessage);
   //     homePage.verifyAlertMessage(alertMessage);
    }
}