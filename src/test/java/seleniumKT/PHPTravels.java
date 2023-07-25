package seleniumKT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PHPTravels {

	public static void main(String[] args) {
		
        WebDriver driver;
		
		driver = new ChromeDriver();
		
			driver.get("https://phptravels.com/demo/");
			
			// To click on signup button
			
			driver.findElement(By.xpath("//*[@id=\"menu\"]/div[2]/ul/li[2]/a")).click();
	

	}

}
