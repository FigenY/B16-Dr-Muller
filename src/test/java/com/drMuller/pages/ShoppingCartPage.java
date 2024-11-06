package com.drMuller.pages;

import com.drMuller.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ShoppingCartPage extends BasePage{

    public WebElement getQuantityBox (String index){
        return Driver.getDriver().findElement(By.xpath("(//*[contains(@id, 'itemquantityDrp')])[" + index + "]"));
    }

    public String getSelectQuantity (String quantity){
        Driver.getDriver().findElement(By.xpath(String.format("//option[@value='%s']", quantity))).click();
        return quantity;
    }
}
