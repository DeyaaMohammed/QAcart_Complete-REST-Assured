package com.qacart.academy.testcases;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class CoursesTest {
    @Test
    public void shouldBeAbleToGetCourseDetails(){
        given()
                .baseUri("https://todo.qacart.com/")
                .auth().oauth2("eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6IjY1NWNhODY0Nzg1MDk5MDAxNGVmNjA1YyIsImZpcnN0TmFtZSI6IkRleWFhIiwibGFzdE5hbWUiOiJNb2hhbW1lZCIsImlhdCI6MTcwMDU3MjE4MX0.AFkXgn2XIlzxp_FusHtPXLy5RSuYtzTuukudqYaysmY")
        .when()
                .get("api/v1/courses/1")
        .then()
                .log().all()
                .assertThat().statusCode(200);
    }

    //Practice Test
    @Test
    public void shouldBeAbleToGetCourseDetailsPractice(){
        given()
                .baseUri("https://todo.qacart.com/")
                //Sending Token as Header
                //.header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6IjY1NWNhODY0Nzg1MDk5MDAxNGVmNjA1YyIsImZpcnN0TmFtZSI6IkRleWFhIiwibGFzdE5hbWUiOiJNb2hhbW1lZCIsImlhdCI6MTcwMDU3MTg2MH0.SDfMwXl1AM1YyQq6i5SmC6tyynK6CW8wSUoOedGo4C0")
                //Using.auth
                .auth().oauth2("eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6IjY1NWNhODY0Nzg1MDk5MDAxNGVmNjA1YyIsImZpcnN0TmFtZSI6IkRleWFhIiwibGFzdE5hbWUiOiJNb2hhbW1lZCIsImlhdCI6MTcwMDU3MjE4MX0.AFkXgn2XIlzxp_FusHtPXLy5RSuYtzTuukudqYaysmY")
        .when()
                .get("api/v1/courses/1")
        .then()
                .log().all()
                .assertThat().statusCode(200);
    }
}
