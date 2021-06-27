package MavenProject.MavenFeb21;

import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class launchChrome {

	@Test 
	
		public void facebook(){
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver ();
		driver.manage().deleteAllCookies();
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		WebElement username=null;
		username=(WebElement) js.executeScript("return document .getElementById('email');",username);
		username.sendKeys("sonalimalusare.@gmail.com");
		
		
		WebElement password=null;
		password=(WebElement) js.executeScript("return document .getElementById('pass');",password);
		password.sendKeys("123456");
		
	}

}
