package seleniumKT;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot_Demo {

	public static void main(String[] args) throws IOException {
		    WebDriver driver = new ChromeDriver();
			
			driver.get("https://retail.onlinesbi.sbi/retail/login.htm");
			driver.manage().window().maximize();
			//Screenshot path
			//String path = ".\\Screenshots\\";
			//Take screenshot of the current window
			File abc = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			//Move to screenshot folder
			FileHandler.copy(abc, new File(".\\Screenshots\\testName.PNG"));
			
			

	}

}