package dashbord.pro;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class removeCategory extends basee {
	
	
	@Test 
	public void removeCategor() {
		
		driver= initializerDriver();
		
		//delete category "Personal"
		driver.findElement(By.xpath("//span[contains(text(),'Personal')]")).click();
		
		driver.findElement(By.xpath("//a[contains(text(),'Yes')]")).click();
		
		driver.quit();
		
	}
	
	

}
