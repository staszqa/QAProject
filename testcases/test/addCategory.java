package dashbord.pro;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;


public class addCategory extends basee {
	@Test
	public void addCategor() throws InterruptedException {
		driver= initializerDriver();
		
		//click on field category  and tepe "Programming"
			Actions action = new Actions(driver);

action.moveToElement(driver.findElement(By.xpath("//*[@name='data']"))).click().keyDown(Keys.SHIFT).sendKeys("Programming").build().perform();
Thread.sleep(3000);
		//Select category 
		 WebElement ele = driver.findElement(By.xpath("//*[@name='category']"));
		 
		 Select sel = new Select(ele);
				 sel.selectByIndex(3);
				 
				 
				 //Select due data 
				 WebElement ele1 = driver.findElement(By.xpath("//select[@name='due_day']"));
				 
				 Select sel1 = new Select(ele1);
				 sel1.selectByValue("24");
				 
				 //Select month 
				 WebElement ele2 = driver.findElement(By.xpath("//select[@name='due_month']"));
				 
				 Select sel2 = new Select(ele1);
				 sel1.selectByIndex(4);
				 
				 //Add category 
				 driver.findElement(By.xpath("//*[@value='Add']")).click();
				 
				 driver.navigate().back();
				Thread.sleep(3000);
				
				
			driver.quit();
				 }
					
				 
		 
		 
		 
		
		
	}


