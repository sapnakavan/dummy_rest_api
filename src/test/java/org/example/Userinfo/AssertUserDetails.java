package org.example.Userinfo;

import io.restassured.RestAssured;
import io.restassured.response.ValidatableResponse;
import org.junit.BeforeClass;
import org.junit.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.Matchers.hasKey;

public class AssertUserDetails {
    static ValidatableResponse response;

    @BeforeClass
    public static void inIt() {
        RestAssured.baseURI = "https://dummy.restapiexample.com/api/v1/";
        response = given()
                .when()
                .get("/employees")
                .then().statusCode(200);
    }

    //1. total records are 24
    //2. data[23].id = 24
    //3. data[23].employee_name = “Doris Wilder”
    //4. message = “Successfully! All records has been fetched.”
    //5.status = success
    //6. id = 3 has employee_salary = 86000
    //7. id = 6 has employee_age = 61
    //8. id = 11 has employee_name = Jena Gaines
    }
