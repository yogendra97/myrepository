package basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class OpenIE {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.ie.driver","C:\\Softwares\\IEDriverServer_x64_3.14.0\\IEDriverServer.exe" );

		WebDriver driver=new InternetExplorerDriver();
		
		driver.get("http:\\\\www.google.com");
		
	}

}
