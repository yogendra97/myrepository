package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class firefoxgmail {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Softwares\\gecko driver\\geckodriver-v0.30.0-win32\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://www.gmail.com");
		
		WebElement create = driver.findElement(By.xpath("//span[text()=\"Create account\"]"));
		create.click();
		
		driver.findElement(By.xpath("//span[@class=\"VfPpkd-StrnGf-rymPhb-b9t22c\"]")).click();
		
		driver.findElement(By.xpath("//input[@id=\"firstName\"]")).sendKeys("Yogendra");
		
		driver.findElement(By.xpath("//input[@id=\"lastName\"]")).sendKeys("Chaudhari");
		
		driver.navigate().back();
		
	}

}
