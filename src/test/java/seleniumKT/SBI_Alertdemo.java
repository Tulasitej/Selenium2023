package seleniumKT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SBI_Alertdemo {

	public static void main(String[] args) throws InterruptedException {
		
        WebDriver driver = new ChromeDriver();
		
		driver.get("https://retail.onlinesbi.sbi/retail/login.htm");
		driver.manage().window().maximize();
		
		//To click on Continue to login link
		driver.findElement(By.linkText("CONTINUE TO LOGIN")).click();
		Thread.sleep(3000);
		//To click on login button without filling any data
		driver.findElement(By.id("Button2")).click();
		Thread.sleep(3000);
		//Get the alert text and print into the console
		System.out.println(driver.switchTo().alert().getText());
		//Click on ok button on alert
		driver.switchTo().alert().accept();

		
		//Click on activate hyperlink, system will display confirmation alert
		driver.findElement(By.partialLinkText("New User ?")).click();
		Thread.sleep(3000);
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().dismiss();
		
	}

}
 