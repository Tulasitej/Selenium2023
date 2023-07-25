package seleniumKT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Demo {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		
		//To click on first click me button
		driver.findElement(By.id("alertButton")).click();
		Thread.sleep(3000);
		//Click on ok button on alert
		driver.switchTo().alert().accept();
		
		//To click on second click me button
		driver.findElement(By.id("timerAlertButton")).click();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		
		//To click on third click me button
	    driver.findElement(By.id("confirmButton")).click();
	    Thread.sleep(3000);
	    //Click on cancel button on alert
		driver.switchTo().alert().dismiss();
		
		//To click on second click me button
				driver.findElement(By.id("promtButton")).click();
				Thread.sleep(3000);
						
				driver.switchTo().alert().accept();

	}

}
