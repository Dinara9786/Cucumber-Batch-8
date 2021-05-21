package com.hrms.pages;

import com.hrms.utils.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class EmployeeListPage extends CommonMethods {

    @FindBy(id = "empsearch_id")
    public WebElement idEmployee;

    @FindBy(id = "searchBtn")
    public WebElement searchBtn;

    @FindBy(xpath = "//table[@id = 'resultTable']/tbody/tr")
    public WebElement specificEmployee;

    @FindBy (xpath = "//table[@id = 'resultTable']/tbody/tr/td[3]")
    public List <WebElement> firstNameTableResult;

    public boolean isTableDisplayed(){
        return specificEmployee.isDisplayed();
    }

    public List<Map<String, String>> getFirstNameFromTable(){
        List<Map<String, String>> uiFirstName = new ArrayList<>();
        for (WebElement firstNameRow: firstNameTableResult) {
            Map <String, String> mapData = new LinkedHashMap<>();
            String tableName = firstNameRow.getText();
            mapData.put("emp_firstname", tableName);
            uiFirstName.add(mapData);
        }
        return uiFirstName;
    }

    public EmployeeListPage() {
        PageFactory.initElements(driver, this);
    }

}
