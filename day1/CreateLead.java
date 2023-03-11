package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class CreateLead {

	public static void main(String[] args) throws InterruptedException {
		
		

		ChromeOptions options =new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		
		
		ChromeDriver driver= new ChromeDriver(options);
		//1. Launch URL "http://leaftaps.com/opentaps/control/login"
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		driver.manage().window().maximize();
		
		//2. Enter UserName and Password Using Id Locator
		driver.findElement(By.id("username")).sendKeys("DemoCSR");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		Thread.sleep(3000);
		
		//3. Click on Login Button using Class Locator
        driver.findElement(By.className("decorativeSubmit")).click();
		
        //4. Click on CRM/SFA Link
        driver.findElement(By.linkText("CRM/SFA")).click();
        
        //5. Click on Leads Button
        driver.findElement(By.linkText("Leads")).click();
        
        //6. Click on Create Lead 
        driver.findElement(By.linkText("Create Lead")).click();
        
        //7. Enter CompanyName Field Using id Locator
        driver.findElement(By.id("createLeadForm_companyName")).sendKeys("RBS Bank");
        
        //8. Enter FirstName Field Using id Locator
        driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Amir");
        
        //9. Enter LastName Field Using id Locator
        driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Farooq");
		
		 //10. Enter FirstName(Local) Field Using id Locator
        driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Satti");
		
		// 11. Enter Department Field Using any Locator of Your Choice
        driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Accounts");
		
		// 12. Enter Description Field Using any Locator of your choice 
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Check the Criteria");

		//13. Enter your email in the E-mail address Field using the locator of your choice
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("satti.amir@gmail.com");

		// 14. Select State/Province as NewYork Using Visible Text
		WebElement State=driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		
		Select st =new Select(State);
		st.selectByVisibleText("New York");
		
		// 15. Click on Create Button
        driver.findElement(By.className("smallSubmit")).click();

		 //16. Click on edit button
         driver.findElement(By.linkText("Edit")).click();

         // 17. Clear the Description Field using .clear()
		 driver.findElement(By.id("updateLeadForm_description")).clear();	
 		 
         //18. Fill ImportantNote Field with Any text
		 driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("Your Important Information is store");

		 //19. Click on update button 
		 driver.findElement(By.name("submitButton")).click();

         // 20. Get the Title of Resulting Page. refer the video  using driver.getTitle()
         String title=driver.getTitle();
		 System.out.println(title);


	}

}
