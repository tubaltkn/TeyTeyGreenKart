package com.greenKart.stepDefs;

import com.greenKart.pages.BasePage;
import com.greenKart.pages.ProductPage;
import com.greenKart.pages.SearchFunctionPage;
import com.greenKart.utilities.BrowserUtils;
import com.greenKart.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;
import java.util.Random;

public class searchFunctionStepDef extends BasePage {

    SearchFunctionPage searchPage=new SearchFunctionPage();

    Actions actions =new Actions(Driver.get());

    static String typedProduct;

    @When("User clicks on search box")
    public void userClicksOnSearchBox() {

        new SearchFunctionPage().searchButton.click();
        BrowserUtils.waitFor(3);

    }

    @When("User enters random characters in the search box.")
    public void userEntersRandomCharactersInTheSearchBox() {


    }

    @And("User copies the text from the search box.")
    public void userCopiesTheTextFromTheSearchBox() {



        actions.keyDown(Keys.CONTROL);
        actions.sendKeys("a");
        actions.keyUp(Keys.CONTROL);
        actions.build().perform();
        BrowserUtils.waitFor(5);

        actions.keyDown(Keys.CONTROL);
        actions.sendKeys("c");
        actions.keyUp(Keys.CONTROL);
        actions.build().perform();
        BrowserUtils.waitFor(5);

        new SearchFunctionPage().searchButton.click();


    }

    @Then("User will be able to copy typed text from and paste it to the search box.")
    public void userWillBeAbleToCopyTypedTextFromAndPasteItToTheSearchBox() {


        actions.keyDown(Keys.CONTROL);
        actions.sendKeys("v");
        actions.keyUp(Keys.CONTROL);
        actions.build().perform();
        BrowserUtils.waitFor(5);
    }

    @Then("User will be able to see the typed letters in the search box.")
    public void userWillBeAbleToSeeTheTypedLettersInTheSearchBox() {
        new SearchFunctionPage().createRandomCharacter();

    }

    @Then("User will be able to type in the search box.")
    public void userWillBeAbleToTypeInTheSearchBox() {

        ProductPage.searchBoxBefore= searchPage.searchButton.getText();
                //
//        ProductPage.searchBox.sendKeys(faker.letterify("??"));
//
//    }
//


    }

    @When("User enters random product name")
    public void userEntersRandomProductName() {

        getRandomProductName();
        searchPage.searchButton.sendKeys(randomName);
        BrowserUtils.waitFor(5);

    }






    @Then("User will be able to find that product.")
    public void userWillBeAbleToFindThatProduct() {

        typedProduct=Driver.get().findElement(By.xpath("//input[@type='search']")).getAttribute("value");

        List<WebElement> elements = Driver.get().findElements(By.xpath("//div/h4[@class='product-name']"));
        List<String> elementString = BrowserUtils.getElementsText(elements);

        System.out.println("typedProduct = " + typedProduct);
        System.out.println("elementString = " + elementString);

        Assert.assertTrue("verify that ", elementString.contains(typedProduct));


    }
//
//    @When("User enters a random characters in the search box.")
//    public void userEntersARandomCharactersInTheSearchBox() {
//
//    }
//
//    @Then("User will be able to type in the search box.")
//    public void userWillBeAbleToTypeInTheSearchBox() {
//    }
}

//--------------------Faker ile search boxa gonderme-----------------------------


//    com.greenKart.pages.ProductPage ProductPage = new ProductPage();
//    Faker faker = new Faker();
//
//
//
//    @When("User clicks on search box")
//    public void userClicksOnSearchBox() {
//
//        ProductPage.searchBox.click();
//    }
//
//
//
//    @Then("User will be able to type in the search box.")
//    public void userWillBeAbleToTypeInTheSearchBox() {
//
//        ProductPage.searchBoxAfter= ProductPage.searchBox.getText();
//
//        Assert.assertNotSame(ProductPage.searchBoxBefore, ProductPage.searchBoxAfter);
//
//        System.out.println("ProductPage.searchBoxBefore = " + ProductPage.searchBoxBefore);
//
//
//
//    }
//
//    @When("User enters a random product name")
//    public void userEntersARandomProductName() {
//
//        ProductPage.getRandomProduct();
//    }
//}
