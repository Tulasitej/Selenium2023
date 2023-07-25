package seleniumKT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Auto_test_data {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		//Open Auto test data URL
		
		driver.get("https://autotestdata.com/");
		
		//To click on footer link Need Help?
		
		driver.findElement(By.xpath("/html/body/div[2]/div[1]/ul/li[6]/a")).click();

	}

}
