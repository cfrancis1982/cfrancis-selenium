//adding comment here..

package package1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Practice2 {

	WebDriver driver = null;

	@Test
	public void f() throws Exception {

		driver.get("file:///D:/cfrancis/TRAINING/Test%20Automation%20with%20Selenium/site1/index.html");
		Thread.sleep(2000);

		// list all hyperlink href
		List<WebElement> links = driver.findElements(By.tagName("a"));
		for (WebElement link : links) {
			System.out.println("id: " + link.getAttribute("id") + " href: " + link.getAttribute("href"));
		}

		// list all elements depending condition
		// List<WebElement> textboxes = driver.findElements(By.tagName("input"));
		// String tbType = "";
		// for (WebElement textbox : textboxes) {

		// tbType = textbox.getAttribute("type");
		// if (tbType.equals("text")) {
		// System.out.println("id: " + textbox.getAttribute("id") + " name: " +
		// textbox.getAttribute("name"));
		// }
		// }

		// get all id of the paragraphs
		List<WebElement> paragids = driver.findElements(By.tagName("p"));
		for (WebElement paragid : paragids) {

			System.out.println("id: " + paragid.getAttribute("id") + " " + paragid.getText() +"\n");
		}

		
		//get text in paragraph
		WebElement parag = driver.findElement(By.id("article1"));
		System.out.println(parag.getText());
		
		
		
		WebElement tbl_name = driver.findElement(By.id("text1"));
		tbl_name.sendKeys("cristopher");

		WebElement tbl_office = driver.findElement(By.id("text2"));
		tbl_office.sendKeys("PRG Office");

		WebElement tbl_email = driver.findElement(By.id("text3"));
		tbl_email.sendKeys("cfrancis@email.com");
		
		WebElement rad_gender = driver.findElement(By.id("radio2"));
		rad_gender.click();

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
