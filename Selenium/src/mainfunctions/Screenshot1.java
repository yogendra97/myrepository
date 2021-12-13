package mainfunctions;



import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot1 {
	
	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\chrome driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com");
		
		///to take screenshot follow the below steps
		
	File SS= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	File dest=new File("C:\\Users\\Dell\\Desktop\\Screenshot\\SS.jpg");
	FileHandler.copy(SS, dest);
		
	
	}

}
