package March.APIAutoTestingSample;

import io.restassured.RestAssured;


public class GetRequestAutomation {

    public static void main(String[] args) {


        // Basic Get Request for Restful Booker using Rest Assured
        // This is a builder Pattern  and Rest assured follows the builder pattern
        RestAssured.given()
                .baseUri("https://restful-booker.herokuapp.com")
                .basePath("/booking/1")
                .when()
                .get()
                .then().log().all()
                .statusCode(200);
    }


}
