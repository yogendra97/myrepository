package xpath;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Fbdropdown {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Softwares\\\\chrome driver\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com");
		
		WebElement createacc = driver.findElement(By.xpath("(//a[@role=\"button\"])[2]"));
		createacc.click();
		
		Thread.sleep(2000);
		
		WebElement FN = driver.findElement(By.xpath("(//input[@type=\"text\"])[2]"));
		FN.sendKeys("Yogendra");
		
		WebElement LN = driver.findElement(By.xpath("(//input[@type=\"text\"])[3]"));
		LN.sendKeys("Chaudhari");
		
		WebElement Pass = driver.findElement(By.xpath("(//input[@type=\"password\"])[2]"));
		Pass.sendKeys("Yogendra");
		
		WebElement DOB = driver.findElement(By.xpath("//select[@title=\"Day\"]"));   //select DOB by visible text method
		Select S=new Select(DOB);
		
		S.selectByVisibleText("30");
		
		WebElement Month =driver.findElement(By.xpath("//select[@title=\"Month\"]"));
		Select S1=new Select(Month);
		List<WebElement> Options=S1.getOptions();
		
		for(int i=0;i<Options.size();i++)
		{
			String Str=Options.get(i).getText();
			System.out.println(Str);
			if(Str.equalsIgnoreCase("Mar"))
			{
				S1.selectByVisibleText("Mar");
			}
		}
		
		WebElement Year = driver.findElement(By.xpath("//select[@title=\"Year\"]"));
		Select S2=new Select(Year);
		 S2.selectByVisibleText("1997");
		 
		 WebElement Radio = driver.findElement(By.xpath("//label[text()=\"Male\"]"));
		 Radio.click();
		
		
		
		
		
		
	}

}
