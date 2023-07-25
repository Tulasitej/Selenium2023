package seleniumKT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_handle {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver;
		driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		//To Maximize current window
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		//To Maximize current window
		//driver.manage().window().minimize();
		
		//click on Create account button
		driver.findElement(By.linkText("Create new account")).click();
		
		Thread.sleep(5000);		
		
		//Dropdown code
		
		new Select(driver.findElement(By.id("month"))).selectByVisibleText("Nov");		
		new Select(driver.findElement(By.id("day"))).selectByVisibleText("14");		
		new Select(driver.findElement(By.name("birthday_year"))).selectByVisibleText("2020");
		

	}

}
