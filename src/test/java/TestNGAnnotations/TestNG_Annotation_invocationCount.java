package TestNGAnnotations;

import org.testng.annotations.Test;

public class TestNG_Annotation_invocationCount {

    @Test(invocationCount = 2)
    public void testMethod1(){
        System.out.println("Method1");
    }

    @Test(invocationCount = 3)
    public void testMethod2(){
        System.out.println("Method2");
    }
}
