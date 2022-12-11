$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("SkyBlueBackground.feature");
formatter.feature({
  "line": 2,
  "name": "SkyBlue Backgroud color change tests",
  "description": "",
  "id": "skyblue-backgroud-color-change-tests",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 5,
  "name": "Sky Blue Background",
  "description": "",
  "id": "skyblue-backgroud-color-change-tests;sky-blue-background",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@test1"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "Set SkyBlue Background button exists",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I click the button",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "the background color will change to sky blue",
  "keyword": "Then "
});
formatter.match({
  "location": "HomePageStepsDefinition.set_SkyBlue_Background_button_exists()"
});
formatter.result({
  "duration": 3293774100,
  "status": "passed"
});
formatter.match({
  "location": "HomePageStepsDefinition.i_click_the_button()"
});
formatter.result({
  "duration": 44026100,
  "status": "passed"
});
formatter.match({
  "location": "HomePageStepsDefinition.the_background_color_will_change_to_sky_blue()"
});
formatter.result({
  "duration": 662771700,
  "status": "passed"
});
formatter.uri("WhiteBackground.feature");
formatter.feature({
  "line": 2,
  "name": "White Background color change test",
  "description": "",
  "id": "white-background-color-change-test",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 5,
  "name": "White Background Change",
  "description": "",
  "id": "white-background-color-change-test;white-background-change",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@test2"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "Set SkyWhite Background button exists",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I click on the button",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "the background color will change to white",
  "keyword": "Then "
});
formatter.match({
  "location": "HomePageStepsDefinition.set_SkyWhite_Background_button_exists()"
});
formatter.result({
  "duration": 1554201000,
  "status": "passed"
});
formatter.match({
  "location": "HomePageStepsDefinition.i_click_on_the_button()"
});
formatter.result({
  "duration": 38780000,
  "status": "passed"
});
formatter.match({
  "location": "HomePageStepsDefinition.the_background_color_will_change_to_white()"
});
formatter.result({
  "duration": 671332000,
  "status": "passed"
});
});