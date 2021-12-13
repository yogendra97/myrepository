package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class firefoxfb {
	
	//to sign in facebook using attribute x path method
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Softwares\\gecko driver\\geckodriver-v0.30.0-win32\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://www.facebook.com");
		
		driver.manage().window().maximize();
		
		WebElement US=driver.findElement(By.xpath("//input[@type=\"text\"]"));
		US.sendKeys("yogendrachaudhari7427@gmail.com");
		
		WebElement pass =driver.findElement(By.xpath("//input[@type=\"password\"]"));
		pass.sendKeys("9765436393");
		
		WebElement login = driver.findElement(By.xpath("//button[@value=\"1\"]"));
		login.click();
		
		
		
	}

}
