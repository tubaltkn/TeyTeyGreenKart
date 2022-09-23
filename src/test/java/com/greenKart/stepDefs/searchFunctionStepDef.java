package com.greenKart.stepDefs;

import com.greenKart.pages.BasePage;
import com.greenKart.pages.SearchFunctionPage;
import com.greenKart.utilities.BrowserUtils;
import com.greenKart.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import java.util.Random;

public class searchFunctionStepDef extends BasePage {

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

        Actions actions =new Actions(Driver.get());

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
        Actions actions =new Actions(Driver.get());

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

    @Then("Verify that the placeholder at the search box should be {string}.")
    public void verifyThatThePlaceholderAtTheSearchBoxShouldBe(String arg0) {
      new SearchFunctionPage().getPlaceHolderText();
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
//    @When("User enters random characters in the search box.")
//    public void userEntersRandomCharactersInTheSearchBox() {
//        ProductPage.searchBoxBefore= ProductPage.searchBox.getText();
//
//        ProductPage.searchBox.sendKeys(faker.letterify("??"));
//
//    }
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
