package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathcontains {
	
	public static void main(String[] args) {
		
		//syntax of xpath by contains method=
		//tag name[contains(text(),"keyword to serach")]
		//OR
		//tag name[contains(attribute,"attribute value")]
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\chrome driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver D=new ChromeDriver();
		
		D.manage().window().maximize();
		
		D.get("https://www.facebook.com");
		
		WebElement FP = D.findElement(By.xpath("//a[contains(text() ,\"Forgotten\")]"));
		
		FP.click();
		
		}

}
