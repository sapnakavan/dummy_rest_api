package org.example.Userinfo;



import io.restassured.response.Response;
import org.example.model.UserPojo;
import org.example.testbase.TestBase;
import org.junit.Test;

import static io.restassured.RestAssured.given;


public class UserPatchTest extends TestBase {

    @Test
    public void updateuserWithPatch(){

        UserPojo userPojo = new UserPojo();
        userPojo.setEmoloyee_name("Testter");
        userPojo.setEmployee_salary(55000);
        userPojo.setEmployee_age(25);


        Response response=given()
                .header("Content-Type","application/json")
                .body(userPojo)
                .when()
                .patch("/update/990");
        response.then();
        response.prettyPrint();
    }
}
