package testCases;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.eventusermodel.XSSFSheetXMLHandler;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HandlingExcellSheet {
	
	@Test
	public void excelhandling() throws IOException, InterruptedException
	{
		FileInputStream fs = new FileInputStream("C:\\Users\\ASUS\\Desktop\\hello.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fs);
		XSSFSheet sheet1 = workbook.getSheetAt(0);
		XSSFRow row = sheet1.getRow(0);
		XSSFCell cell1 = row.getCell(0);
		XSSFCell cell2 = row.getCell(1);
		System.out.println(cell1);
		System.out.println(cell2);
		
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://login.salesforce.com/?locale=in");
		Thread.sleep(1000);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		WebElement user_name = driver.findElement(By.xpath("//input[@id='username']"));
		Thread.sleep(1000);
		user_name.click();
		Thread.sleep(1000);
		user_name.sendKeys(cell1.getStringCellValue());
		Thread.sleep(1000);
		System.out.println("Username is Given");
		
		WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
		Thread.sleep(1000);
		password.click();
		Thread.sleep(1000);
		password.sendKeys(cell2.getStringCellValue());
		Thread.sleep(1000);
		System.out.println("password is given");
		
		WebElement login_button = driver.findElement(By.xpath("//input[@id='Login']"));
		Thread.sleep(1000);
		login_button.click();
		Thread.sleep(2000);
		System.out.println("wrong input");
		driver.close();
	}

}
