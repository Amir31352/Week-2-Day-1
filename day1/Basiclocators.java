package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Basiclocators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ChromeOptions options =new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		
		
	ChromeDriver driver = new ChromeDriver(options);
	
    driver.get("http://leaftaps.com/opentaps");
	
	driver.manage().window().maximize();

	driver.findElement(By.id("username")).sendKeys("DemoCSR");
	//enter password
	driver.findElement(By.id("password")).sendKeys("crmsfa");
	//click Login button
	driver.findElement(By.className("decorativeSubmit")).click();
	//to get the title
	String title = driver.getTitle();
	System.out.println(title);
	//to click crmsfa link
	driver.findElement(By.partialLinkText("CRM")).click();
	driver.findElement(By.linkText("Leads")).click();
	driver.findElement(By.linkText("Create Lead")).click();
	driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
	driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Subraja");
	driver.findElement(By.id("createLeadForm_lastName")).sendKeys("S");
	
	
	
	
	}

}
