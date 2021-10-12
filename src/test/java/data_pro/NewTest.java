package data_pro;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class NewTest extends Common {
  @Test(dataProvider = "dp")
  public void f(String n, String s) throws InterruptedException {
	  Facebook facebook=new Facebook(driver);
	  facebook.userId(n);
	  facebook.passwordField(s);
	  Thread.sleep(6000);
	  facebook.UserId.clear();
	  facebook.Password.clear();
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "shakirhussain", "rayhanrahman" },
      new Object[] { "foysolRahman", "JahadAhmed" },
      new Object[] { "Rahman", "Jahad" },
    };
  }
}
