package mainfunctions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicitwait {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\chrome driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com");
		
		WebElement Createacc = driver.findElement(By.xpath("(//a[@role=\"button\"])[2]"));
		Createacc.click();
		
		WebDriverWait Wait=new WebDriverWait(driver, 10);
		WebElement FN = Wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@type=\"text\"])[2]")));
		FN.sendKeys("Yogendra");
	}

}
