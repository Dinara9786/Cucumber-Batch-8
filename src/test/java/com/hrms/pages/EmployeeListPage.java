package com.hrms.pages;

import com.hrms.utils.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EmployeeListPage extends CommonMethods {

    @FindBy(id = "empsearch_id")
    public WebElement idEmployee;

    @FindBy(id = "searchBtn")
    public WebElement searchBtn;

    @FindBy(xpath = "//table[@id = 'resultTable']/tbody/tr")
    public WebElement specificEmployee;

    public EmployeeListPage() {
        PageFactory.initElements(driver, this);
    }


}
