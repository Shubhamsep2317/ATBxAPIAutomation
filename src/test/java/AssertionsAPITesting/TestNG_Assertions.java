package AssertionsAPITesting;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestNG_Assertions {

    // Hard Assertions
    @Test
    public void hardAssertionsTestNG(){
        System.out.println("Start of the program");
        Assert.assertEquals("Shubham","shubham");
        System.out.println("End of program");
    }

    // Soft assertions
    @Test
    public void softAssertionsTestNG(){
        SoftAssert soft=new SoftAssert();
        System.out.println("Start of program");
        soft.assertTrue(false);
        System.out.println("End of program");
        soft.assertAll("Asserted all");
    }
}
