package basic;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chromefunctions {
	
	public static void main(String[] args) throws InterruptedException {
		

	System.setProperty("webdriver.chrome.driver","C:\\Softwares\\chrome driver\\chromedriver_win32\\chromedriver.exe");
	
	ChromeDriver driver =new ChromeDriver();
	
	
	//to open any website
	
	
	//driver.get("https://www.facebook.com/");
	
	
	driver.navigate().to("https://www.facebook.com/");
	driver.navigate().refresh();
	
	//to freeze application for specific period of time
	
	Thread.sleep(5000);
	
	//to close the application if one window is running
	
	//driver.close();
	
	//to close the app when more than one website are running
	
	//driver.quit();
	
	//to get the current URL
	
	String URL=driver.getCurrentUrl();
	System.out.println(URL);
	
	//to get title of current website
	
	String Title=driver.getTitle();
	
	System.out.println(Title);
	
	//to  maximize the window of browser
	
	driver.manage().window().maximize();
	
	//to manage the dimensions of browser
	
	Dimension d = new Dimension(200,300);
	driver.manage().window().setSize(d);
	
	//to manage the position of browser window
	
	Point P=new Point(400,500);
	driver.manage().window().setPosition(P);
	
	
	
	
	
	
}
}