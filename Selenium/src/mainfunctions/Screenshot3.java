package mainfunctions;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot3 {
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\chrome driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.amazon.com");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		WebElement Search = driver.findElement(By.xpath("//input[@type=\"text\"]"));
		Search.sendKeys("Mobile");
		
		WebElement Go= driver.findElement(By.xpath("(//input[@type=\"submit\"])[1]"));
		Go.click();
		
		///take screenshot of mobile results from amazon
		
		File SS = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File dest=new File("C:\\Users\\Dell\\Desktop\\Screenshot\\Mobile.jpg");
		
		FileHandler.copy(SS, dest);
		
		
	}

}
