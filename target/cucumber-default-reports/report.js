$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/addEmployee.feature");
formatter.feature({
  "name": "Add Employee Functionality Duplicate",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
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
formatter.step({
  "name": "click on PIM",
  "keyword": "When "
});
formatter.match({
  "location": "com.hrms.stepdefinitions.AddEmployeeStepDefinition.click_on_PIM()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on add employee button",
  "keyword": "And "
});
formatter.match({
  "location": "com.hrms.stepdefinitions.AddEmployeeStepDefinition.click_on_add_employee_button()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Adding Employee and database validation",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@db"
    },
    {
      "name": "@regression"
    }
  ]
});
formatter.step({
  "name": "enter first name \"Madonna\", middle name \"John\" and last name \"Jack\"",
  "keyword": "When "
});
formatter.match({
  "location": "com.hrms.stepdefinitions.AddEmployeeStepDefinition.enter_first_name_middle_name_and_last_name(java.lang.String,java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "capture employeeId",
  "keyword": "And "
});
formatter.match({
  "location": "com.hrms.stepdefinitions.AddEmployeeStepDefinition.capture_employeeId()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on save button",
  "keyword": "And "
});
formatter.match({
  "location": "com.hrms.stepdefinitions.AddEmployeeStepDefinition.click_on_save_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "collect employee data from hrms database",
  "keyword": "Then "
});
formatter.match({
  "location": "com.hrms.stepdefinitions.DBStepDefinitions.collect_employee_data_from_hrms_database()"
});
formatter.result({
  "error_message": "java.lang.NullPointerException\r\n\tat com.hrms.utils.DbUtils.getResultSet(DbUtils.java:32)\r\n\tat com.hrms.utils.DbUtils.getDbDataIntoList(DbUtils.java:46)\r\n\tat com.hrms.stepdefinitions.DBStepDefinitions.collect_employee_data_from_hrms_database(DBStepDefinitions.java:17)\r\n\tat ✽.collect employee data from hrms database(file:///C:/Users/drysa/IdeaProjects/CucumberFrameworkBatch8/src/test/resources/features/addEmployee.feature:62)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "verify data from db and ui is matched",
  "keyword": "And "
});
formatter.match({
  "location": "com.hrms.stepdefinitions.AddEmployeeStepDefinition.verify_data_from_db_and_ui_is_matched()"
});
formatter.result({
  "status": "skipped"
});
formatter.embedding("image/png", "embedded0.png", "Adding Employee and database validation");
formatter.after({
  "status": "passed"
});
});