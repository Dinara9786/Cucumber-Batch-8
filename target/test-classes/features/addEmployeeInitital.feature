
Feature: Add Employee Functionality

  @regression
Scenario: Add Employee without login details

When login HRMS page
Then navigate to Add Employee Page
When add employee without login details
Then validate that employee is added

    @regression
  Scenario: Add Employee with login details

    When login HRMS page
    Then navigate to Add Employee Page
    When add employee with login details
    Then validate that employee with login details is added


