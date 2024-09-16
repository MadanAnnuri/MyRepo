import org.testng.annotations.*;

public class TC2 {

    @BeforeMethod
    void beforeMethod(){
        System.out.println("this is before method");
    }
    @AfterMethod
    void afterMethod(){
        System.out.println("this is afterMethod");
    }
    @Test
    void test1(){
        System.out.println("test1......");
    }
    @Test
    void test2(){
        System.out.println("test2......");
    }
    @BeforeClass
    void beforeClass(){
        System.out.println("this is before Class it will execute before all methods");
    }
    @AfterClass
    void afterClass(){
        System.out.println("this is after Class it will execute after all methods");
    }
    @BeforeTest
    void beforeTest(){
        System.out.println("this will execute before test....");
    }
    @AfterTest
    void afterTest(){
        System.out.println("this will execute after test...");
    }

}
