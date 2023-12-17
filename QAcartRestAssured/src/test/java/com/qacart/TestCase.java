package com.qacart;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasEntry;

public class TestCase {
    @Test
    public void test(){
        given().baseUri("https://65421b6cf0b8287df1ff8903.mockapi.io")
        .when().get("api/v1/users")
        .then().log().all()
                .assertThat().statusCode(200)
                //.assertThat().body("[0].name", is(equalTo("Charlie Johnston")),
                        //"name", hasItems("Hilda Barton", "Levi Fadel", "Mindy Schiller"));
                //.assertThat().body("name", not(hasItem("khaled")));
                //.assertThat().body(contains("Charlie Johnston", "Hilda Barton"));
                //.assertThat().body(containsInAnyOrder("Hilda Barton", "Charlie Johnston"));
                //.assertThat().body("name", empty());
                //.assertThat().body("name", is(not(empty())));
                //.assertThat().body("name", hasSize(2));
                //.assertThat().body("name.size()", equalTo(2));
                //.assertThat().body("createdAt", everyItem(startsWith("2023")));
                //.assertThat().body("[0]", hasKey("country"));
                //.assertThat().body("[0]", hasValue("Thailand"));
                .assertThat().body("[0]", hasEntry("name", "Charlie Johnston"));

    }
    @Test
    public void responseExtract(){

        //Extracting response
        /*Response res = given().baseUri("https://65421b6cf0b8287df1ff8903.mockapi.io")
                .when().get("api/v1/users")
                .then().extract().response();

        //Printing the whole response
        //System.out.println(res.asString());

        //Extracting specific element
        //String name = res.path("[0].name");
        //System.out.println(name);

        //using JsonPath
        String name = JsonPath.from(res.asString()).getString("[0].name");
        System.out.println(name);*/

        //Extract using then
        String name = given().baseUri("https://65421b6cf0b8287df1ff8903.mockapi.io")
                .when().get("api/v1/users")
                .then().extract().response().path("[0].name");
        System.out.println(name);
    }
    @Test
    public void responseLogging(){
        //Log all request data
        /*given().baseUri("https://65421b6cf0b8287df1ff8903.mockapi.io").log().all()
                .when().get("api/v1/users")
                .then();*/
        //Log request body
        /*given().baseUri("https://65421b6cf0b8287df1ff8903.mockapi.io").log().body()
                .when().get("api/v1/users")
                .then();*/

        //Log response body
        /*given().baseUri("https://65421b6cf0b8287df1ff8903.mockapi.io")
                .when().get("api/v1/users")
                .then().log().body();*/

        //Log response status
        /*given().baseUri("https://65421b6cf0b8287df1ff8903.mockapi.io")
                .when().get("api/v1/users")
                .then().log().status();*/

        //Log request method
        /*given().baseUri("https://65421b6cf0b8287df1ff8903.mockapi.io").log().method()
                .when().get("api/v1/users")
                .then();*/

        //Log if error
        /*given().baseUri("https://65421b6cf0b8287df1ff890322.mockapi.io")
                .when().get("api/v1/users")
                .then().log().ifError();*/

        //Log if validation failed
        given().baseUri("https://65421b6cf0b8287df1ff8903.mockapi.io")
        .when().get("api/v1/users")
        .then().log().ifValidationFails()
                .body("[0].name", equalTo("Khaled"));

    }
}
