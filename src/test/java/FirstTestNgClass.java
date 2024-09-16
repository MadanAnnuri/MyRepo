import org.testng.annotations.Test;

public class FirstTestNgClass {
    @Test(priority = -1)
    void setup(){
        System.out.println("Setup and open page");
    }
    @Test(priority = 0)
    void login(){
        System.out.println("do login");
    }
    @Test
    void teardown(){
        System.out.println("close window");

    }

}
