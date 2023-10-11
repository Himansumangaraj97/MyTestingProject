package testCases;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CaptureScreenShot {
	@Test
	public void fullscreenshot() throws InterruptedException, IOException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		Thread.sleep(1000);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		//Full Page Screenshot
		/*TakesScreenshot ts = (TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File("\\C:\\Users\\ASUS\\Desktop\\screenshots\\sc.png");
		FileUtils.copyFile(source, destination);
		System.out.println("Screenshot is taken");*/
		
		//Screenshot of Particular Section
		WebElement section = driver.findElement(By.xpath("/html/body/div[1]"));
		File source = section.getScreenshotAs(OutputType.FILE);
		File destination = new File("\\C:\\Users\\ASUS\\Desktop\\screenshots\\scportion.png");
		FileUtils.copyFile(source, destination);
		System.out.println("Screenshot is taken");
		
		driver.close(); 
		
		
	}

}
