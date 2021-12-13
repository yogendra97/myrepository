package basicpractice;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class Test1 {
	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\chrome driver\\chromedriver_win32\\chromedriver1.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com");
		
		/*File ss=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest=new File("C:\\Users\\Dell\\Desktop\\Screenshot\\SC1.jpeg");
		FileHandler.copy(ss, dest);*/
		
		/*FileInputStream file=new FileInputStream("C:\\Users\\Dell\\Desktop\\ExcelData\\Parameterization.xlsx");
		Sheet Sh = WorkbookFactory.create(file).getSheet("Sheet1");
		String Username=Sh.getRow(1).getCell(0).getStringCellValue();
		System.out.println(Username);*/
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Actions act=new Actions(driver);
		
		WebElement For=driver.findElement(By.xpath("//a[normalize-space()='Forgotten password?']"));
		act.moveToElement(For).keyDown(Keys.CONTROL).click().keyUp(Keys.CONTROL).perform();
		
		Set<String> S1=driver.getWindowHandles();
		
		Iterator<String> it=S1.iterator();
		System.out.println(it.next());
		
		
		
		driver.switchTo().window("CDwindow-93968F1DB9765842E7F507F9549F076F");
		
		driver.findElement(By.xpath("//*[@id=\"identify_email\"]")).sendKeys("Yogendra");
		
		
		
	}

}
