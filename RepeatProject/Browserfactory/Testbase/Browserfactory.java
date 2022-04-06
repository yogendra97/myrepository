package Testbase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browserfactory {
	
	public WebDriver driver;
	
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Eclipse workspace\\RepeatProject\\drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		
	}

}
