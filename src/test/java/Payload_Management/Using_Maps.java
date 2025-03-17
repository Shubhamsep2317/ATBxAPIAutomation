package Payload_Management;

import org.testng.annotations.Test;

import java.util.LinkedHashMap;
import java.util.Map;

public class Using_Maps {


    @Test
    public void test_POST(){

//        String postPayload = "{\n" +
//                "    \"firstname\" : \"Shubham\",\n" +
//                "    \"lastname\" : \"Hey\",\n" +
//                "    \"totalprice\" : 1110,\n" +
//                "    \"depositpaid\" : true,\n" +
//                "    \"bookingdates\" : {\n" +
//                "        \"checkin\" : \"2018-01-01\",\n" +
//                "        \"checkout\" : \"2019-01-01\"\n" +
//                "    },\n" +
//                "    \"additionalneeds\" : \"Bf\"\n" +
//                "}";

        // Payload using Maps

        Map<String,Object> jsonPayloadUsingMap= new LinkedHashMap<>();
        jsonPayloadUsingMap.put("firstname","Shubham");
        jsonPayloadUsingMap.put("lastname","Sharma");
        jsonPayloadUsingMap.put("totalprice",1100);
        jsonPayloadUsingMap.put("depositpaid",false);

        Map<String,Object> bookingDates= new LinkedHashMap<>();
        bookingDates.put("checkin","12-10-2025");
        bookingDates.put("checkout","13-10-2025");

        jsonPayloadUsingMap.put("bookingDates",bookingDates);
        jsonPayloadUsingMap.put("additionalneeds","Breakfast");
        System.out.println(jsonPayloadUsingMap.entrySet());

    }
}
