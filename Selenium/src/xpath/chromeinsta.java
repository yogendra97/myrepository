package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class chromeinsta {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\chrome driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.instagram.com");
		
		Thread.sleep(2000);
		
		WebElement FN = driver.findElement(By.xpath("//input[@type=\"text\"]"));
		FN.sendKeys("yogendra_3532");
		
		WebElement Pass = driver.findElement(By.xpath("//input[@type=\"password\"]"));
		Pass.sendKeys("mh127427");
		
		WebElement login = driver.findElement(By.xpath("//div[@class=\"            qF0y9          Igw0E     IwRSH      eGOV_         _4EzTm    bkEs3                          CovQj                  jKUp7          DhRcB                                                    \"]"));
		login.click();
		
		
	}

}
