package org.example.Userinfo;



import io.restassured.response.Response;
import org.example.model.UserPojo;
import org.example.testbase.TestBase;
import org.junit.Test;

import static io.restassured.RestAssured.given;


public class UserPostTest extends TestBase {

    @Test
    public void createUser() {

        UserPojo userPojo = new UserPojo();
       userPojo.setEmoloyee_name("Test");
       userPojo.setEmployee_salary(154600);
       userPojo.setEmployee_age(22);


        Response response=given()
                .header("Content-Type","application/json")
                .body(userPojo)
                .when()
                .post("/create");
        response.then();
        response.prettyPrint();
    }
}
