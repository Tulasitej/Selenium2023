package seleniumKT;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot_Timestamp {

	public static void main(String[] args) throws IOException {
		
WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		
		    //To get the system date and time
			Date d = new Date();
			DateFormat df = new SimpleDateFormat("yyyyMMdd_HHmmss");
			String timeStamp = df.format(d);

			// Screenshot path
			/* String path = ".\\Screenshots\\"; */

			// Take Screenshot of current window/browser
			File abc = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			// move it to specific folder
			FileHandler.copy(abc, new File(".\\Screenshots\\testName"+timeStamp+".PNG"));
				

	}

}
