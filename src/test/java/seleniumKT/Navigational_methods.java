package seleniumKT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigational_methods {

	public static void main(String[] args) throws InterruptedException {
		
WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		
		driver.findElement(By.linkText("Forgot password?")).click();
		
		//To click on back arrow mark
		driver.navigate().back();
		Thread.sleep(3000);
		
		//To click on forward arrow mark
		driver.navigate().forward();
		//Type any input value as email
		driver.findElement(By.name("email")).sendKeys("jhsefs@.com");
		Thread.sleep(3000);
		
		//To click on refresh icon
		driver.navigate().refresh();
		
		

	}

}
