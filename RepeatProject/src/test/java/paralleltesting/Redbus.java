package paralleltesting;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Testbase.Browserfactory;

public class Redbus extends Browserfactory {

	@Test
	public void openbrowser() {
		openBrowser();
		
		driver.get("https://www.redbus.in/");
		
		driver.findElement(By.xpath("//input[@data-message=\"Please enter a source city\"]"));
	}
}
