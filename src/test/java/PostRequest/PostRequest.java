package PostRequest;

import io.qameta.allure.Description;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class PostRequest {

    RequestSpecification r= RestAssured.given();


    // Non-BDD style test case for POST request
    @Description("TC-3 restFullBooker_POSTReq_Positive")
    @Test
    public void restFullBooker_POSTReq_Positive(){

        String payload="{\n" +
                "    \"username\" : \"admin\",\n" +
                "    \"password\" : \"password123\"\n" +
                "}";

        r.given();
        r.baseUri("https://restful-booker.herokuapp.com");
        r.basePath("/auth");
        r.contentType(ContentType.JSON);
        r.body(payload).log().all();
        r.when().log().all().post();
        r.then().log().all().statusCode(200);
    }

}
