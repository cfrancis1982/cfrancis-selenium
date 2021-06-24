package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Practice4 {

	WebDriver driver = null;

	@Test
	public void f() throws Exception {

		//driver.get("file:///D:/cfrancis/TRAINING/Test%20Automation%20with%20Selenium/site1/index.html");
		driver.get("www.youtube.com");
		
		Thread.sleep(2000);
		
		WebElement txt_name = driver.findElement(By.xpath("//*[@id=\"text1\"]")); //incase no ID, Name provided
		//go to inspect and rightclick get expath.
		
		txt_name.sendKeys("Carlos");
	}

	@BeforeMethod
	public void beforeMethod() {

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe"); // location is in drive C
		driver = new ChromeDriver();
	}

	@AfterMethod
	public void afterMethod() {

		//driver.close();
	}
}
