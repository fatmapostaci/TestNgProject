package ondia.tests;

import org.testng.annotations.*;

public class C01AnnotationsF {

    /*
    @BeforeSuite-@AfterSuite : Bu projedeki tüm testlerden önce/sonra çalışır.Sadece bir kere çalışır.
    @BeforeTest-@AfterTest :Tüm test methodlarından önce/sonra çalışır.Sadece bir kere çalışır.
    @BeforeClass-@AfterClass : Bir test sınıfındaki tüm test yöntemlerinden önce/sonra çalışır.Sadece bir kere çalışır.
    @BeforeGroups-@AfterGroups :Herhangi belirli test grubundan önce/sonra çalışır.Sadece bir kere çalışır.
    @BeforeMethod-@AfterMethod :Her test methodundan önce/sonra çalışır
 */

 /*
    Create a class.
    Create 3 test methods.
    Use TestNG annotations that can be used in the class.
    Interpret output in console.
 */

    @BeforeSuite
    public void beforeSuite() {

    }

    @AfterSuite
    public void afterSuite() {

    }

    @BeforeTest (description = "beforeTest")
    public void beforeTest() {

    }

    @AfterTest
    public void afterTest() {

    }



    @Test (priority =1)
    public void test01() {

    }

    @Test (priority =2)
    public void test02() {

    }
    @Test (priority =3)
    public void test03() {

    }
    @Test (priority =4)
    public void test04() {
        System.out.println("    @Test (priority =4)");
    }
    @Test(enabled= false,description="@knownissue:TC123")
    public void testDisabled(){
        System.out.println("    @Test(enabled= false,description=\"@knownissue:TC123\")");
    }
    @Test (dependsOnMethods ="test03")
    public void testDependsOn() {

    }
    @Test (timeOut =3000)
    public void testTimeOut() throws InterruptedException {
        Thread.sleep(2000); //3sn den önce biteceği için test geçer
        System.out.println("    @Test (timeOut =3000)");
    }
    @Test (description ="This is test of description" , enabled = true, timeOut = 300, dependsOnMethods = "test01")
    public void testDescription() throws InterruptedException {
        Thread.sleep(200); //0.3sn den önce biteceği için test geçer
        System.out.println("@Test (description =\"This is test of description\" , enabled = true, timeOut = 300, dependsOnMethods = \"test01\")");
    }

}
