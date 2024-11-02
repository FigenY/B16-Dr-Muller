package com.drMuller.pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

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
}
