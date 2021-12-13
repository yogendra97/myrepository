package xpath;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Chromedropdown {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\chrome driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		WebElement createacc = driver.findElement(By.xpath("(//a[@role=\"button\"])[2]"));
		createacc.click();
		
		Thread.sleep(2000);
		
		WebElement DOB = driver.findElement(By.xpath("//select[@title=\"Day\"]"));
		Select S=new Select(DOB);
		
		List<WebElement> options=S.getOptions();
		
		for(int i=0;i<options.size();i++) {
			String Str=options.get(i).getText();
			System.out.println(Str);
			
			if(Str.equalsIgnoreCase("30")) {
				S.selectByVisibleText("30");
			}
		}
	}

}
