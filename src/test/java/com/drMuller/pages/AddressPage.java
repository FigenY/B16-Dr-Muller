package com.drMuller.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Quotes;

import java.util.List;



public class AddressPage extends BasePage{

    WebDriver driver = new ChromeDriver();

    @FindBy(xpath = "(//*[text()='Addresses'])[1]")
    public WebElement addressesButton;

    @FindBy(xpath = "//*[text()=\"Add new\"]")
    public WebElement addNewAddressButton;
    @FindBy(xpath = "//*[@id=\"Address_CountryId\"]/option[11]")
    public WebElement countryGermany;

    @FindBy(xpath = " //*[@id=\"Address_StateProvinceId\"]/option[4]")
    public WebElement stateBerlin;

    @FindBy(xpath = " (//*[@type=\"submit\"])[2]")
    public WebElement addressesSaveButton;

    @FindBy(xpath = "//*[@class=\"title\"]")
    public WebElement title;

    @FindBy(xpath = "//*[@class=\"czi-edit\"]")
    public WebElement editAddressButton;
    @FindBy(xpath = " //div[@class=\"navbar-tool-icon-box\"]")
    public WebElement accountButton;





    public WebElement clickAddressInfoBox (String infoName) {
        return driver.findElement(By.xpath("//*[@id="+infoName+"]"));
    }

        }










