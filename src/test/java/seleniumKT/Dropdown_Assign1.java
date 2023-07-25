package seleniumKT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_Assign1 {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("https://collegeweeklive.com/go-signup");
		
		//To Maximize current window
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		
		//To select "Iam a" dropdown value as "Student Looking for Graduate Degree"
		
		new Select(driver.findElement(By.name("attendeeType"))).selectByVisibleText("Student Looking for Graduate Degree");
		

	}

}
