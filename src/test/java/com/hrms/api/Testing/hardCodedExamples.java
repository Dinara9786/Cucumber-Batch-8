package com.hrms.api.Testing;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.equalTo;
import static io.restassured.RestAssured.*;

// given ()
// when ()
// then()


public class hardCodedExamples {
    String baseURI = RestAssured.baseURI = "http://3.237.189.167/syntaxapi/api";

    String token = "Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpYXQiOjE2MTQxMjY0ODksImlzcyI6ImxvY2FsaG9zdCIs" +
            "ImV4cCI6MTYxNDE2OTY4OSwidXNlcklkIjoiMjQ0NyJ9.OzL0OckUg_844XhrxOTNYu1PQYL8TnbZ2HWnEIs27pg";

    @Test
    public void sampleTest() {


        RequestSpecification preparingGetOneEmployeeRequest = given().header("Authorization", token)
                .header("Content-Type", "Application/json")
                .queryParam("employee_id", "13012");

        //sending the request to the endpoint

        Response getOneEmployeeResponse = preparingGetOneEmployeeRequest.when().get("/getOneEmployee.php");
        //System.out.println(getOneEmployeeResponse.asString());

        getOneEmployeeResponse.prettyPrint();

        //assert that status code is 200
        getOneEmployeeResponse.then().assertThat().statusCode(200);
    }

    @Test
    public void aPostCreateEmployee() {

        //Preparing Create an Employee Request
        RequestSpecification createEmployeeRequest = given().header("Authorization", token)
                .header("Content-Type", "Application/json").body("{\n" +
                        "  \"emp_firstname\": \"Mariii\",\n" +
                        "  \"emp_lastname\": \"Romaniuk\",\n" +
                        "  \"emp_middle_name\": null,\n" +
                        "  \"emp_gender\": \"F\",\n" +
                        "  \"emp_birthday\": \"2021-02-11\",\n" +
                        "  \"emp_status\": \"employee\",\n" +
                        "  \"emp_job_title\": \"IT Analyst\"\n" +
                        "}");

        //Making a Post call to Create Employee
        Response createEmployeeResponse = createEmployeeRequest.when().post("/createEmployee.php");

        //Printing the EMployee ID
        createEmployeeResponse.prettyPrint();

        //Assert that status code is 201
        createEmployeeResponse.then().assertThat().statusCode(201);

        // Get Employee_id
        String employeeID = createEmployeeResponse.jsonPath().getString("Employee[0].employee_id");

        //Print EmployeeID
        System.out.println(employeeID);

        //Assesrt that message contains Entry Created
        createEmployeeResponse.then().assertThat().body("Message", equalTo("Entry created"));

        //Assert that Employee id is 15851A
        createEmployeeResponse.then().assertThat().body("Employee[0].emp_firstname", equalTo("Mariii"));

    }
}
