package PostRequest;

import io.qameta.allure.Description;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class PostRequest {

    RequestSpecification r;
    Response response;
    ValidatableResponse vr;


    // Non-BDD style test case for POST request
    @Description("TC-3 restFullBooker_POSTReq_Positive")
    @Test
    public void restFullBooker_POSTReq_Positive(){



        String payload="{\n" +
                "    \"username\" : \"admin\",\n" +
                "    \"password\" : \"password123\"\n" +
                "}";

        // Preconditions
        r=RestAssured.given();
        r.baseUri("https://restful-booker.herokuapp.com");
        r.basePath("/auth");
        r.contentType(ContentType.JSON);
        r.body(payload).log().all();

        // Making a API POST req Part 2
        response=r.when().log().all().post();

        // Verification -Part 3
        vr=response.then().log().all();
        vr.statusCode(200);
    }

}
