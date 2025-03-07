package TestNG.GetRequest;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class TestNGSample_NonBDDStyle {

   static RequestSpecification r=RestAssured.given();

    @Severity(SeverityLevel.NORMAL)
    @Description("TC-1 restfulBookerGet_PositiveTC ")
    @Test
    public void restfulBookerGet_PositiveTC()
    {
        String ID="1";
        r.given();
        r.baseUri("https://restful-booker.herokuapp.com");
        r.basePath("/booking/"+ID);
        r.when().log().all().get();
        r.then().log().all().statusCode(200);
    }

    @Severity(SeverityLevel.CRITICAL)
    @Description("TC-2 restfulBookerGet_NegativeTC")
    @Test
    public void restfulBookerGet_NegativeTC()
    {
        String ID="shubham";
        r.given();
        r.baseUri("https://restful-booker.herokuapp.com");
        r.basePath("/booking/"+ID);
        r.when().log().all().get();
        r.then().log().all().statusCode(404);
    }
}
