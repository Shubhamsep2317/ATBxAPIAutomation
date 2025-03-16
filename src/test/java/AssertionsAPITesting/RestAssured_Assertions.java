package AssertionsAPITesting;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.hamcrest.Matcher;
import org.testng.annotations.Test;

// import for RestAssured Assertions

import org.hamcrest.Matchers;


public class RestAssured_Assertions {

    RequestSpecification request;
    Response response;
    ValidatableResponse val;

    @Test
    public void testPostMethod(){

        String baseURI="https://restful-booker.herokuapp.com";
        String basePath="/booking";
        String postPayload="{\n" +
                "    \"firstname\" : \"Shubham\",\n" +
                "    \"lastname\" : \"Hey\",\n" +
                "    \"totalprice\" : 1110,\n" +
                "    \"depositpaid\" : true,\n" +
                "    \"bookingdates\" : {\n" +
                "        \"checkin\" : \"2018-01-01\",\n" +
                "        \"checkout\" : \"2019-01-01\"\n" +
                "    },\n" +
                "    \"additionalneeds\" : \"Bf\"\n" +
                "}";

        request= RestAssured.given();
        request.baseUri(baseURI);
        request.basePath(basePath);
        request.contentType(ContentType.JSON);
        request.body(postPayload);

        // Making HTTP request
        response=request.when().log().all().post();

        // Validating status code
        val=response.then().log().all().statusCode(200);

        // Hamcrest
        // import for RestAssured Assertions
        //import org.hamcrest.Matchers;
        val.body("booking.firstname", Matchers.equalTo("Shubham"));
        val.body("booking.lastname",Matchers.containsString("Hey"));
        val.body("bookingid",Matchers.notNullValue());
        val.body("booking.depositpaid",Matchers.equalTo(false));








    }

}
