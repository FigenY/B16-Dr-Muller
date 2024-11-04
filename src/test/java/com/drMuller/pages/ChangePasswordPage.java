package com.drMuller.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ChangePasswordPage extends BasePage {

    @FindBy(xpath = "//li[@class='border-bottom mb-0 change-password inactive']/a")
    public WebElement passwordChange;

    @FindBy(xpath = "//input[@name='OldPassword']")
    public WebElement oldPasswordInput;

    @FindBy(xpath = "//input[@name='NewPassword']")
    public WebElement newPasswordInput;

    @FindBy(xpath = "//input[@name='ConfirmNewPassword']")
    public WebElement confirmNewPasswordInput;

    @FindBy(xpath = "//button[@class='btn btn-primary col-12 col-md-4']")
    public WebElement passwordÄndernButton;

    @FindBy(xpath = "//p[@class='content']")
    public WebElement successMessageForPasswordChange;

}
