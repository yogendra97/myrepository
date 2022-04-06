package paralleltesting;

import org.testng.annotations.Test;

public class ClassB {

	
	@Test (groups="mygroup")
	public void printname() {
		System.out.println("Yogendra");
	}
}
