package ondia.mentoring.nisan14;

import ondia.mentoring.nisan10.DriverThreadLocal_CrossParalell;
import org.testng.annotations.Test;

public class LoglamaCalismasi2 extends DriverThreadLocal_CrossParalell {

    @Test
    public void classLogger() {

        logger.info("Login testi başladı");
        String username = "user1";
        String password = "1234";

        logger.debug("Kullanıcı adı: " + username);
        logger.debug("Şifre: " + password);

        boolean result = username.equals("user1") && password.equals("1234");fh

        if (result) {
            logger.info("Login başarılı!");
        } else {
            logger.error("Login başarısız!");
        }

        assert result;

    }

}
