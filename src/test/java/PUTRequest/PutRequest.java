package PUTRequest;

import io.qameta.allure.Description;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class PutRequest {


   static RequestSpecification r= RestAssured.given();

    @Description("TC-1 restfullBooker_PUTRequest")
    @Test
    public void restfullBooker_PUTRequest(){

        String cookie="db7ce2a3c0fe094";
        String ID="3348";
        String payload="{\n" +
                "    \"firstname\" : \"James\",\n" +
                "    \"lastname\" : \"ABC\",\n" +
                "    \"totalprice\" : 1110,\n" +
                "    \"depositpaid\" : true,\n" +
                "    \"bookingdates\" : {\n" +
                "        \"checkin\" : \"2018-01-01\",\n" +
                "        \"checkout\" : \"2019-01-01\"\n" +
                "    },\n" +
                "    \"additionalneeds\" : \"Breakfast\"\n" +
                "}";

        r.given();
        r.baseUri("https://restful-booker.herokuapp.com");
        r.basePath("/booking/"+ID);
        r.contentType(ContentType.JSON);
        r.accept("application/json");
        // Missing part if code for Auth --->> Need to check
        r.body(payload).log().all();
        r.when().log().all().put();
        r.then().log().all().statusCode(200);
    }



}
