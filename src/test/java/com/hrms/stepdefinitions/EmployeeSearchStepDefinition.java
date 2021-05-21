package com.hrms.stepdefinitions;

import com.hrms.pages.EmployeeListPage;
import com.hrms.pages.PersonalDetailsPage;
import com.hrms.utils.CommonMethods;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class EmployeeSearchStepDefinition extends CommonMethods {

    @When("navigate to employee list")
    public void navigate_to_employee_list() {
        click(dashboardPage.PIMButton);
        click(dashboardPage.employeeList);
    }

    @When("enter a valid Employee id {string}")
    public void enter_a_valid_Employee_id(String employeeID) {
        sendText(EmployeeListPage.addEmployeePage.empIDTextbox, employeeID);

    }

    @Then("click on search Button")
    public void click_on_search_Button() {
        click(EmployeeListPage.employeeListPage.searchBtn);
    }

    @Then("verify the table is displayed")
    public void verify_the_table_is_displayed() {
        Assert.assertTrue(employeeListPage.isTableDisplayed());

    }

    @When("get first name from the table")
    public void get_first_name_from_the_table() {
        System.out.println(employeeListPage.getFirstNameFromTable());
    }

//    @Then("validate first name from ui against db")
//    public void validate_first_name_from_ui_against_db() {
//    Assert.assertEquals(DBStepDefinitions.dbData, employeeListPage.getFirstNameFromTable());

    }

//}
