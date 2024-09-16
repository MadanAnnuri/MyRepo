import org.testng.Assert;
import org.testng.annotations.Test;

public class SecondTestNgClass {
    @Test(priority = 0)
    void setup(){
        System.out.println("Setup and open page");
    }
    @Test(priority = 1)
    void login(){
        System.out.println("do login");
    }
    @Test(priority = 2)
    void addcustomer(){
        System.out.println("add customer");
        Assert.assertEquals(1,1);
    }
    @Test(priority = 3)
    void adddata(){
        System.out.println("add data");
    }
    @Test(priority = 4)
    void teardown(){
        System.out.println("close window");
    }
}
