package variousConcepts;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class assignment1 {

	WebDriver driver;

	@Before
	public void launchBrowser() {
		
		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
	
		driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
	
		driver.manage().window().maximize();
		
		driver.get("https://techfios.com/billing/?ng=login");
	}

	@Test
	public void loginTest() throws InterruptedException {
	
		
		driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
	
		driver.findElement(By.id("password")).sendKeys("abc123");
		
		driver.findElement(By.name("login")).click();
		
		WebDriverWait wait= new WebDriverWait(driver,2);
		
		WebElement element1 = driver.findElement(By.linkText("Bank & Cash"));
		JavascriptExecutor executor1 = (JavascriptExecutor) driver;
		executor1.executeScript("arguments[0].click();", element1);
		
		wait.until(ExpectedConditions.elementToBeClickable(By.linkText("New Account")));
		
		WebElement element2 = driver.findElement(By.linkText("New Account"));
		JavascriptExecutor executor2 = (JavascriptExecutor) driver;
		executor2.executeScript("arguments[0].click();", element2);

		//Thread.sleep(1000);
		
		driver.findElement(By.id("account")).sendKeys("Ntavyo Marianne");
		driver.findElement(By.id("description")).sendKeys("Home exepnses ");
		driver.findElement(By.id("balance")).sendKeys("5000");
		driver.findElement(By.id("account_number")).sendKeys("10101010");
		driver.findElement(By.id("contact_person")).sendKeys(" Ntavyo Michel");
		
		WebElement element3 = driver.findElement(By.xpath("html/body/section/div/div[1]/div[3]/div[1]/div/div/div[2]/form/button"));
		JavascriptExecutor executor3 = (JavascriptExecutor) driver;
		executor3.executeScript("arguments[0].click();", element3);
	
		Thread.sleep(10000);
		

	}

@After
	public void tearDown() {
		driver.close();
		driver.quit();
}
}





	
