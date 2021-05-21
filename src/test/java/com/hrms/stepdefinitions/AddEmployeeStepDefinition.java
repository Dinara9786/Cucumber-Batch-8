package com.hrms.stepdefinitions;

import com.hrms.utils.CommonMethods;
import com.hrms.utils.Constants;
import com.hrms.utils.ExcelReading;
import com.hrms.utils.GlobalVariables;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Map;

public class AddEmployeeStepDefinition extends CommonMethods {

    @When("click on PIM")
    public void click_on_PIM() {
        dashboardPage.clickOnPIM();
    }

    @When("click on add employee button")
    public void click_on_add_employee_button() {

        dashboardPage.clickOnEmployeeBtn();

    }

    @Then("enter first and last name")
    public void enter_first_and_last_name() {
        addEmployeePage.enterFirstAndLastName("Thor", "Potter");

    }

    @Then("click on save button")
    public void click_on_save_button() {
        addEmployeePage.clickOnSaveButton();

    }

    @Then("verify employee is added successfully")
    public void verify_employee_is_added_successfully() {
        String actualProfileName = personalDetailsPage.getUserProfileName();
        Assert.assertEquals("Verifying profile name", "Thor Potter", actualProfileName);

    }

    @Then("enter first name {string}, middle name {string} and last name {string}")
    public void enter_first_name_middle_name_and_last_name(String firstName, String middleName, String lastName) {
        addEmployeePage.enterFirstMiddleAndLastName(firstName, middleName, lastName);
        GlobalVariables.employeeData = firstName + " " + middleName + " " + lastName;
    }

    @Then("verify that {string} is added successfully")
    public void verify_that_is_added_successfully(String fullName) {
        String actualFullName = personalDetailsPage.getUserProfileName();
        Assert.assertEquals("Verifying full name with middle name", actualFullName, fullName);

    }

    @When("enter {string}, {string}, {string}")
    public void enter(String firstName, String middleName, String lastName) {
        addEmployeePage.enterFirstMiddleAndLastName(firstName, middleName, lastName);
    }

    @Then("verify {string}, {string}, {string} is added successfully")
    public void verify_is_added_successfully(String firstName, String middleName, String lastName) {
        String fullName = firstName + " " + middleName + " " + lastName;
        String actualFullName = personalDetailsPage.getUserProfileName();
        Assert.assertEquals("Verifying full name with middle name", fullName, actualFullName);
    }

    @When("add multiple employees and verify they are added successfully")
    public void add_multiple_employees_and_verify_they_are_added_successfully(DataTable employees) throws InterruptedException {
        List<Map<String, String>> employeeNames = employees.asMaps(); // we need multiple MAPs, we have multiple keys
        // and multiple values
        for (Map<String, String> employeeName : employeeNames) {
            String firstName = employeeName.get("FirstName");
            String middleName = employeeName.get("MiddleName");
            String lastName = employeeName.get("LastName");
            String employeeId = employeeName.get("EmployeeId");

            addEmployeePage.enterFirstMiddleAndLastName(firstName, middleName, lastName);
            addEmployeePage.enterEmployeeId(employeeId);
            addEmployeePage.clickOnSaveButton();
            String actualFullName = personalDetailsPage.getUserProfileName();
            String expectedFullName = firstName + " " + middleName + " " + lastName;
            Assert.assertEquals("Verifying profile name", expectedFullName, actualFullName);

            dashboardPage.clickOnEmployeeBtn();
            Thread.sleep(2000);
        }
    }

    @When("add multiple employees from excel {string} sheet and verify they are added")
    public void add_multiple_employees_from_excel_sheet_and_verify_they_are_added(String sheetName) throws InterruptedException {
        List<Map<String, String>> excelData = ExcelReading.excelIntoListMap(Constants.TESTDATA_FILEPATH, sheetName);

        for (Map<String, String> excelEmpName : excelData) {
            String firstName = excelEmpName.get("FirstName");
            String middleName = excelEmpName.get("MiddleName");
            String lastName = excelEmpName.get("LastName");
            String employeeId = excelEmpName.get("Employee ID");

            addEmployeePage.enterFirstMiddleAndLastName(firstName, middleName, lastName);
            addEmployeePage.enterEmployeeId(employeeId);

            dashboardPage.clickOnEmployeeBtn();
            Thread.sleep(2000);

        }
    }
    @When("capture employeeId")
    public void capture_employeeId() {
        GlobalVariables.emp_Id = addEmployeePage.empIDTextbox.getAttribute("value");
    }

    @Then("verify data from db and ui is matched")
    public void verify_data_from_db_and_ui_is_matched() {
        System.out.println(GlobalVariables.dbList);
        System.out.println(GlobalVariables.employeeData);

        // add validatioan step using assertion
    }
}

