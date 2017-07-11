import Common.Common;
import main.HomePage;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

/**
 * Created by ddantas on 7/6/2017.
 */
public class TestHomePage {

    WebDriver driver;

    @BeforeSuite
    public void setUp() throws Exception {

        Common cm = new Common ();
        driver = cm.getDriver ();

    }

    @Test
    public void testVerifyTitle() throws Exception {

        HomePage homePage = new HomePage ( driver );
        homePage.getClickTitle ();
    }

    @AfterSuite
    public void tearDown() throws Exception {
        driver.quit ();
    }
}
