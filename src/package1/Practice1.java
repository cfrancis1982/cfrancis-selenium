package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Practice1 {
	
	WebDriver driver=null;
	
	
  @Test
  public void f() throws Exception {
	  driver.get("http://www.youtube.com");
	  Thread.sleep(2000);
	  
	  WebElement searchtextbox = driver.findElement(By.id("search"));
	  //WebElement searchtextbox = (WebElement) driver.findElements(By.id("search"));
	  searchtextbox.sendKeys("bts");
	  Thread.sleep(2000);
	  
	  WebElement searchbtn = driver.findElement(By.id("search-icon-legacy"));
	  searchbtn.click();

	  
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe"); //location is in drive C
	  driver = new ChromeDriver();
	  
	  //System.setProperty("webdriver.gecko.driver", "C:\\geckodriver\\geckodriver.exe");
	  //driver = new FirefoxDriver();
  }

  @AfterMethod
  public void afterMethod() {
	  driver.close();
  }

}
