package ondia.utils;

import org.testng.*;
import org.testng.annotations.IAnnotation;
import org.testng.annotations.ITestAnnotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class ListenerUtils implements ITestListener, IRetryAnalyzer, IAnnotationTransformer {


    @Override
    public void onTestStart(ITestResult result) {
        System.out.println(result.getName()+ " Testi Başladı ... ");

    }

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println(result.getName()+ " Testi Başarılı oldu ... ");
        ExtentReportUtils.createTestReport(result.getName(),"Kullanıcı başarı bir şekilde Sisteme log in olmalı");
        //ExtentReportUtils.passAndCaptureScreenshot("Başarılı sistem girişi sağlandı...");
    }

    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println(result.getName()+ " Testi Kaldı ... ");
        ExtentReportUtils.createTestReport(result.getName(),"Kullanıcı başarı bir şekilde Sisteme log in olmalı");
       // ExtentReportUtils.failAndCaptureScreenshot("Başarılı giriş yapılamadı! ");
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        System.out.println(result.getName()+ " Testi Atlandı ... ");

    }


    @Override
    public void onStart(ITestContext context) {
        System.out.println("Test Başladı : "+context.getStartDate());
    }

    @Override
    public void onFinish(ITestContext context) {
        System.out.println("Test Bitti : " + context.getEndDate());
        ExtentReportUtils.flush();
    }


    // Otomatik olarak Başarısız Test Senaryolarını bir kez daha yeniden çalıştırır
// IRetryAnalyzer Yöntemi Uygulanmıştır
// BU yöntem, BAŞARISIZ TEST SENARYOLARINI YENİDEN ÇALIŞTIRMAK İÇİN OTOMATİK OLARAK ÇAĞRILACAKTIR
    private static int retryCount = 0;
    private static final int maxTries = 2;

    @Override
    public boolean retry(ITestResult iTestResult) {
        if(retryCount<maxTries){
            retryCount++;
            return true;
        }
        return false;
    }

    // IAnnotationTransformer yöntemi eklenmiştir
// Bu, başarısız test senaryolarını otomatik olarak testng xml dosyalarını kullanarak yeniden çalıştırır
    @Override
    public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {
        annotation.setRetryAnalyzer(ListenerUtils.class);
    }
}









