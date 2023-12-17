package com.qacart.academy.testcases;

import io.restassured.specification.RequestSpecification;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.HashMap;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class InfoTest {
    //RequestSpecification object
    RequestSpecification request;

    //Using RequestSpecification class
    @BeforeClass
    public void beforeClass(){
        request = given()
                .baseUri("https://todo.qacart.com/")
                .log().all();
    }

    @Test
    public void shouldBeAbleToGetCoursesInfo(){
        //Headers as HashMap
        HashMap<String, String> infoHeader = new HashMap<>();
        infoHeader.put("type", "WEB");
        infoHeader.put("language", "JAVA");

        given()
                .spec(request)
                .headers(infoHeader)
        .when()
                .get("api/v1/info/courses")
        .then()
                .log().all()
                .assertThat()
                    .statusCode(200)
                .body("count", equalTo(1));
    }

    @Test
    public void shouldBeAbleToGetLecturesInfo(){
        HashMap<String, String> quires = new HashMap<>();
        quires.put("mode", "VIDEO");
        quires.put("type", "PAID");

        given()
                .spec(request)
                .queryParams(quires)
        .when()
                .get("api/v1/info/lectures")
        .then()
                .log().all()
                .assertThat()
                .statusCode(200);

    }

    //Practice Test
    @Test
    public void shouldBeAbleToGetCoursesInfoPractice(){
        //Headers as HashMap
        HashMap<String, String> infoHeader = new HashMap<>();
        infoHeader.put("type", "WEB");
        infoHeader.put("language", "JAVA");

        //Header Class
        //Header typeHeader = new Header("type", "WEB");
        //Header languageHeader = new Header("language", "JAVA");

        //Headers Class
        //Headers infoHeaders = new Headers(typeHeader, languageHeader);

        given()
                .baseUri("https://todo.qacart.com/")
                //.header("language","JAVA")
                //.header("type", "MANUAL")
                //.headers("language","JAVA","type", "MANUAL")
                //.header(typeHeader)
                //.header(languageHeader)
                //.headers(infoHeaders)
                .headers(infoHeader)
                .log().all()
        .when()
                .get("api/v1/info/courses")
        .then()
                .log().all()
                .assertThat().statusCode(200);
    }

    //Practice Test
    @Test
    public void shouldBeAbleToGetLecturesInfoPractice(){
        HashMap<String, String> quires = new HashMap<>();
        quires.put("mode", "VIDEO");
        quires.put("type", "PAID");

        given()
                .baseUri("https://todo.qacart.com/")
                .queryParams(quires)
                //.queryParams("mode", "VIDEO", "type", "PAID")
                //.queryParam("mode", "VIDEO")
                //.queryParam("type", "PAID")
                .log().all()
        .when()
                .get("api/v1/info/lectures")
        .then()
                .log().all()
                .assertThat()
                .statusCode(200);
                //.body("count", equalTo(1));
    }
}
