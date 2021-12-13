package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathflip {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Softwares\\\\chrome driver\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver D=new ChromeDriver();
		
		D.get("https://www.flipkart.com");
		
	    D.manage().window().maximize();
	    
	   WebElement ln = D.findElement(By.xpath("(//input[@autocomplete=\"off\"])[2]"));
	   
	   ln.sendKeys("9765436393");
	   
	   D.findElement(By.xpath("(//input[@autocomplete=\"off\"])[3]")).sendKeys("mh127427");
	   
	   D.findElement(By.xpath("//button[@class=\"_2KpZ6l _2HKlqd _3AWRsL\"]")).click();
		
	
	}

}

