package seleniumKT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Gettext_Assin2 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://blazedemo.com/");
		
		Thread.sleep(2000);
		new Select(driver.findElement(By.name("fromPort"))).selectByVisibleText("San Diego");
		new Select(driver.findElement(By.name("toPort"))).selectByVisibleText("New York");
		Thread.sleep(2000);
		driver.findElement(By.className("btn btn-primary")).click();
		Thread.sleep(2000);
		driver.findElement(By.className("btn btn-small")).click();
		Thread.sleep(2000);
		//To fill the credentials
		driver.findElement(By.id("inputName")).sendKeys("Tulasi");
		driver.findElement(By.id("address")).sendKeys("933 Giacomo Dr");
		driver.findElement(By.id("city")).sendKeys("Waxhaw");
		driver.findElement(By.id("state")).sendKeys("NC");
		driver.findElement(By.id("zipCode")).sendKeys("28173");
		new Select(driver.findElement(By.name("cardType"))).selectByVisibleText("amex");
		driver.findElement(By.id("creditCardNumber")).sendKeys("32135");
		driver.findElement(By.id("creditCardMonth")).sendKeys("11");
		driver.findElement(By.id("creditCardYear")).sendKeys("1354");
		driver.findElement(By.id("nameOnCard")).sendKeys("jhasgdjasu");
		Thread.sleep(2000);
		driver.findElement(By.className("checkbox")).click();
		driver.findElement(By.className("btn btn-primary")).click();
		//To get the "Thank you for purchasing today" text
		Thread.sleep(2000);
		String Thankumsg = driver.findElement(By.className("btn btn-primary")).getText();
		System.out.println("Thankumsg");
		
		
		

	}

}
