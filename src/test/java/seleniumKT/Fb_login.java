package seleniumKT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fb_login {

	public static void main(String[] args) {
		
        //  1. Open chrome browser
			WebDriver driver = new ChromeDriver();
		//	2. Type fb url
			driver.get("https://www.facebook.com/");
		//	3. Type invalid email id
			driver.findElement(By.name("email")).sendKeys("abc.123@gmail.com");
		//	4. Type invalid password
			driver.findElement(By.name("pass")).sendKeys("234erty");
		//  5.CLick on login button
			driver.findElement(By.name("login")).click();
		//	6. To close the page
		//	driver.close();

	}

}
