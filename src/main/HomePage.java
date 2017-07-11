package main;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


/**
 * Created by ddantas on 7/6/2017.
 */
public class HomePage {
    protected WebDriver driver;

    final String pageUrl = "http://www.staples.com/";

   @FindBy(css = ".stp--icon-logo")
   private  WebElement clickTitle;


    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements ( driver,this );
        driver.get (pageUrl);
    }

    public void getClickTitle() {
        WebDriverWait wait = new WebDriverWait ( driver, 60 );
       wait.until (ExpectedConditions.elementToBeClickable ( clickTitle )).click ();
       
    }

    public void setClickTitle(WebElement clickTitle) {
        this.clickTitle = clickTitle;
    }
}
