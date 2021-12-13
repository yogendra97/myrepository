package mainfunctions;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Parameterization1 {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		
		 System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\chrome driver\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 
		 driver.manage().window().maximize();
		 
		 driver.get("https://www.facebook.com");
		 

			FileInputStream File=new FileInputStream("C:\\Users\\Dell\\Desktop\\Parameterization.xlsx");///create object of File input stream
			
			Sheet Sheet = WorkbookFactory.create(File).getSheet("Sheet1");	//create sheet like excel using workbookfactory
			
			 String US = Sheet.getRow(1).getCell(0).getStringCellValue();		//take particular value using row and column numbers and save it in string
			 
			 String Pass= Sheet.getRow(1).getCell(1).getStringCellValue();
			 
		WebElement FN = driver.findElement(By.xpath("//input[@type=\"text\"]"));
		FN.sendKeys(US);
		
		WebElement Password=driver.findElement(By.xpath("//input[@type=\"password\"]"));
		Password.sendKeys(Pass);
		
		WebElement Login=driver.findElement(By.xpath("//button[@value=\"1\"]"));
		Login.click();
		 
		 
		
	}

}
