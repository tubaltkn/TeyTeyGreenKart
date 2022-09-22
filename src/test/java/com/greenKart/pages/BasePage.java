package com.greenKart.pages;

import com.greenKart.utilities.BrowserUtils;
import com.greenKart.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.Random;

public abstract class BasePage<Public> {
    public static String  randomName;

    public static int beforePrice;
    public static int afterPrice;

    Random random= new Random();

    public BasePage(){PageFactory.initElements(Driver.get(),this);
    }

    @FindBy(xpath = "//button[contains(text(),'ADD TO CART')]")
    public List<WebElement> AddToCartButtons;

    @FindBy(xpath="//*[@class='increment']")
    public List<WebElement> incrementButtons;

    @FindBy(xpath = "//div/h4[@class='product-name']")
    public List<WebElement> ActualproductsName;

    @FindBy(xpath = "//*[@value='1']")
    public WebElement quantityBox;









    public void getRandomProduct(){

        int randomButton= random.nextInt(AddToCartButtons.size());
        AddToCartButtons.get(randomButton).click();


    }



    public void getRandomIncrement(){


    }

    public void getRandomProductName(){

        BrowserUtils.waitFor(5);

        List<WebElement> elements = Driver.get().findElements(By.xpath("//div/h4[@class='product-name']"));
        List<String> elementString = BrowserUtils.getElementsText(elements);

        int randomProduct= random.nextInt(elementString.size() );
        randomName=elementString.get(randomProduct);

        BrowserUtils.waitFor(5);
        System.out.println(randomName);


    }

}
