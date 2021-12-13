package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Openchrome {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\chrome driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		//driver.close();
		
		driver.manage().window().maximize();
		
		driver.get("http:\\www.Facebook.com");
		
		WebElement US = driver.findElement(By.xpath("//input[@type=\"text\"]"));
		
		US.sendKeys("9765436393");
		
		WebElement pass = driver.findElement(By.xpath("//input[@type=\"password\"]"));
		pass.sendKeys("9765436394");
		
		WebElement login = driver.findElement(By.xpath("//button[@value=\"1\"]"));
		login.click();
		
	}

}
