package seleniumKT;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class justRechargeIt {

	public static void main(String[] args) {
	//	1. Open chrome browser
		
		WebDriver driver = new ChromeDriver();
		
	//	2. Type justrechargeit url
		
		driver.get("https://www.justrechargeit.com/");
		
	//	3. To close the page
		
		driver.close();
		
	

	}

}
