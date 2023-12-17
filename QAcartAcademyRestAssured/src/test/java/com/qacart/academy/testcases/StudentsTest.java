package com.qacart.academy.testcases;

import com.qacart.academy.pojo.LoginPojo;
import io.restassured.http.ContentType;
import org.testng.annotations.Test;

import java.io.File;
import java.util.HashMap;

import static io.restassured.RestAssured.given;

public class StudentsTest {

    @Test
    public void shouldBeAbleToLoginToTheApplication(){
        //Using URL Encoded
        /*HashMap<String, String> formParam = new HashMap<>();
        formParam.put("Foo", "1234");*/

        //Uploading a file as a body
        //File json = new File("src/test/resources/login.json");

        //Send body as POJO class using constructor
        LoginPojo body = new LoginPojo("ddd@ddd.com","123456789");

        given()
                .baseUri("https://todo.qacart.com/")
                .header("Content-Type", "application/json")
                .contentType(ContentType.JSON)
                .body(body)
                //URL Encoded
                //.contentType(ContentType.URLENC)
                //.formParams(formParam)

                //Uploading a file as a body
                //.multiPart("file", json)
                .log().all()
        .when()
                .post("api/v1/students/login")
        .then()
                .log().all()
                .assertThat()
                .statusCode(200);
    }

    //Practice Test
    @Test
    public void shouldBeAbleToLoginToTheApplicationPractice(){
        //Send body as String
        /*String body = "{\n" +
                "  \"email\": \"ddd@ddd.com\",\n" +
                "  \"password\": \"123456789\"\n" +
                "}";*/

        //Send body as File
        //File body = new File("src/test/resources/login.json");

        //Send body as Hash map
        /*HashMap<String,String> body = new HashMap<>();
        body.put("email", "ddd@ddd.com");
        body.put("password", "123456789");*/

        //Send body as POJO class using setters and getters
        /*LoginPojo body = new LoginPojo();
        body.setEmail("ddd@ddd.com");
        body.setPassword("123456789");*/

        //Send body as POJO class using constructor
        LoginPojo body = new LoginPojo("ddd@ddd.com","123456789");

        //Using URL Encoded
        HashMap<String, String> formParam = new HashMap<>();
        formParam.put("Foo", "1234");

        //Uploading a file as a body
        File json = new File("src/test/resources/login.json");

        given()
                .baseUri("https://todo.qacart.com/")
                //Use .header to specify the body as json
                //.header("Content-Type", "application/json")

                //Use .contentType to specify the body as json
                //.contentType(ContentType.JSON)

                //Sending the body
                //.body(body)

                //URL Encoded
                //.contentType(ContentType.URLENC)
                //.formParams(formParam)

                //Uploading a file as a body
                .multiPart("file", json)
                .log().all()
        .when()
                .post("api/v1/students/login")
        .then()
                .log().all()
                .assertThat()
                .statusCode(200);
    }
}
