package com.greenKart.stepDefs;

import com.github.javafaker.Faker;
import com.greenKart.pages.ProductPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class SearchFunction {

    com.greenKart.pages.ProductPage ProductPage = new ProductPage();
    Faker faker = new Faker();



    @When("User clicks on search box")
    public void userClicksOnSearchBox() {

        ProductPage.searchBox.click();
    }

    @When("User enters random characters in the search box.")
    public void userEntersRandomCharactersInTheSearchBox() {
        ProductPage.searchBoxBefore= ProductPage.searchBox.getText();

        ProductPage.searchBox.sendKeys(faker.letterify("??"));

    }

    @Then("User will be able to type in the search box.")
    public void userWillBeAbleToTypeInTheSearchBox() {

        ProductPage.searchBoxAfter= ProductPage.searchBox.getText();

        Assert.assertNotSame(ProductPage.searchBoxBefore, ProductPage.searchBoxAfter);

        System.out.println("ProductPage.searchBoxBefore = " + ProductPage.searchBoxBefore);



    }

    @When("User enters a random product name")
    public void userEntersARandomProductName() {

        ProductPage.getRandomProduct();
    }
}
