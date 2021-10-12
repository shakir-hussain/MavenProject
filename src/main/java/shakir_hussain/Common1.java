package shakir_hussain;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class Common1 {
	WebDriver driver;
	@Parameters({"browser","website"})
	@BeforeTest
	public void setup(String browser, String website) {
		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\shaki\\eclipse-workspace\\ImportantHussainProject\\driver\\chromedrive.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get(website);
		} else if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver",
					"C:\\Users\\shaki\\eclipse-workspace\\ImportantHussainProject\\driver\\geckodriver.exe");
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.get(website);

		} else if (browser.equalsIgnoreCase("Edge")) {
			System.setProperty("webdriver.edge.driver",
					"C:\\Users\\shaki\\eclipse-workspace\\ImportantHussainProject\\driver\\msedgedriver.exe");
			driver = new EdgeDriver();
			driver.manage().window().maximize();
			driver.get(website);

		}
	}

	@AfterTest
	public void tearUp() {
		driver.close();

	}

}
