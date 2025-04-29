package ondia.tests;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class C11_ParametrizedTest {

    @Test
    @Parameters({"firstname","password"})
    public void perametrizedTest(String isim, String sifre){

        System.out.println("isim = " + isim);
        System.out.println("sifre = " + sifre);

    }

}
