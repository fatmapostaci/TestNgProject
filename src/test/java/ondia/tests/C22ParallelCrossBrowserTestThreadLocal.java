package ondia.tests;

import ondia.utils.CrossBrowserParellelTestBase;
import org.testng.annotations.Test;

import static java.sql.DriverManager.getDriver;
//(en az 3 thread açmalıyız)
public class C22ParallelCrossBrowserTestThreadLocal extends CrossBrowserParellelTestBase {
    @Test
    void test01(){

        getDriver().get("https://google.com");
        assert getDriver().getTitle().contains("Google");
        getDriver().quit();
    }

    @Test
    void test02(){
        getDriver().get("https://linkedin.com");
        assert getDriver().getTitle().contains("LinkedIn");
        getDriver().quit();
    }

    @Test
    void test03(){
        getDriver().get("https://clarusway.com");
        assert getDriver().getTitle().contains("Bootcamp");
        getDriver().quit();
    }

}
