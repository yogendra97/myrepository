package mainfunctions;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Rev1 {
	
	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\chrome driver\\chromedriver_win32\\chromedriver1.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		
		driver.get("https://www.rediff.com");
		
		driver.switchTo().frame("moneyiframe");
		
		
		String text= driver.findElement(By.id("nseindex")).getText();
		
		System.out.println(text);
		
		driver.switchTo().defaultContent(); 
		
		driver.findElement(By.xpath("(//input[@type=\"text\"])[1]")).sendKeys("Yogendra");
		//iframe1.close();
		
		//driver.switchTo().defaultContent();
	}

}
