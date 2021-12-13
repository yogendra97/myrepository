package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathindex {
	
	//to fill sign up details using xpath by index method
	
	//syntax=(//tagname[@attribute="attribute value"])[index no]
	

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\chrome driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver D=new ChromeDriver();
		
		D.get("https://www.facebook.com/");
		
		D.manage().window().maximize();
		
		WebElement Create = D.findElement(By.xpath("(//a[@role=\"button\"])[2]"));
		Create.click();
		
		Thread.sleep(2000);
		
		//System.out.println(D.getCurrentUrl());
		
		WebElement FN = D.findElement(By.xpath("(//input[@type=\"text\"])[2]"));
		FN.sendKeys("Yogendra");
		

	}

}
