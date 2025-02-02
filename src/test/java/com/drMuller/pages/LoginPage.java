package com.drMuller.pages;

import com.drMuller.utilities.BrowserUtils;
import com.drMuller.utilities.ConfigReader;
import com.drMuller.utilities.Driver;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

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

    @FindBy (xpath = "//*[@id='navbarCollapse']/ul/li[1]/a")
    public WebElement homePageButton;

    @FindBy (xpath = "//div[contains(text(), ' Anmeldung')]//li")
    public WebElement warningMessage;



    public void login(String username, String password) {
        Driver.getDriver().get(ConfigReader.get("url"));
        accountButton.click();
        emailInput.sendKeys(username);
        BrowserUtils.waitFor(3);
        passwordInput.sendKeys(password + Keys.ENTER);
        BrowserUtils.waitFor(5);
       //loginButton.click();
    }

    public void loginWithCookie(String cookie) {
     Driver.getDriver().get(ConfigReader.get("url"));
    Cookie loginCookie = new Cookie(".Nop.Authentication", cookie);
        Driver.getDriver().manage().addCookie(loginCookie);
        Driver.getDriver().navigate().refresh();
        }
}
