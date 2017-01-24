package accpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class accTest {
	
	//private WebDriver Driver;
  @Test
  public void f() {
	  
	  //System.setProperty("webdriver.gecko.driver", "C:/Users/Parineet/workspace/acc-demo/mozilla-geckodriver/geckodriver.exe");
	  System.setProperty("webdriver.gecko.driver", "selenium/geckodriver.exe");
	  //System.setProperty("webdriver.chrome.driver", "E:/ACC/chromedriver_win32/chromedriver.exe");
	  WebDriver Driver = new FirefoxDriver();
	  //WebDriver Driver = new ChromeDriver();
	  Driver.get("http://google.com");
	  Driver.manage().window().maximize();
	  Driver.quit();
	  
  }
  @BeforeTest
  public void beforeTest() {
	  System.out.println("not Ha ha ha");
	 // Driver = new FirefoxDriver();
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("Ha ha ha");
  }

}
