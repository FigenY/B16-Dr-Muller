package com.drMuller.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends BasePage {

    @FindBy(xpath = "//h1[@class='h3 text-light mb-0']")
    public WebElement registrierungText;

    @FindBy(xpath = "//label[@for='gender-female']")
    public WebElement genderForWeiblich;

    @FindBy(id = "FirstName")
    public WebElement vornameInput;

    @FindBy(id = "LastName")
    public WebElement nachnameInput;

    @FindBy(id = "Email")
    public WebElement emailInput;

    @FindBy(id = "Password")
    public WebElement passwordInput;

    @FindBy(id = "ConfirmPassword")
    public WebElement confirmPasswordInput;

    @FindBy(xpath = "//button[@id='register-button']")
    public WebElement registerButton;

    @FindBy(xpath = "//div[@class='result alert alert-success']")
    public WebElement successMessage;

    @FindBy(xpath = "//div[@class='alert alert-primary alert alert-danger validation-summary-errors']//li")
    public WebElement errorMessageForAlreadyMail;

    @FindBy(id = "FirstName-error")
    public WebElement errorMessageForFirstname;

    @FindBy(id = "LastName-error")
    public WebElement errorMessageForLastname;

    @FindBy(id = "Email-error")
    public WebElement errorMessageForEmail;

    @FindBy(id = "Password-error")
    public WebElement errorMessageForPassword;

    @FindBy(id = "ConfirmPassword-error")
    public WebElement errorMessageForConfirmPassword;

    @FindBy(xpath = "//span/p")
    public WebElement errorMessageBeidePassword;

}
