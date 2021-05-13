package com.hrms.stepdefinitions;

import com.hrms.utils.CommonMethods;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.util.List;

public class DashboardStepDefinition extends CommonMethods {
    @Then("verify the following tabs on dashboard")
    public void verify_the_following_tabs_on_dashboard(DataTable dashboardTabs) {
        List<String> expecteddashTabs = dashboardTabs.asList();// this will convert all strings into List of Strings
        List<String> actualdashTabs = dashboardPage.getDashTabs();

        System.out.println(expecteddashTabs);
        System.out.println(actualdashTabs);

        Assert.assertEquals("Verifying the following tabs on dashboard", actualdashTabs, expecteddashTabs);


    }

}
