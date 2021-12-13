package mainfunctions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Parameterization3 {
	
	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\chrome driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.flipkart.com");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		FileInputStream File=new FileInputStream("C:\\Users\\Dell\\Desktop\\Parameterization.xlsx");
		
		Sheet Sheet = WorkbookFactory.create(File).getSheet("Sheet3");
		
	    String Username = Sheet.getRow(1).getCell(0).getStringCellValue();
	    
	    String Pass= Sheet.getRow(1).getCell(1).getStringCellValue();
	    
	   WebElement US = driver.findElement(By.xpath("(//input[@type=\"text\"])[2]"));
	   US.sendKeys(Username);
	   
	   WebElement PassWord = driver.findElement(By.xpath("(//input[@type=\"password\"])"));
	   PassWord.sendKeys(Pass);
	   
	   WebElement Login = driver.findElement(By.xpath("(//button[@type=\"submit\"])[2]"));
	   Login.click();
	   
		
		
		
	
		
		
		
		
	}

}
