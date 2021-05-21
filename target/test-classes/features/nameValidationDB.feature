Feature: Name validations against DB

  @dbValidation
  Scenario: First name validation against DB - searching by Employee ID

    When enter valid credentials
    And click on login button
    Then verify dashboard is displayed
    When navigate to employee list
    And enter a valid Employee id "15024"
    Then click on search Button
    And verify the table is displayed
    When get first name from the table
    Then get first name from the db
    And validate first name from ui against db

