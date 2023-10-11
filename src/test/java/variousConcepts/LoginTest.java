package variousConcepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

	public class LoginTest {
		
	public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.driver ","C:\\Users\\claud\\SeleniumApril2023\\crm1\\driver\\chromedriver.exe");
		//System.setProperty("webdriver.chrome.driver ","driver\\chromedriver.exe");
		
		System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
	
		WebDriver driver = new ChromeDriver();
		// clear cookies
		driver.manage().deleteAllCookies();
		
		driver.get("http://www.techfios.com/billing/?ng=admin/");
		driver.manage().window().maximize();
		// manage time
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
		driver.findElement(By.name("password")).sendKeys("abc123");
		driver.findElement(By.name("login")).click();
		driver.quit();
		
		
		
		

		
	}
		
		
		

}
