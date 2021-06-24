package package1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Practice3 {

	WebDriver driver = null;

	@Test
	public void f() throws Exception {

		driver.get("file:///D:/cfrancis/TRAINING/Test%20Automation%20with%20Selenium/site1/index.html");
		Thread.sleep(2000);

		String homeurl = "file:///D:/cfrancis/TRAINING/Test%20Automation%20with%20Selenium/site1/index.html";
		String page1url = "file:///D:/cfrancis/TRAINING/Test%20Automation%20with%20Selenium/site1/page1.html";
		String page2url = "file:///D:/cfrancis/TRAINING/Test%20Automation%20with%20Selenium/site1/page2.html";

		String page1title = "Document-Page1";
		String page2title = "PAGE 2";
		String hometitle = "HOMETITLE";

		String page1banner = "PAGE 1";
		String page2banner = "PAGE 2";
		String homebanner = "HOME";

		// click page 1 link
		WebElement a2 = driver.findElement(By.id("linkpage1"));
		a2.click();
		Thread.sleep(5000);

		String page1testurl = driver.getCurrentUrl();
		if (page1testurl.equals(page1url)) {
			System.out.println("page1 URL is correct");
		} else {
			System.out.println("page1 URL error");
		}

		String page1testtitle = driver.getTitle();
		if (page1testtitle.equals(page1title)) {
			System.out.println("page1 title is correct");
		} else {
			System.out.println("page1 title error");
		}

		String page1testbanner = driver.findElement(By.id("title")).getText();
		if (page1testbanner.equals(page1banner)) {
			System.out.println("page1 banner is correct");
		} else {
			System.out.println("page1 banner error");
		}

		Thread.sleep(2000);
		// click page 2 link		
		//NEED TO CHECK ON THIS TO REFRESH
		WebElement a3 = driver.findElement(By.id("linkpage2"));
		a3.click();
		Thread.sleep(5000);

		String page2testurl = driver.getCurrentUrl();
		if (page2testurl.equals(page2url)) {
			System.out.println("page2 URL is correct");
		} else {
			System.out.println("page2 URL error");
		}

		String page2testtitle = driver.getTitle();
		if (page2testtitle.equals(page2title)) {
			System.out.println("page2 title is correct");
		} else {
			System.out.println("page2 title error");
		}

		String page2testbanner = driver.findElement(By.id("title")).getText();
		if (page2testbanner.equals(page2banner)) {
			System.out.println("page2 banner is correct");
		} else {
			System.out.println("page2 banner error");
		}

		Thread.sleep(2000);

		// click home link
		WebElement a1 = driver.findElement(By.id("linkhome"));
		a1.click();
		Thread.sleep(5000);

		String hometesturl = driver.getCurrentUrl();
		if (hometesturl.equals(homeurl)) {
			System.out.println("home URL is correct");
		} else {
			System.out.println("home URL error");
		}

		String hometesttitle = driver.getTitle();
		if (hometesttitle.equals(hometitle)) {
			System.out.println("home title is correct");
		} else {
			System.out.println("home title error");
		}

		String hometestbanner = driver.findElement(By.id("title")).getText();
		if (hometestbanner.equals(homebanner)) {
			System.out.println("home banner is correct");
		} else {
			System.out.println("home banner error");
		}

		Thread.sleep(2000);
		
		
	}

	@BeforeMethod
	public void beforeMethod() {

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe"); // location is in drive C
		driver = new ChromeDriver();
	}

	@AfterMethod
	public void afterMethod() {

		driver.close();
	}

}
