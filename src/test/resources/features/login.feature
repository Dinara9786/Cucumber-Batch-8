
@featureTag  @login # feature level tag
Feature: Login Functionality

  Scenario: Login with valid credentials

#    Given navigate to HRMS login page
    When enter valid credentials
    And click on login button
    Then verify dashboard is displayed
#    And quit the browser

    @smoke @syntax @regression @whatever # adding multiple scenario level tags
  Scenario: Login with invalid credentials

#    Given navigate to HRMS login page
    When enter invalid credentials
    And click on login button
    Then verify error message is displayed
#    And quit the browser

  Scenario: Leave Username empty

#    Given navigate to HRMS login page
    When leave username empty and put valid password
    And click on login button
    Then verify error message "Username cannot be empty"
#    And quit the browser

  Scenario: Leave password empty

#    Given navigate to HRMS login page
    When leave password empty and put valid username
    And click on login button
    Then validate error message "Password cannot be empty"
#    And quit the browser