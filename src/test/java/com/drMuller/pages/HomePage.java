package com.drMuller.pages;
import com.drMuller.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {
WebDriver driver;
    @FindBy (xpath = "//a[@href='/contactus']")
    public WebElement contactUs;

    @FindBy (xpath = "//div[@class='card-body text-center']//h3[@class='h6 mb-3']")
    public WebElement address;

    @FindBy (xpath = "(//div[@class='card-body text-center']//h3[@class='h6 mb-3'])[2]")
    public WebElement whatsApp ;

    @FindBy (xpath = "(//div[@class='card-body text-center']//h3[@class='h6 mb-3'])[3]")
    public WebElement phone;

    @FindBy (xpath = "(//div[@class='card-body text-center']//h3[@class='h6 mb-3'])[4]")
    public WebElement email;

    @FindBy (xpath = "//input[@name='FullName']")
    public WebElement name;

    @FindBy (xpath = "//input[@name='Email']")
    public WebElement yourEmail;

    @FindBy (xpath = "//input[@name='Subject']")
    public WebElement subject;

    @FindBy (xpath = "//textarea[@name='Enquiry']")
    public WebElement enquriy;

    @FindBy (xpath = "//div[@class='d-flex justify-content-center BtnArea']//button[@class='btn btn-primary col-12 col-md-4']")
    public WebElement submit;

    @FindBy (xpath = "//div[@class='alert alert-success result']")
    public WebElement alertMessage;

    public void verifyAlertMessage(String alertMessage) {
        this.alertMessage.getText();
    }

    @FindBy (xpath = "//a[@class='ml-1']//img[@title='EN']")
    public WebElement englishButton;

    @FindBy (xpath = "//a[@class='ml-1']//img[@title='DE']")
    public WebElement deutschButton;

    @FindBy (xpath = "//a[@href='/restorative-produkte']")
    public WebElement restorativeProdukte;

    @FindBy (xpath = "//a[@href='/catalog']")
    public WebElement catalog;

    @FindBy (xpath = "(//a[@class='nav-link-style d-flex align-items-center py-2'])[1]")
    public WebElement composite;

    public HomePage() {
        this.driver = Driver.getDriver();
        PageFactory.initElements(driver, this);
    }
    public String getPageTitle() {
        return driver.getTitle();
    }

}


