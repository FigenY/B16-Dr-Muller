package com.drMuller.pages;

import com.drMuller.utilities.BrowserUtils;
import com.drMuller.utilities.ConfigReader;
import com.drMuller.utilities.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.security.Key;

public class LoginPage extends BasePage {

    @FindBy (xpath = "//div[@class='navbar-tool-text ml-n3']")
    public WebElement accountButton;

    @FindBy (id = "Email")
    public WebElement emailInput;

    @FindBy (id = "Password")
    public WebElement passwordInput;

    @FindBy (xpath = "//button[@class='btn btn-primary col-12']")
    public WebElement loginButton;

    @FindBy (xpath = "//button[@class='btn btn-success col-12']")
    public WebElement registrierungButton;


    public void login(String username, String password) {
        Driver.getDriver().get(ConfigReader.get("url"));
        accountButton.click();
        emailInput.sendKeys(username);
        BrowserUtils.waitFor(2);
        passwordInput.sendKeys(password + Keys.ENTER);
    }
}
