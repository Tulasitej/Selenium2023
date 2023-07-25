package seleniumKT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gettext_Assin1 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
			
			driver.get("https://www.justrechargeit.com/SignIn.aspx");
			
			driver.findElement(By.name("imgbtnSignin")).click();
			
			Thread.sleep(4000);
			
			//To print the error text to the console we use gettext() method
			
			String Errmsg = driver.findElement(By.name("imgbtnSignin")).getText();
			System.out.println("Errmsg");
			
			//To close the current window on which selenium is running. here the webdriver session remains active
			driver.close();
			
			//To close the all browser windows and ends the webdriver session
			//driver.quit();

	}

}
