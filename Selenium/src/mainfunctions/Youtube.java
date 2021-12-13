package mainfunctions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Youtube {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\chrome driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.youtube.com");
		
		driver.manage().window().maximize();
		
		WebElement Search=driver.findElement(By.xpath("//input[@id=\"search\"]"));
		
		Search.sendKeys("Naam tera");
		
		WebElement Searchclick = driver.findElement(By.xpath("//button[@id=\"search-icon-legacy\"]"));
		
		Searchclick.click();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement song = driver.findElement(By.xpath("(//a[@id=\"video-title\"])[1]"));
		song.click();
		
		driver.quit();
		
		
		
	}

}
