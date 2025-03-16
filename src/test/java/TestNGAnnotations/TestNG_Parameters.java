package TestNGAnnotations;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNG_Parameters {

    @Parameters("browserName")
    @Test
    public void startBrowser(String value){

        System.out.println(value);

        if(value.equalsIgnoreCase("Chrome")){
            System.out.println("Chrome is starting");
        } else if (value.equalsIgnoreCase("Firefox")) {
            System.out.println("Firefox is starting");
        }
    }

}
