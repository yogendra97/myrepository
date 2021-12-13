package mainfunctions;

import java.io.File;
import java.io.IOException;


import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;



public class Screenshot2 {
	
	
	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\chrome driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.flipkart.com");
		
		driver.manage().window().maximize();
		
		WebElement FN = driver.findElement(By.xpath("(//input[@type=\"text\"])[2]"));
		
		FN.sendKeys("Yogendra");
		
		WebElement Pass = driver.findElement(By.xpath("(//input[@type=\"password\"])"));
		Pass.sendKeys("Yogendra");
		
		///now take a screenshot of data u filled 
		
		File SS = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
	     String Str=RandomString.make(2);		//to change the name of screenshot saved
	
		File dest=new File("C:\\Users\\Dell\\Desktop\\Screenshot\\Screenshot"+Str+".jpeg");
		
		FileHandler.copy(SS, dest);
	}

}
