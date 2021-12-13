package basic;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Edgefunctions {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.edge.driver", "C:\\Softwares\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		
		driver.navigate().to("http://www.google.com/");
		
		Thread.sleep(5000);
		
		//driver.close();
		
		String URL=driver.getCurrentUrl();
		System.out.println(URL);

		String Title=driver.getTitle();
		System.out.println(Title);
		
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		
		
		Dimension d=new Dimension(500,600);
		driver.manage().window().setSize(d);
		
		Thread.sleep(5000);
		
		Point P= new Point(500,600);
		driver.manage().window().setPosition(P);
		
		Thread.sleep(5000);
		
		
		driver.quit();
		
		
	}

}
