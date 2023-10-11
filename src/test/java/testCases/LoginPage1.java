package testCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import pageObjectModel.LoginPageObject;
import resources.BaseClass;

public class LoginPage1 extends BaseClass {
	
	@Test
	
	public void verifyln() throws IOException, InterruptedException {
		
		driverInitialize();
		driver.get("https://login.salesforce.com/?locale=in");
		Thread.sleep(1000);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		LoginPageObject obj = new LoginPageObject(driver);
		obj.enterUserName().sendKeys("himanshu555@gmail.com");
		Thread.sleep(1000);
		obj.eneterPassword().sendKeys("yahoo@123546");
		Thread.sleep(1000);
		obj.clickOnLogIN().click();
		Thread.sleep(1000);
		obj.tryfree().click();
		driver.close();
		
	}

}
