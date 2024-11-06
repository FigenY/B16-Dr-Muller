package com.drMuller.pages;

import com.drMuller.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LinersPage extends BasePage{

    public WebElement getProductContainer (String index) {
        return Driver.getDriver().findElement(By.xpath("(//button[@class='btn btn-danger btn-shadow btn-block btn-sm'])[" + index + "]"));
    }


}
