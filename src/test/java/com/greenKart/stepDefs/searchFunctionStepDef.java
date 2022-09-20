package com.greenKart.stepDefs;

import com.greenKart.pages.BasePage;
import com.greenKart.pages.SearchFunctionPage;
import com.greenKart.utilities.BrowserUtils;
import com.greenKart.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import java.util.Random;

public class searchFunctionStepDef extends BasePage {

    Random random= new Random();

    int leftLimit = 97; // letter 'a'
    int rightLimit = 122; // letter 'z'
    int targetStringLength = 3;





    @When("User clicks on search box")
    public void userClicksOnSearchBox() {

        new SearchFunctionPage().searchButton.click();
        BrowserUtils.waitFor(3);

    }

    @When("User enters random characters in the search box.")
    public void userEntersRandomCharactersInTheSearchBox() {

        String writeRandomChar = random.ints(leftLimit,rightLimit).limit(targetStringLength)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();
        new SearchFunctionPage().searchButton.sendKeys(writeRandomChar);
        BrowserUtils.waitFor(5);
        
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

        actions.keyDown(Keys.CONTROL);
        actions.sendKeys("v");
        actions.keyUp(Keys.CONTROL);
        actions.build().perform();
        BrowserUtils.waitFor(5);


       // BrowserUtils.waitFor(7);




    }

    @Then("User will be able to copy typed text from and paste it to the search box.")
    public void userWillBeAbleToCopyTypedTextFromAndPasteItToTheSearchBox() {
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
