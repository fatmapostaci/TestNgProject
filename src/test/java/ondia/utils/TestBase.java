package ondia.utils;


import ondia.mentoring.nisan14.LoglamaCalismasi;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

public abstract class TestBase {//Classı abstract yaparak bu classtan obje oluşturulmasını engelliyoruz.

    protected static WebDriver driver;
    //bu logger değişkeni extend eden her classta çağırılabilir
    protected final Logger logger = LogManager.getLogger(this.getClass());


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
