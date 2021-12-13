package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class firefoxtext {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Softwares\\gecko driver\\geckodriver-v0.30.0-win32\\geckodriver.exe");
		WebDriver D=new FirefoxDriver();
		
		D.get("https://www.facebook.com");
		
		D.findElement(By.xpath("//a[text()=\"Forgotten password?\"]")).click();
		
		//D.findElement(By.xpath("//a[contains(text(),\"Forgotten\")]")).click();
;	}
}
