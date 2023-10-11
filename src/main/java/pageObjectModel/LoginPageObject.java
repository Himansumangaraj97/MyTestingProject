package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageObject {
	
	public WebDriver driver;
	
	private By username = By.xpath("//input[@id='username']");
	
	private By password = By.xpath("//input[@id='password']");
	
	private By logIn = By.xpath("//input[@id='Login']");
	
	private By TryItFree = By.xpath("//a[@id='signup_link']");
	
	public LoginPageObject(WebDriver driver2) {
		this.driver=driver2;
	}


	public WebElement enterUserName()
	{
		return driver.findElement(username);
		
	}
	public WebElement eneterPassword()
	{
		return driver.findElement(password);
		
	}
	public WebElement clickOnLogIN()
	{
		return driver.findElement(logIn);
		
	}
	public WebElement tryfree()
	{
		return driver.findElement(TryItFree);
		
	}
	

}
