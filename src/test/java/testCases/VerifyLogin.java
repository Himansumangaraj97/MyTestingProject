package testCases;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import pageObjectModel.LoginPageObject;
import resources.BaseClass;

public class VerifyLogin extends BaseClass{
	@Test
	
	public void log() throws IOException, InterruptedException
	{
		driverInitialize();
		driver.get("https://login.salesforce.com/?locale=in");
		Thread.sleep(1000);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
	    LoginPageObject obj = new LoginPageObject(driver);
	    
	    FileInputStream excel1 = new FileInputStream("C:\\Users\\ASUS\\Desktop\\hello.xlsx");
	    XSSFWorkbook wb = new XSSFWorkbook(excel1);
	    XSSFSheet sheet = wb.getSheetAt(0);
	    XSSFRow row = sheet.getRow(0);
	    XSSFCell cell1 = row.getCell(0);
	    XSSFCell cell2 = row.getCell(1);
	    
	    obj.enterUserName().sendKeys(cell1.getStringCellValue());
	    Thread.sleep(2000);
	    obj.eneterPassword().sendKeys(cell2.getStringCellValue());
	    Thread.sleep(2000);
	    obj.clickOnLogIN().click();
	    Thread.sleep(2000);
	    obj.tryfree().click();
	    Thread.sleep(2000);
	    
	    driver.close();
	    
		
		
		
	}

}
