package mainfunctions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Parameterization2 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\chrome driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("http://www.facebook.com");
		
		driver.manage().window().maximize();
		
		WebElement Create = driver.findElement(By.xpath("(//a[@role=\"button\"])[2]"));
		Create.click();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		FileInputStream File=new FileInputStream("C:\\Users\\Dell\\Desktop\\Parameterization.xlsx");
		Sheet Sheet = WorkbookFactory.create(File).getSheet("Sheet2");
		 String Firstname = Sheet.getRow(1).getCell(0).getStringCellValue();
		 String Lastname=Sheet.getRow(1).getCell(1).getStringCellValue();
		 String Mobile=Sheet.getRow(1).getCell(2).getStringCellValue();
		 String Pass=Sheet.getRow(1).getCell(3).getStringCellValue();
		 
		
		WebElement FN = driver.findElement(By.xpath("(//input[@type=\"text\"])[2]"));
		FN.sendKeys(Firstname);
		
		WebElement LN = driver.findElement(By.xpath("(//input[@type=\"text\"])[3]"));
		LN.sendKeys(Lastname);
		
		WebElement Mob = driver.findElement(By.xpath("(//input[@type=\"text\"])[4]"));
		Mob.sendKeys(Mobile);
		
		WebElement Password=driver.findElement(By.xpath("(//input[@type=\"password\"])[2]"));
		Password.sendKeys(Pass);
		
		
		
		
	}
}
