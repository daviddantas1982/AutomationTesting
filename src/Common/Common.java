package Common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by ddantas on 7/6/2017.
 */
public class Common {
    public WebDriver getDriver()
    {
        System.setProperty ("webdriver.gecko.driver","C://Program Files/geckodriver.exe");

        WebDriver driver = new FirefoxDriver ();

        driver.manage ().timeouts ().implicitlyWait ( 10, TimeUnit.SECONDS );

        return  driver;
    }


}
