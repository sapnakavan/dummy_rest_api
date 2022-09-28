package org.example.Userinfo;


import io.restassured.response.Response;
import org.example.testbase.TestBase;
import org.junit.Test;

import static io.restassured.RestAssured.given;


public class UserGetTest extends TestBase {

    @Test
    public void getAllUserInfo() {
        Response response=given()
                .when()
                .get("/employees");
        response.then().statusCode(200);
        response.prettyPrint();
    }

    @Test
    public void getSingleuserInfo() {
    Response response=given()
            .when()
            .get("/employee/4");
    response.then().statusCode(200);
    response.prettyPrint();
    }


}
