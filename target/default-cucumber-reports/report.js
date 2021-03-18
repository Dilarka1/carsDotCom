$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/Honda.feature");
formatter.feature({
  "name": "Testing Car.com",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@unit_test"
    }
  ]
});
formatter.scenario({
  "name": "Testing Used Honda",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@unit_test"
    },
    {
      "name": "@hondaUsed"
    }
  ]
});
formatter.step({
  "name": "user is in landing page",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "select \"Used Cars\"",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "select Make \"Honda\"",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "select model \"Pilot\"",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "select price \"$50,000\"",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "select distance \"100 Miles from\"",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "enter zipcode \"60008\"",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "click Search button",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});