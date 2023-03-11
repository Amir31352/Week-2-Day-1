package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class LauanchApplication {

	public static void main(String[] args) {
		
		ChromeOptions options =new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		
		
	ChromeDriver driver = new ChromeDriver(options);
	
	
	driver.get("https://www.facebook.com/");
	
	driver.manage().window().maximize();
	
	driver.close();

	}

}
