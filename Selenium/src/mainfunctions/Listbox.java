package mainfunctions;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Listbox {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\chrome driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		
		driver.manage().window().maximize();
		
		WebElement Createacc = driver.findElement(By.xpath("(//a[@role=\"button\"])[2]"));
		Createacc.click();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement FN = driver.findElement(By.xpath("(//input[@type=\"text\"])[2]"));
		FN.sendKeys("Yogendra");
		
		WebElement Month = driver.findElement(By.xpath("//select[@title=\"Month\"]"));
		
		Select S= new Select(Month);
		
		List<WebElement> Options =S.getOptions();
		
		S.selectByIndex(Options.size()-2);
		
		
		
	}

}
