package mainfunctions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Explicit1 {
	
	public static void main(String[] args) throws InterruptedException {
		
	
	System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\chrome driver\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.manage().window().maximize();
	
	
	driver.navigate().to("https://www.flipkart.com");
	
	//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	driver.findElement(By.xpath("(//input[@type=\"text\"])[2]")).sendKeys("Yogendra");
	
	driver.findElement(By.xpath("//button[@class=\"_2KpZ6l _2doB4z\"]")).click();

	

}
}
