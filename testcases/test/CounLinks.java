package dashbord.pro;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class CounLinks extends basee {

	@Test
	public void Links() {
		
		driver= initializerDriver();
		 
		//count Links on the page 
		System.out.println("CountLInkks = " + driver.findElements(By.tagName("a")).size());
		
		 driver.quit();
		 
		
		
	}
}
