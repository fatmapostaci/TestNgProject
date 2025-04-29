package ondia.tests;
import org.testng.annotations.Test;
public class verboseClass {


 @Test
    public void testLogin() {
        System.out.println("Login test executed.");
    }

    @Test
    public void testLogout() {
        System.out.println("Logout test executed.");
    }
    @Test(groups = "A")
    public void test01() {
        System.out.println("groups = \"A\" test executed.");
    }

    @Test(groups = "A")
    public void test02() {
        System.out.println("groups = \"A\" test executed.");
    }
}


