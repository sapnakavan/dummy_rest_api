package org.example.Userinfo;



import io.restassured.response.Response;
import org.example.testbase.TestBase;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class UserDeleteTest extends TestBase {

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
