package paralleltesting;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ClassC {
	
	@Parameters("name")
	@Test
	public void printParameter(String name) {
		System.out.println(name);
	}

}
