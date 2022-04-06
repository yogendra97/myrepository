package paralleltesting;

import org.testng.annotations.Test;

import Testbase.Browserfactory;

public class ClassA extends Browserfactory {
	
	@Test
	public void openfacebook() {
		openBrowser();
		
		driver.get("https:\\www.facebook.com");
		
	}
	
	@Test (groups="mygroup")
	public void printhello() {
		System.out.println("Hello");
	}

}
