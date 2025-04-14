package ondia.mentoring.nisan14;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.Marker;
import org.apache.logging.log4j.MarkerManager;
import org.testng.annotations.Test;


public class LoglamaCalismasi {

    // Bu logger değişkenini base classına yazarak, extend eden her classtan çağırabiliriz
    protected static final Logger logger = LogManager.getLogger(LoglamaCalismasi.class);
    private static final Marker result = MarkerManager.getMarker("RESULT");
    private static final Marker result2 = MarkerManager.getMarker("ANSWER");

    @Test
    public void testLog(){
        logger.info("Testim başlıyor");

        int a = 5;
        int b = 7;
        logger.debug("İşlem kontrol ediliyor : " + a + "+" + b );
        int result = a+b;
        logger.info("Sonuç yazdırılıyor");
        logger.info( result2 , "Bu bir veap logudur" );


    }
}
