package ondia.utils;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

public abstract class TestBase {//Classı abstract yaparak bu classtan obje oluşturulmasını engelliyoruz.

    protected static WebDriver driver;

    @BeforeClass//Her Class öncesi çalışır.
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));//Web elementin yüklenip bulunması için 10 saniyeye kadar bekler. NoSuchElementException atar.
    }

    @AfterClass//Her Class sonrası çalışır.
    public void tearDown() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }
}
