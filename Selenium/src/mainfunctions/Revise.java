package mainfunctions;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class Revise {
	
	public static void main (String[]args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\chrome driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement Create = driver.findElement(By.xpath("(//a[@role=\"button\"])[2]"));
		Create.click();
		
		//selecting month 
		
		WebElement Month=driver.findElement(By.xpath("(//select[@title=\"Month\"])"));
		Select S=new Select(Month);
		
		List<WebElement> Options= S.getOptions();
		
	   for(int i=0;i<Options.size();i++) {
		   
		   String Str=Options.get(i).getText();
		   System.out.println(Str);
		   
		  if (Str.equalsIgnoreCase("Mar")) {
			  
			  S.selectByVisibleText("Mar");
			  
		  }
	   }
	   
	   //takes screenshot
	   
	   File SS = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	   File Dest=new File("C:\\Users\\Dell\\Desktop\\Screenshot\\Revision.jpg");
	   FileHandler.copy(SS, Dest);
	   
	   
		
	}

}
