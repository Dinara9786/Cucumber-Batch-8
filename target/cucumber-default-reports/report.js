$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/login.feature");
formatter.feature({
  "name": "Login Functionality",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@featureTag"
    },
    {
      "name": "@login"
    },
    {
      "name": "#"
    },
    {
      "name": "feature"
    },
    {
      "name": "level"
    },
    {
      "name": "tag"
    }
  ]
});
formatter.scenario({
  "name": "Login with valid credentials",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@featureTag"
    },
    {
      "name": "@login"
    },
    {
      "name": "#"
    },
    {
      "name": "feature"
    },
    {
      "name": "level"
    },
    {
      "name": "tag"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "enter valid credentials",
  "keyword": "When "
});
formatter.match({
  "location": "com.hrms.stepdefinitions.LoginStepDefinition.enter_valid_credentials()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on login button",
  "keyword": "And "
});
formatter.match({
  "location": "com.hrms.stepdefinitions.LoginStepDefinition.click_on_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify dashboard is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "com.hrms.stepdefinitions.LoginStepDefinition.verify_dashboard_is_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded0.png", "Login with valid credentials");
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Login with invalid credentials",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@featureTag"
    },
    {
      "name": "@login"
    },
    {
      "name": "#"
    },
    {
      "name": "feature"
    },
    {
      "name": "level"
    },
    {
      "name": "tag"
    },
    {
      "name": "@smoke"
    },
    {
      "name": "@syntax"
    },
    {
      "name": "@regression"
    },
    {
      "name": "@whatever"
    },
    {
      "name": "#"
    },
    {
      "name": "adding"
    },
    {
      "name": "multiple"
    },
    {
      "name": "scenario"
    },
    {
      "name": "level"
    },
    {
      "name": "tags"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "enter invalid credentials",
  "keyword": "When "
});
formatter.match({
  "location": "com.hrms.stepdefinitions.LoginStepDefinition.enter_invalid_credentials()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on login button",
  "keyword": "And "
});
formatter.match({
  "location": "com.hrms.stepdefinitions.LoginStepDefinition.click_on_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify error message is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "com.hrms.stepdefinitions.LoginStepDefinition.verify_error_message_is_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded1.png", "Login with invalid credentials");
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Leave Username empty",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@featureTag"
    },
    {
      "name": "@login"
    },
    {
      "name": "#"
    },
    {
      "name": "feature"
    },
    {
      "name": "level"
    },
    {
      "name": "tag"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "leave username empty and put valid password",
  "keyword": "When "
});
formatter.match({
  "location": "com.hrms.stepdefinitions.LoginStepDefinition.leave_username_empty_and_put_valid_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on login button",
  "keyword": "And "
});
formatter.match({
  "location": "com.hrms.stepdefinitions.LoginStepDefinition.click_on_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify error message \"Username cannot be empty\"",
  "keyword": "Then "
});
formatter.match({
  "location": "com.hrms.stepdefinitions.LoginStepDefinition.verify_error_message(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded2.png", "Leave Username empty");
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Leave password empty",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@featureTag"
    },
    {
      "name": "@login"
    },
    {
      "name": "#"
    },
    {
      "name": "feature"
    },
    {
      "name": "level"
    },
    {
      "name": "tag"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "leave password empty and put valid username",
  "keyword": "When "
});
formatter.match({
  "location": "com.hrms.stepdefinitions.LoginStepDefinition.leave_password_empty_and_put_valid_username()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on login button",
  "keyword": "And "
});
formatter.match({
  "location": "com.hrms.stepdefinitions.LoginStepDefinition.click_on_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "validate error message \"Password cannot be empty\"",
  "keyword": "Then "
});
formatter.match({
  "location": "com.hrms.stepdefinitions.LoginStepDefinition.validate_error_message(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded3.png", "Leave password empty");
formatter.after({
  "status": "passed"
});
});