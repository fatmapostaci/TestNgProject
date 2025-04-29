package ondia.tests;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class C06Description {
//Testle ilgili bilgileri açıklayan @Test annotationa eklenen ve genelde tek bir dizeden oluşan açıklamadır.

    @Test(description = "This is test 1")
    public void test01() {
        System.out.println("Test 01");
    }

    @Test(description = "This is test 2")
    public void test02() {
        System.out.println("Test 02");
    }

    @Test(description = "This is test 3", dependsOnMethods = "test01", enabled = true, timeOut = 300)
    public void test03() throws NoSuchMethodException {
        System.out.println("Test 03");

        //Reflection yöntemi ile description ı method içinde yazdırabiliriz
        Method method = this.getClass().getMethod("test03");
        String description = method.getAnnotation(Test.class).description();
        System.out.println("Inside Method : " + description);
    }
    @AfterMethod
    public void afterMethod(ITestResult result){   //After Method annotation i de ITestResult sınıfı her method sonrasında sonucu taşınır
        System.out.println("After method : "+ result.getMethod().getDescription());
    }
}
