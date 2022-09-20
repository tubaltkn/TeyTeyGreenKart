package com.greenKart.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchFunctionPage extends BasePage{

    @FindBy(xpath = "//input[@type='search']")
    public WebElement searchButton;

}
