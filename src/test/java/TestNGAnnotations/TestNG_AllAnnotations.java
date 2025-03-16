package TestNGAnnotations;

import org.testng.annotations.*;

public class TestNG_AllAnnotations {

    @BeforeSuite
    public void beforeSuiteMethod(){
        System.out.println("Before Suite");
    }

    @BeforeTest
    public void beforeTest(){ System.out.println("Before Test");
    }

    @BeforeClass
    public void beforeClassMethod(){
        System.out.println("Before Class");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("Before Method");
    }


    @Test
    public void testMethod(){
        System.out.println("Test case");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("After Method");
    }

    @AfterClass
    public void afterClassMethod(){
        System.out.println("After Class");
    }

    @AfterTest
    public void afterTest(){
        System.out.println("After Test");
    }

    @AfterSuite
    public void afterSuiteMethod(){
        System.out.println("After Suite");
    }


}
