package basic;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefoxfunctions {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Softwares\\gecko driver\\geckodriver-v0.30.0-win32\\geckodriver.exe");
		WebDriver driver =new FirefoxDriver();
		
		driver.get("http://www.google.com/");
		
		Thread.sleep(5000);
		
		//driver.close();
		
		//driver.quit();
		
		String URL=driver.getCurrentUrl();
		System.out.println(URL);
		
		String Title=driver.getTitle();
		System.out.println(Title);
		
		Dimension d=new Dimension(400,500);
		driver.manage().window().setSize(d);
		
		Thread.sleep(5000);
		
		Point P=new Point(500,600);
		driver.manage().window().setPosition(P);
		
		Thread.sleep(5000);
		
		
		driver.quit();
		
		
	}
}
