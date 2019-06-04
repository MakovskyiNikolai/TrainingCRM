import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;
import static Locators.MainPage.loginWithPopUp;


public class FinanceSiteSettings {
  private WebDriver driver;

  @Before
  public void setDriver(){
    System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
    driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

  }

  @After
  public void driverClose(){
    driver.close();
  }

  @Test
  public void checkFinanceSiteSettingsPageIsOpened(){
    loginWithPopUp(driver, "rmishyn", "!123456789", "https://us01.dynamicseam.com/staging/WebResources/eam_html_micros_sites_fsettings");
    final String expectedTitle = "https";
    final String actualTitle = driver.getTitle();
    Assert.assertEquals("Incorrect page title)", expectedTitle, actualTitle);

    }

}


