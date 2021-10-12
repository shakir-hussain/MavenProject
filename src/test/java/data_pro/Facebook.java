package data_pro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Facebook extends NewTest {
	WebDriver driver;
	
	@FindBy(xpath = "//input[@class='inputtext _55r1 _6luy']")WebElement UserId;
     @FindBy(xpath = "//input[@id='pass']")WebElement Password;
     
     public Facebook(WebDriver Driver) {
    	 this.driver=Driver;
    	 PageFactory.initElements(Driver,this);
     }
     public void userId(String email) {
    	 UserId.sendKeys(email);
     }
     public void passwordField(String pass) {
    	 Password.sendKeys(pass);
     }
}
