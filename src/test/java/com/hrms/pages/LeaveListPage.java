package com.hrms.pages;

import com.hrms.utils.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeaveListPage extends CommonMethods {

    @FindBy (id = "leaveLilst_cmbSubunit")
    WebElement leaveList subUnitDD;

    public LeaveListPage(){


            PageFactory.initElements(driver, this);


}
