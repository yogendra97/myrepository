package mainfunctions;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Listbox2 {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\chrome driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.ebay.com");
		
		driver.manage().window().maximize();
		
		WebElement Home = driver.findElement(By.xpath("(//li[@class=\"hl-cat-nav__js-tab\"])[4]"));
		Home.click();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement Bath = driver.findElement(By.xpath("(//span[@class=\"b-accordion-text\"])[1]"));
		Bath.click();
		
		//Select S=new Select(Bath);
		
		//S.selectByIndex(2);
		
		//List<WebElement> Options= S.getOptions();
		
		//for(int i=0;i<=Options.size();i++) {
			///
	//		String Str=Options.get(i).getText();
		//	System.out.println(Str);
			
		}
		
		
		
		
	}


