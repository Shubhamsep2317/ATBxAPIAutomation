package DELRequest;

import io.qameta.allure.Description;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class DeleteReq {


    RequestSpecification r;
    Response res;
    ValidatableResponse validatableResponse;

    @Description("Verify Deleting of the Booking")
    @Test
    public void restFullBooker_DeleteReq_Positive(){

        String bookingId="50";
        final String TOKEN="Basic YWRtaW46cGFzc3dvcmQxMjM=";

        // First Part Preconditions
        r= RestAssured.given();
        r.baseUri("https://restful-booker.herokuapp.com");
        r.basePath("booking/"+bookingId);
        r.contentType(ContentType.JSON);
        r.header("Authorization",TOKEN);


        //Second Part -- Making request
        res=r.log().all().when().delete();

        //Third part validating response
        validatableResponse= res.then().log().all();
        validatableResponse.statusCode(201);

    }
}
