$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Feature/searchFunction.feature");
formatter.feature({
  "name": "search box testing",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "User navigates to the link",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user navigates to the link",
  "keyword": "Given "
});
formatter.match({
  "location": "com.greenKart.stepDefs.addToCart.userNavigatesToTheLink()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on search box",
  "keyword": "When "
});
formatter.match({
  "location": "com.greenKart.stepDefs.searchFunctionStepDef.userClicksOnSearchBox()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "User should be able to see the auto-suggestion after typing letters in the search box.",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@wip"
    }
  ]
});
formatter.step({
  "name": "user types \"c\" in the search box",
  "keyword": "Given "
});
formatter.match({
  "location": "com.greenKart.stepDefs.searchFunctionStepDef.userTypesInTheSearchBox(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user gets all the list of products",
  "keyword": "When "
});
formatter.match({
  "location": "com.greenKart.stepDefs.searchFunctionStepDef.userGetsAllTheListOfProducts()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user will see the product results containing letter",
  "keyword": "Then "
});
formatter.match({
  "location": "com.greenKart.stepDefs.searchFunctionStepDef.userWillSeeTheProductResultsContainingLetter()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});