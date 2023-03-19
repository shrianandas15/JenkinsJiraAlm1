package driver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverObject {
	public static RemoteWebDriver driver;
	
	public static void objectCreation(){
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	
}
