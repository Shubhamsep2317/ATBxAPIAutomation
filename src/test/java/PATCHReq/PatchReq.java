package PATCHReq;

import io.qameta.allure.Description;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class PatchReq {

    RequestSpecification r;
    Response res;
    ValidatableResponse val;


    @Description("Verify partial update for any Booking")
    @Test
    public void restFullBooker_patchRequest_positiveTestCase(){

        String bookingID="1849";
        final String TOKEN="Basic YWRtaW46cGFzc3dvcmQxMjM=";
        String payload="{\n" +
                "    \"firstname\" : \"James\",\n" +
                "    \"lastname\" : \"Brown\"\n" +
                "}";

        // Preconditions
        r= RestAssured.given();
        r.baseUri("https://restful-booker.herokuapp.com");
        r.basePath("/booking/"+bookingID);
        r.contentType(ContentType.JSON);
        r.header("Authorization",TOKEN);
        r.body(payload);

        // Part -2 --- HTTP Request type
        res=r.log().all().when().patch();

        //Part -3
        val=res.then().log().all();
        val.statusCode(200);

    }

}
