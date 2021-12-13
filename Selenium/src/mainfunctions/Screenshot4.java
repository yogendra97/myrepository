package mainfunctions;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot4 {
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\chrome driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.instagram.com");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement Username = driver.findElement(By.xpath("//input[@name=\"username\"]"));
		Username.sendKeys("yogendra_3532");
		
		WebElement Pass = driver.findElement(By.xpath("//input[@name=\"password\"]"));
		Pass.sendKeys("mh127427");
		
		WebElement login=driver.findElement(By.xpath("//div[@class=\"            qF0y9          Igw0E     IwRSH      eGOV_         _4EzTm    bkEs3                          CovQj                  jKUp7          DhRcB                                                    \"]"));
		login.click();
		
         Thread.sleep(15000);
		
		File SS = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File Dest=new File("C:\\Users\\Dell\\Desktop\\Screenshot\\Insta.jpg");
		FileHandler.copy(SS, Dest);
		
	}

}
