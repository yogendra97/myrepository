package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathtext {
	
	//syntax of xpath by using text
	
	//tag name[text(),"text which need to be search"]
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\chrome driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver D=new ChromeDriver();	
		
		
		D.get("https://www.facebook.com");
		
		D.manage().window().maximize();
		
	WebElement FP = D.findElement(By.xpath("//a[text()=\"Forgotten password?\"]"));
	FP.click();
	
	}

}
