package TestNGAnnotations;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNG_DependsOn {

    @Test
    public void serverStartedOk(){
        System.out.println("I will run First");
    }

    @Test(dependsOnMethods ="serverStartedOk" )
    public void testMethod1(){
        System.out.println("Method1");
        Assert.assertTrue(true);
    }
    @Test(dependsOnMethods = "serverStartedOk")
    public void testMethod2(){
        System.out.println("Method2");
        Assert.assertTrue(true);
    }

}
