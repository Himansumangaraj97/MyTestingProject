package testCases;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import resources.BaseClass;

public class LoginPage extends BaseClass{
	
	@Test
	
	public void verifyLogin() throws IOException, InterruptedException {
		
		driverInitialize();
		driver.get("https://login.salesforce.com/?locale=in");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		
		FileInputStream excellfile = new FileInputStream("C:\\Users\\ASUS\\Desktop\\hello.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(excellfile);
		XSSFSheet sheet = workbook.getSheetAt(0);
		XSSFRow row = sheet.getRow(0);
		XSSFCell cell1 = row.getCell(0);
		XSSFCell cell2 = row.getCell(1);
		System.out.println(cell1);
		System.out.println(cell2);
		
		WebElement userName = driver.findElement(By.xpath("//input[@id='username']"));
		userName.click();
		Thread.sleep(1000);
		userName.sendKeys(cell1.getStringCellValue());
		Thread.sleep(1000);
		
		WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
		password.click();
		Thread.sleep(1000);
		password.sendKeys(cell2.getStringCellValue());
		Thread.sleep(1000);
		
		WebElement login = driver.findElement(By.xpath("//input[@id='Login']"));
		login.click();
		Thread.sleep(1000);
		System.out.println("compoleted");
		
		driver.quit();
		
		
	}

}
