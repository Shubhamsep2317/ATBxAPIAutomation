package TestNGAnnotations;

import org.testng.annotations.Test;

public class TestNG_enabled {

    @Test
    public void testMethod1(){
        System.out.println("Method1");
    }
    @Test(enabled = false)
    public void testMethod2(){
        System.out.println("Method2");
    }
    @Test
    public void testMethod3(){
        System.out.println("Method3");
    }

}
