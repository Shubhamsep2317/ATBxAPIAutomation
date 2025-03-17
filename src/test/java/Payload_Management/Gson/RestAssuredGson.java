package Payload_Management.Gson;

import com.google.gson.Gson;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.Test;
import static org.assertj.core.api.Assertions.*;



// RestFul Booker application
// https://restful-booker.herokuapp.com/apidoc/index.html

public class RestAssuredGson {

    // GSON--->> It is google library
    // Convert JSON to Class (Serialization) and Class to JSON (Deserialization)
    // JSON is a plain text which contains key and value pairs

    RequestSpecification request;
    Response response;
    ValidatableResponse val;
    String baseURI="https://restful-booker.herokuapp.com";
    String basePath="/booking";

    @Test
    public void testCreateBooking(){

        Booking book=new Booking();
        book.setFirstname("Shubham");
        book.setLastname("Sharma");
        book.setTotalprice(1000);
        book.setDepositpaid(true);
        book.setAdditionalneeds("Breakfast");

        Bookingdates bookingDates=new Bookingdates();
        bookingDates.setCheckin("12-10-2024");
        bookingDates.setCheckout("13-10-2024");

        book.setBookingdates(bookingDates);

        // Now use GSON Library to convert Object to JSON

        Gson gson=new Gson();
        String jsonStringBookingPayload=gson.toJson(book);
        System.out.println(jsonStringBookingPayload);

        request= RestAssured.given();
        request.baseUri(baseURI);
        request.basePath(basePath);
        request.contentType(ContentType.JSON);
        request.body(jsonStringBookingPayload);

        // Making HTTP request
        response=request.when().log().all().post();

        // Validating status code
        val=response.then().log().all().statusCode(200);

        // Extract method() to extract responses-Case1
        String firstName= response.then().extract().path("booking.firstname");
        String lastName= response.then().extract().path("booking.lastname");

        // TestNG Assertions
        Assert.assertEquals(firstName,"Shubham");

        // AssertJ Assetions
        assertThat(firstName).isEqualTo("Shubham");
        assertThat(lastName).isNotEmpty().isEqualTo("Sharma");

        // Case 2->> To extract response values we can use -->>JsonPath class
        // getString()-->> Method to be used
        // Use jsonpathFinder to get path -->> https://jsonpathfinder.com/
        JsonPath json=new JsonPath(response.asString());
        String firstName1= json.getString("booking.firstname");
        String bookingID=json.getString("bookingid");
        String checkinDate=json.getString("booking.bookingdates.checkin");

        // AssertJ assertions
        assertThat(bookingID).isNotNull().isNotBlank();
        assertThat(firstName1).isEqualTo("Shubham");
        assertThat(checkinDate).isNotNull();

        // Case -3--->>>>De-serialization Concept (Extracting Response values)
        // Create a POJO class for BookingResponse and map the response
        String jsonResponse= response.asString();
        BookingResponse bookingResponse=gson.fromJson(jsonResponse, BookingResponse.class);
        System.out.println(bookingResponse.getBookingid());
        System.out.println(bookingResponse.getBooking().getFirstname());
        System.out.println(bookingResponse.getBooking().getLastname());
        System.out.println(bookingResponse.getBooking().getBookingdates().getCheckin());

        // AssertJ assertions
        assertThat(bookingResponse.getBooking().getFirstname()).isNotNull().isEqualTo("Shubham");
        assertThat(bookingResponse.getBooking().getDepositpaid()).isEqualTo(false);









    }


}
