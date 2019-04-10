package dashbord.pro;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class removeFromTodoList extends basee {

	@Test
	public void remove() {
		
		driver= initializerDriver();
		
		driver.findElement(By.xpath("//*[@name='todo[2]']")).click();
		
		System.out.println(driver.findElement(By.xpath("//*[@name='todo[2]']")).isEnabled());

		driver.findElement(By.xpath("//*[@value='on']")).click();
		
		System.out.println(driver.findElement(By.xpath("//input[@value='on']")).isSelected());

		
		driver.findElement(By.xpath("//input[@value='Remove']")).click();
		
		
		driver.quit();
		

		
		
	}
}
