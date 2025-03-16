package TestNGAnnotations;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNG_GroupsAnnotation {

    @Test(groups = {"Sanity","Production"},priority = 1)
    public void testSanity(){
        System.out.println("Sanity");
        System.out.println("Production");
        Assert.assertTrue(false);
    }

    @Test(groups = {"Regression","QA"},priority = 3)
    public void testRegression(){
        System.out.println("Regression");
        System.out.println("QA");
        Assert.assertTrue(true);
    }

    @Test(groups = {"Smoke","Production"},priority = 2)
    public void testSmoke(){
        System.out.println("Smoke");
        System.out.println("Production");
        Assert.assertTrue(false);
    }
}
