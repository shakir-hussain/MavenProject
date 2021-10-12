package Shakir.Hussain;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DriveIn {
	WebDriver driver;
	
	@FindBy(xpath = "(//button[@data-baseweb='button'])[4]")WebElement LogIn;
	@FindBy(xpath = "(//h2[@class='gy bv bw gz h0'])[4]")WebElement DriveAndDeliver;
	@FindBy(name = "textInputValue")WebElement Email;
	@FindBy(xpath = "//*[text()='Next']")WebElement Next;
	@FindBy(xpath = "//input[@name='password']")WebElement Password;
	@FindBy(xpath = "//*[text()='Next']")WebElement Next1;
	
	
	public DriveIn(WebDriver Driver) {
		this.driver=Driver;
		PageFactory.initElements(Driver,this);
	}
	public void logIn() {
		LogIn.click();
	}
	public void driveAndDelivery() {
		DriveAndDeliver.click();
	}
	public void email(String name) {
		Email.sendKeys(name);
	}
	public void next() {
		Next.click();
	}
	public void password(String pass) {
		Password.sendKeys(pass);
	}
	public void next1() {
		Next1.click();
	}

}
