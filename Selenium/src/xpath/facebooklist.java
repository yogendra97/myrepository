package xpath;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class facebooklist {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\chrome driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		
		WebElement createacc = driver.findElement(By.xpath("(//a[@role=\"button\"])[2]"));
		createacc.click();
		
		Thread.sleep(2000);
		
		WebElement date = driver.findElement(By.xpath("//select[@title=\"Day\"]"));
		Select S=new Select(date);
		
		S.selectByVisibleText("30");
		
		WebElement Month=driver.findElement(By.xpath("//select[@title=\"Month\"]"));
		Select S1=new Select(Month);
		
		String B=S1.getFirstSelectedOption().getText();
		System.out.println(B);
		
		
	 	List<WebElement> A=S1.getOptions();
		
		for(int i=0;i<A.size();i++)
		{
			String Str=A.get(i).getText();
			System.out.println(Str);
			if(Str.equalsIgnoreCase("mar")) {
				S1.selectByVisibleText("Mar");
				
		}
			
			WebElement year = driver.findElement(By.xpath("//select[@title=\"Year\"]"));
			Select S2=new Select(year);
			
			S2.selectByVisibleText("1997");
	
			
		}
		
		
		
		
	}

}
