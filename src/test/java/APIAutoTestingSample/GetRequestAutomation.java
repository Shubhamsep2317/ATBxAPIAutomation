package APIAutoTestingSample;

import io.restassured.RestAssured;


public class GetRequestAutomation {

    public static void main(String[] args) {


        // Basic Get Request for Restful Booker using Rest Assured
        RestAssured.given()
                .baseUri("https://restful-booker.herokuapp.com")
                .basePath("/booking/1")
                .when()
                .get()
                .then().log().all()
                .statusCode(200);
    }


}
