package basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Openedge {
	
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.edge.driver", "C:\\Softwares\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver =new EdgeDriver();
		
		driver.get("http:\\www.google.com");
	}

}
