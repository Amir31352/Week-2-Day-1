package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class EditLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeOptions options =new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		
		
		ChromeDriver driver= new ChromeDriver(options);
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("DemoCSR");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		Thread.sleep(3000);
		driver.findElement(By.className("decorativeSubmit")).click();

        driver.findElement(By.linkText("CRM/SFA")).click();
        driver.findElement(By.linkText("Leads")).click();
        driver.findElement(By.linkText("Create Lead")).click();
        driver.findElement(By.id("createLeadForm_companyName")).sendKeys("RBS Bank");
        driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Amir");
        driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Farooq");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Satti");
		WebElement source=driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select sec = new Select(source);
		sec.selectByIndex(6);
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Accounts");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Check the Criteria");

        driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("satti.amir@gmail.com");
		WebElement State=driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		
		Select st =new Select(State);
	    st.selectByVisibleText("New York");

		 driver.findElement(By.className("smallSubmit")).click();
         driver.findElement(By.linkText("Edit")).click();
 		 driver.findElement(By.id("updateLeadForm_description")).clear();	
 		 
 		Thread.sleep(3000);

         driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("Your Important Information is store");
         driver.findElement(By.name("submitButton")).click();
		 String title=driver.getTitle();
		 System.out.println(title);

	}

}
