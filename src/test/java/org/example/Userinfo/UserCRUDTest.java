package org.example.Userinfo;


import io.restassured.response.Response;
import org.example.model.UserPojo;
import org.example.testbase.TestBase;
import org.junit.Test;

import static io.restassured.RestAssured.given;


public class UserCRUDTest extends TestBase {
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
    @Test
    public void delete(){
        Response response=given()
                .when()
                .delete("/delete/990");
        response.then();
        response.prettyPrint();
    }
    @Test
    public void getbackuserInfo() {
        Response response=given()
                .when()
                .get("/employee/990");
        response.then();
        response.prettyPrint();
    }
}
