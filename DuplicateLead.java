package week2.day1.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateLead {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		String title = driver.getTitle();
		System.out.println(title);
		driver.findElement(By.partialLinkText("CRM/SFA")).click();

		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("manju");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("manju");
		
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("ManjuKalai");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("devops");
		driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("Description");
		
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("xxx@gmail.com");
		driver.findElement(By.className("smallSubmit")).click();
		
	}

}
