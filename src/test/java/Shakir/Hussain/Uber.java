package Shakir.Hussain;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;



public class Uber {
	public WebDriver driver;

	@Parameters({"browser"})
	@BeforeTest
	public void setup(String browser) {
		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\shaki\\eclipse-workspace\\Hussain\\driver\\chromedrive.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.uber.com/");
		} else if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver",
					"C:\\Users\\shaki\\eclipse-workspace\\Hussain\\driver\\geckodriver.exe");
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.get("https://www.uber.com/");

		} else if (browser.equalsIgnoreCase("Edge")) {
			System.setProperty("webdriver.edge.driver",
					"C:\\Users\\shaki\\eclipse-workspace\\Hussain\\driver\\msedgedriver.exe");
			driver = new EdgeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.uber.com/");

		}
	}

	@AfterTest
	public void tearUp() {
		driver.close();

	}
	public void screenShot() {
		
	}

}
