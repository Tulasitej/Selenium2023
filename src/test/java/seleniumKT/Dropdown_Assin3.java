package seleniumKT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_Assin3 {

	public static void main(String[] args) throws InterruptedException {
		
         WebDriver driver = new ChromeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		
		//To select any country  
		
		new Select(driver.findElement(By.id("country"))).selectByVisibleText("United States");
		
		
		

	}

}
