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

        final String TOKEN="Basic YWRtaW46cGFzc3dvcmQxMjM=";
        String ID="711";
        String payload="{\n" +
                "    \"firstname\" : \"Hey\",\n" +
                "    \"lastname\" : \"Hey\",\n" +
                "    \"totalprice\" : 1110,\n" +
                "    \"depositpaid\" : true,\n" +
                "    \"bookingdates\" : {\n" +
                "        \"checkin\" : \"2018-01-01\",\n" +
                "        \"checkout\" : \"2019-01-01\"\n" +
                "    },\n" +
                "    \"additionalneeds\" : \"Bf\"\n" +
                "}";

        r.given();
        r.baseUri("https://restful-booker.herokuapp.com");
        r.basePath("/booking/"+ID);
        r.contentType(ContentType.JSON);
        r.accept("application/json");
        r.header("Authorization",TOKEN);
        //r.header("Accept", "application/json");
        r.body(payload).log().all();
        r.when().log().all().put();
        r.then().log().all().statusCode(200);
    }



}
