package AssertionsAPITesting;
// For AssertJ assertions please import below line
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import static org.assertj.core.api.Assertions.*;

public class RestAssured_AssertJ {
    RequestSpecification request;
    Response response;
    ValidatableResponse val;


    @Test
    public void testPostMethod() {

        String baseURI = "https://restful-booker.herokuapp.com";
        String basePath = "/booking";
        String postPayload = "{\n" +
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

        request = RestAssured.given();
        request.baseUri(baseURI);
        request.basePath(basePath);
        request.contentType(ContentType.JSON);
        request.body(postPayload);

        // Making HTTP request
        response = request.when().log().all().post();

        // Validating status code
        val = response.then().log().all().statusCode(200);


        // TestNG Assertions
        // Hard Assert and Soft Assert
        // Below examples

        Integer bookingID=response.then().extract().path("bookingid");
        String firstName=response.then().extract().path("booking.firstname");
        String lastname=response.then().extract().path("booking.lastname");

        // Hard Assert
        Assert.assertEquals(firstName,"Shubham");
        Assert.assertEquals(lastname,"Hey");
        Assert.assertNotNull(bookingID);

        // Soft Assert
        SoftAssert soft= new SoftAssert();
        soft.assertEquals(firstName,"Hey");
        soft.assertAll("Assert All");


        // AssertJ
        assertThat(bookingID).isNotNull().isPositive();
        assertThat(firstName).isEqualTo("Shubham");
        assertThat(lastname).isNotBlank().isNotEmpty().isEqualTo("Hey");

    }
}