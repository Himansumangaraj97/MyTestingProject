package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignUpObject {
	
	public static WebDriver driver;
	
	private By firstName = By.xpath("//input[@name='UserFirstName']");
	
	
	public SignUpObject(WebDriver driver2) {
		this.driver=driver2;
	}


	public WebElement enterFirstName() {
		return driver.findElement(firstName);
		
	}

}
