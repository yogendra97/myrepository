package basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Openfirefox {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Softwares\\gecko driver\\geckodriver-v0.30.0-win32\\geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("http:\\www.google.com");
	}
}
