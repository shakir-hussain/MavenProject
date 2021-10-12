package shakir_hussain;


import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listener extends Common1 implements ITestListener {
     
	
	
	@Override
	public void onTestFailure(ITestResult result) {
		this.driver = ((Common1) result.getInstance()).driver;
		System.out.println("Test Failed =");
		Date date= new Date();
		// System.out.println(date);
		 String Change=date.toString().replace(" ","_").replace(":","_");
		 System.out.println(Change);
		 String Path=System.getProperty("user.dir");
      File picture = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
      try {
		FileHandler.copy(picture,new File(Path +"\\pictures\\failed"+Change+"shots.png"));
	} catch (IOException e) {
		e.printStackTrace();
	}
	}

	@Override
	public void onTestStart(ITestResult result) {
		this.driver = ((Common1) result.getInstance()).driver;
		System.out.println("test started");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test on success =");
		this.driver = ((Common1) result.getInstance()).driver;
		Date date= new Date();

		 String Change=date.toString().replace(" ","_").replace(":","_");
		 System.out.println(Change);
		 String Path=System.getProperty("user.dir");
		  File picture = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	      try {
			FileHandler.copy(picture,new File(Path +"\\pictures\\passed"+Change+"shots.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
