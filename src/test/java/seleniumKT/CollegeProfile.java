package seleniumKT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CollegeProfile {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver;
		
		driver = new ChromeDriver();
		
			driver.get("https://collegeweeklive.com/go-signup/");
			
			//Wait statement is needed to avoid synchronization
			
			Thread.sleep(5000);
		
			driver.findElement(By.name("firstName")).sendKeys("Tulasi");
		
			driver.findElement(By.name("lastName")).sendKeys("tej");
		
			driver.findElement(By.name("emailAddress")).sendKeys("Tulasi@gmail.com");
			
			driver.findElement(By.name("phoneNumber")).sendKeys("012345678");
			
			driver.findElement(By.name("password")).sendKeys("sdfg56");
			
			driver.findElement(By.name("ConfirmPassword")).sendKeys("sdfg56");

			driver.findElement(By.id("submit")).click();
			
			//To click on three check boxes
			
			driver.findElement(By.id("questions[q_135]")).click();
			
			driver.findElement(By.id("questions[q_136]")).click();
			
			driver.findElement(By.id("questions[q_137]")).click();
			
			//To click on terms and conditions on the bottom of the page
			
			Thread.sleep(5000);
			
			driver.findElement(By.xpath("//*[@id=\"termsOfService\"]/a")).click();
	}

}
