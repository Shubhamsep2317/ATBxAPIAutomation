package TestNGAnnotations;

import org.testng.annotations.Test;

public class TestNG_Annotation {

    @Test(priority = 1)
    public void t1(){}

    @Test(priority =3)
    public void t2(){}

    @Test(priority = 4)
    public void t3(){}

    @Test(priority = 2)
    public void t4(){}

}
