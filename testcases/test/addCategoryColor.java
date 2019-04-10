package dashbord.pro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class addCategoryColor extends basee {
	
	
	@Test
	public void addCategoryColor() {
		
		
		driver.findElement(By.xpath("//*[@name='categorydata']")).click();
		// type in the field Selenium java
		driver.findElement(By.xpath("//*[@name='categorydata']")).sendKeys("Selenium Java");
		// create WebElement with color  
		WebElement element = driver.findElement(By.xpath("//*[@name='colour']"));
		//Select a value from drop down
		Select select = new Select(element);
		select.selectByValue("#FFFF00");
		
		driver.findElement(By.xpath("//*[@value='Add category']")).click();
		
		driver.quit();
		
 
	}
}
