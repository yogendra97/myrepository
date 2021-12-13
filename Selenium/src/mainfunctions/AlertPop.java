package mainfunctions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPop {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\chrome driver\\chromedriver_win32\\chromedriver1.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.rediff.com");
		
		driver.findElement(By.xpath("//a[@class=\"signin\"]")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
		
		Alert ar=driver.switchTo().alert();
		
		Thread.sleep(2000);
		
		ar.accept();
		
		
		
		
	}

}
