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
  "name": "User should be able to copy typed text from the search box.",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@wip"
    }
  ]
});
formatter.step({
  "name": "User enters random characters in the search box.",
  "keyword": "When "
});
formatter.match({
  "location": "com.greenKart.stepDefs.searchFunctionStepDef.userEntersRandomCharactersInTheSearchBox()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User copies the text from the search box.",
  "keyword": "And "
});
formatter.match({
  "location": "com.greenKart.stepDefs.searchFunctionStepDef.userCopiesTheTextFromTheSearchBox()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User will be able to copy typed text from and paste it to the search box.",
  "keyword": "Then "
});
formatter.match({
  "location": "com.greenKart.stepDefs.searchFunctionStepDef.userWillBeAbleToCopyTypedTextFromAndPasteItToTheSearchBox()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});