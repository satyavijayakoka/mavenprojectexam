package testngexam;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class testngexam4 {
	
	ChromeDriver driver;
	@BeforeMethod
	public void OpenBrowser() {
		driver = new ChromeDriver();
		driver.get("http://www.webdriveruniversity.com/");
	}
	
	
	@Test(priority = 1, description = "login functionality")
	public void testOne() {
		String title = driver.getTitle();
		String expectedtitle = "WebDriverUniversity.com";
	
		Assert.assertEquals(title,expectedtitle);
	}

}
