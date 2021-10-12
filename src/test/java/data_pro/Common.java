package data_pro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Common {
	WebDriver driver;
	
	
	@BeforeTest
	public void beforeTest() {
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\shaki\\eclipse-workspace\\Hussain\\driver\\chromedrive.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	}

	
	
	
	
	
	@AfterTest
	public void tearup() {
		driver.close();
	}
}
