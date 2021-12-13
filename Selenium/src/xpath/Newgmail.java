package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Newgmail {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\chrome driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver Driver=new ChromeDriver();
		
		Driver.get("https://www.gmail.com");
		
		Driver.manage().window().maximize();
		
		WebElement CreateAcc = Driver.findElement(By.xpath("//span[text()=\"Create account\"]"));		//create account click
		CreateAcc.click();
		
		WebElement Choice = Driver.findElement(By.xpath("//span[text()=\"For myself\"]"));				//click on for myself
		Choice.click();
		
		Thread.sleep(2000);
		
		WebElement Firstname = Driver.findElement(By.xpath("(//input[@type=\"text\"])[1]"));		//firstname
		Firstname.sendKeys("Yog");
		
		WebElement Lastname=Driver.findElement(By.xpath("(//input[@type=\"text\"])[2]"));		//lastname
		Lastname.sendKeys("Chaudhari");
		
		Thread.sleep(2000);
		
		Firstname.clear();							///clear the first entered value 
		
		Firstname.sendKeys("Yogendra");				///enter the different value on cleared field
		
	  //WebElement Email= Driver.findElement(By.xpath("//input[@type=\"email\"]"));			//email field
	  //Email.sendKeys("yogendrachaudhari7427");
		
		WebElement  Password= Driver.findElement(By.xpath("(//input[@type=\"password\"])[1]"));		//password
		Password.sendKeys("mh127427");
		
		WebElement Password1= Driver.findElement(By.xpath("(//input[@type=\"password\"])[2]"));			//confirm password
		Password1.sendKeys("mh127427");
		
		WebElement Check = Driver.findElement(By.xpath("//input[@type=\"checkbox\"]"));			//checkbox
		boolean Result = Check.isSelected();
		
		if(Result==true) {
			System.out.println("Checkbox is filled");
		}else {
			Check.click();
		}
		
		WebElement Header= Driver.findElement(By.xpath("//span[text()=\"Create your Google Account\"]"));		////GET TEXT METHOD
		 String str=Header.getText();
		if(str.equals("Create your Google Account"))			//we cant use operator here , we need to use equals method of string
		 {
			System.out.println("the text on the webpage correct");
		}
		else {
			System.out.println("the text on webpage is wrong");
		}
		
		
		WebElement Nextbutton= Driver.findElement(By.xpath("//div[@class=\"VfPpkd-RLmnJb\"]"));		///is displayed method
		boolean Result1 = Nextbutton.isDisplayed();
		
		if (Result1==true) {
			System.out.println("Next button is displayed");
		}
		else {
			System.out.println("Next button is not displayed");
		}
		
		
		
		
		
		
		
		
	}

}
