package TestNGAnnotations;

import org.testng.annotations.*;

public class TestNG_AllAnnotations {

    @BeforeSuite
    public void beforeSuiteMethod(){
        System.out.println("Before Suite");
    }

    @BeforeClass
    public void beforeClassMethod(){
        System.out.println("Before Class");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("Before Method");
    }

    @BeforeTest
    public void beforeTest(){
        System.out.println("Before Test");
    }

    @Test
    public void testMethod(){
        System.out.println("Test case");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("After Method");
    }

    @AfterTest
    public void afterTest(){
        System.out.println("After Test");
    }

    @AfterClass
    public void afterClassMethod(){
        System.out.println("After Class");
    }

    @AfterSuite
    public void afterSuiteMethod(){
        System.out.println("After Suite");
    }


}
