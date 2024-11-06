package com.drMuller.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage extends BasePage{

    @FindBy (xpath = "//div[@class='input-group-append-overlay']")
    public WebElement searchIcon;
    @FindBy (xpath = "//div[@class='text-center p-3 mt-5' and contains(text(), 'No products were found that matched your criteria.')]")
    public WebElement noProductsFound;
}
