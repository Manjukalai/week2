package week2.day1.assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		//login and password
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		
		//click leads by xpath
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		
		
		//?capture the lead id of first resulting lead
		WebElement lead = driver.findElement(By.xpath("//a[text()='Vidhya']"));
		WebElement idDeleted = driver.findElement(By.xpath("//a[text()='10320']"));
		
		String txt = idDeleted.getText();
		System.out.println(txt);
		
		lead.click();
		
		driver.findElement(By.xpath("//a[text()='Delete']")).click();
		
		//click find lead
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();   
	
		//lead id by xpath of child to parent
		driver.findElement(By.xpath("(//input[contains(@class,' x-form-text x-form-field')])[28]")).sendKeys(txt);
		
		//click find submit button
		driver.findElement(By.xpath("(//button[contains(@class,'x-btn-text')])[7]")).click();
		//no record to display
		WebElement record= driver.findElement(By.xpath("//div[text()='No records to display']"));
		String rec = record.getText();
		
		if(rec.equalsIgnoreCase("No records to display"))
		{
			System.out.println("Lead was deleted");
		}
		else
		{
			System.out.println("Lead was not deleted");
		}
		
		}
	}


