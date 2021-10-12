package Shakir.Hussain;

import org.testng.annotations.Test;

public class TestClass extends Uber {

	@Test
	public void test() throws InterruptedException {

		DriveIn driveIn = new DriveIn(driver);
		Thread.sleep(6000);
		driveIn.logIn();
		Thread.sleep(6000);
		driveIn.driveAndDelivery();
		Thread.sleep(3000);
		driveIn.email("shakirhussain_777@hotmail.com");
		Thread.sleep(3000);
		driveIn.next();
		Thread.sleep(3000);
		driveIn.password("shakihussain");
		Thread.sleep(3000);
		driveIn.next1();
		Thread.sleep(8000);

	}

}
