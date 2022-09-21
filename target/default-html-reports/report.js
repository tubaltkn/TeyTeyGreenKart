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
  "name": "The placeholder at the search box should be \"Search for Vegetables and Fruits\".",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@wip"
    }
  ]
});
formatter.step({
  "name": "Verify that the placeholder at the search box should be \"Search for Vegetables and Fruits\".",
  "keyword": "Then "
});
formatter.match({
  "location": "com.greenKart.stepDefs.searchFunctionStepDef.verifyThatThePlaceholderAtTheSearchBoxShouldBe(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});