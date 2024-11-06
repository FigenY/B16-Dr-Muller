package com.drMuller.pages;
import com.drMuller.utilities.BrowserUtils;
import com.drMuller.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.bouncycastle.cms.RecipientId.password;

public class HomePage extends BasePage {
    WebDriver driver;
    LoginPage loginPage = new LoginPage();
    @FindBy(xpath = "//a[@href='/contactus']")
    public WebElement contactUs;

    @FindBy(xpath = "//div[@class='card-body text-center']//h3[@class='h6 mb-3']")
    public WebElement address;

    @FindBy(xpath = "(//div[@class='card-body text-center']//h3[@class='h6 mb-3'])[2]")
    public WebElement whatsApp;

    @FindBy(xpath = "(//div[@class='card-body text-center']//h3[@class='h6 mb-3'])[3]")
    public WebElement phone;

    @FindBy(xpath = "(//div[@class='card-body text-center']//h3[@class='h6 mb-3'])[4]")
    public WebElement email;

    @FindBy(xpath = "//input[@name='FullName']")
    public WebElement name;

    @FindBy(xpath = "//input[@name='Email']")
    public WebElement yourEmail;

    @FindBy(xpath = "//input[@name='Subject']")
    public WebElement subject;

    @FindBy(xpath = "//textarea[@name='Enquiry']")
    public WebElement enquriy;

    @FindBy(xpath = "//div[@class='d-flex justify-content-center BtnArea']//button[@class='btn btn-primary col-12 col-md-4']")
    public WebElement submit;

    @FindBy(xpath = "//div[@class='alert alert-success result']")
    public WebElement alertMessage;

    public void verifyAlertMessage(String alertMessage) {
        this.alertMessage.getText();
    }

    @FindBy(xpath = "//a[@class='ml-1']//img[@title='EN']")
    public WebElement englishButton;

    @FindBy(xpath = "//a[@class='ml-1']//img[@title='DE']")
    public WebElement deutschButton;

    @FindBy(xpath = "//a[@href='/restorative-produkte']")
    public WebElement restorativeProdukte;

    @FindBy(xpath = "//a[@href='/catalog']")
    public WebElement catalog;

    @FindBy(xpath = "//img[@class='d-block w-100']")
    public WebElement composite;

    @FindBy (id = "newsletter-result-block")
    public WebElement newsletterResult;

    @FindBy (id = "newsletter-email")
    public WebElement newsletterEmailBox;

    @FindBy (xpath = " //input[@type=\"button\"]")
    public WebElement subscribeButton;

    @FindBy (xpath = "(//input[@type='text'])[1]")
    public WebElement searchbar;

    @FindBy (xpath = "//a[@class='ui-menu-item-wrapper']")
    public WebElement searchResult;

    @FindBy (xpath = "//*[@class='nav-link dropdown-toggle']")
    public WebElement restorativeProdukteButton;


    public HomePage() {
        this.driver = Driver.getDriver();
        PageFactory.initElements(driver, this);
    }

    public String getPageTitle() {
        return driver.getTitle();
    }
    public WebElement getInformationCategory(int informationCategoryNumber){
        return driver.findElement(By.xpath("(//*[@class=\"widget-list\"])[1]/li[" + informationCategoryNumber + "]"));
    }

    public WebElement getInformationFooterPages(String informationCategoryPageTitle){
        return driver.findElement(By.xpath("(//h1[text()='"+informationCategoryPageTitle+"'])"));
    }

    public WebElement getHilfeUndServiceCategory(int hilfeUndServiceCategoryNumber){
        return driver.findElement(By.xpath("(//*[@class=\"widget-list\"])[2]/li[" + hilfeUndServiceCategoryNumber + "]"));
    }

    public WebElement getHilfeUndServiceFooterPages(String hilfeUndServiceCategoryPageTitle){
        return driver.findElement(By.xpath("(//h1[text()='"+hilfeUndServiceCategoryPageTitle+"'])"));
    }

    public WebElement getMyAccountCategory(int myAccountCategoryNumber){
        return driver.findElement(By.xpath("(//*[@class=\"widget-list\"])[3]/li[" + myAccountCategoryNumber + "]"));
    }

    public WebElement getMyAccountFooterPages(String myAccountCategoryPageTitle){
        return driver.findElement(By.xpath("(//h1[text()='"+myAccountCategoryPageTitle+"'])"));
    }
    public WebElement getRestorativeCategory(int restorativeCategoryNumber){
        return driver.findElement(By.xpath("(//*[@class=\"dropdown-menu\"]/li)[" + restorativeCategoryNumber + "]"));
    }

    public WebElement getRestorativeProduktePages(String restorativeProduktePageTitle){
        return driver.findElement(By.xpath("(//h1[text()='"+restorativeProduktePageTitle+"'])"));

    }
    public WebElement getnavbarCategories(int navbarCategoriesNumber){
        return driver.findElement(By.xpath("(//*[@class=\"navbar-nav\"]/li)[" + navbarCategoriesNumber + "]"));
    }
    public WebElement getnavbarPagesTitel(String navbarPagesTitel){
        return driver.findElement(By.xpath("(//h1[text()='"+navbarPagesTitel+"'])"));

    }

    @FindBy(xpath = "(//button[@class='btn btn-danger btn-shadow btn-block btn-sm'])[1]")
    public WebElement ersteProduktComposite;

    @FindBy(xpath = "//a[@class='navbar-tool-icon-box bg-secondary dropdown-toggle']")
    public WebElement warenKorb;

    @FindBy(xpath = "//i[@class='czi-card mr-2 font-size-base align-middle']")
    public WebElement kasse;

    @FindBy(xpath = "//select[@name='billing_address_id']")
    public WebElement rechnungSameAdresse;

    @FindBy(xpath = "//button[@onclick='ConfirmOrder.save()']")
    public WebElement versandWeiter;

    @FindBy(css = "[onclick=\"Billing.save()\"]")
    public WebElement zahlungsinformationWeiter;

    @FindBy(css = "button.btn.btn-primary[onclick=\"PaymentInfo.save()\"]")
    public WebElement zahlungsinfoZuBestatigenWeiter;


    @FindBy(xpath = "//button[@onclick='ConfirmOrder.save()']")
    public WebElement auftragBestatigenWeiter;

    @FindBy(xpath = "//select[@name='billing_address_id']")
    public WebElement versandContinue;

    @FindBy(xpath = "//select[@id='billing-address-select']/option")
    public WebElement neuAdresseWahlenButton;

    @FindBy(xpath = "//select[@id='billing-address-select' and contains(@class, 'address-select')]")
    public WebElement neuAnschriftErstellen;

    @FindBy(xpath = "//select[@id='billing-address-select']/option[@value='140']")
    public WebElement neuAdresseOptionWahlen;

    @FindBy(xpath = "//input[@id='ShipToSameAddress']")
    public WebElement versendeAnDieSelbeAdresseLoschen;

    @FindBy(xpath = "(//button[@class='btn btn-primary'])[4]")
    public WebElement lieferanschriftWeiter;

    @FindBy(xpath = "//button[@onclick='ShippingMethod.save()']")
    public WebElement versandartWeiter;

    @FindBy(xpath = "//button[@title='Weiter']")
    public WebElement rechnungAdresseWeiter;
    @FindBy(xpath = "")//div[@class='title']/strong
    public WebElement erfolgreichUbermittel;

    @FindBy(xpath = "//button[@id='checkout']")
    public WebElement kasse2;

}