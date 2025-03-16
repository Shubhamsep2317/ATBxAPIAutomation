package TestNGAnnotations;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_BeforeTest {
    // PUT action
    //1.get Token
    //2. get BookingID
    //3. Perform PUT
    //4. Close all things

    @BeforeTest
    public void getToken(){
        System.out.println("1");
    }

    @BeforeTest
    public void getBookingID(){
        System.out.println("2");
    }

    @Test
    public void test_Put(){
        System.out.println("3");
    }

    @AfterTest
    public void close_All(){
        System.out.println("4");
    }


}
