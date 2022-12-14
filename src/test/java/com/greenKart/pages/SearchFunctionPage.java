package com.greenKart.pages;

import com.greenKart.utilities.BrowserUtils;
import com.greenKart.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.util.Random;

public class SearchFunctionPage extends BasePage{

    @FindBy(xpath = "//input[@type='search']")
    public WebElement searchButton;

    Random random= new Random();

    int leftLimit = 97; // letter 'a'
    int rightLimit = 122; // letter 'z'
    int targetStringLength = 3;

    public void createRandomCharacter(){

        String writeRandomChar = random.ints(leftLimit,rightLimit).limit(targetStringLength)
            .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
            .toString();
        new SearchFunctionPage().searchButton.sendKeys(writeRandomChar);
        BrowserUtils.waitFor(5);

        String typedText = Driver.get().findElement(By.xpath("//input[@type='search']")).getAttribute("value");
        System.out.println("Expected Text: " + writeRandomChar);
        System.out.println("Actual Text:" + typedText);
        Assert.assertEquals(writeRandomChar,typedText);
}




}


