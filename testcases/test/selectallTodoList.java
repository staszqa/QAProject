package dashbord.pro;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class selectallTodoList extends basee {
	
	@Test
	public void Selecttodo() {
		
		driver= initializerDriver();
		//select all Todo list
		driver.findElement(By.xpath("//*[@value='on']")).click();
		//click on category 
		driver.findElement(By.xpath("//span[contains(text(),'Leisure')]")).click();
		
		driver.navigate().back();

		
		//check if "Taggle all" selected Shoud be "True"
		System.out.println(driver.findElement(By.xpath("//*[@value='on']")).isSelected());
		
		
		driver.quit();
	}

}
