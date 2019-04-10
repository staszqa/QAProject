package dashbord.pro;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class basee {
	public WebDriver driver;

	public  WebDriver  initializerDriver() {
		
		
		System.setProperty("webdriver.chrome.driver", "/Users/stanislavzinchenko/Desktop/browser/chromedriver");

		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
		 driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);

		driver.get("http://192.168.64.2/index.php ");
		
		return driver;
		
		
		
		
		
}
}