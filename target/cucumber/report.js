$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Login.feature");
formatter.feature({
  "line": 1,
  "name": "Application Login",
  "description": "",
  "id": "application-login",
  "keyword": "Feature"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "User is on net banking landing page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User login into application with username and password",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefination.user_is_on_net_banking_landing_page()"
});
formatter.result({
  "duration": 9512822638,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "username",
      "offset": 33
    },
    {
      "val": "password",
      "offset": 46
    }
  ],
  "location": "StepDefination.user_login_into_application_with_and(String,String)"
});
formatter.result({
  "duration": 462009847,
  "status": "passed"
});
formatter.scenario({
  "line": 53,
  "name": "Home Page default login",
  "description": "",
  "id": "application-login;home-page-default-login",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 52,
      "name": "@SanityTest"
    }
  ]
});
formatter.step({
  "line": 54,
  "name": "Home page is displayed",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefination.home_page_is_displayed()"
});
formatter.result({
  "duration": 132553710,
  "status": "passed"
});
});