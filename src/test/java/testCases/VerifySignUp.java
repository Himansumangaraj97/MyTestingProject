package testCases;

import java.io.IOException;

import org.testng.annotations.Test;

import pageObjectModel.SignUpObject;
import resources.BaseClass;

public class VerifySignUp extends BaseClass {
	
	@Test
	public void VerifySignUp() throws IOException, InterruptedException {
		driverInitialize();
		Thread.sleep(1000);
		driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=70130000000Enyk");
		Thread.sleep(1000);
		driver.manage().window().maximize();
		
		
		SignUpObject obj = new SignUpObject(driver);
		obj.enterFirstName().sendKeys("HIMANSHU");
		Thread.sleep(1000);
		
		
	}

}
