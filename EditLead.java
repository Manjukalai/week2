package week2.day1.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditLead {

	

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		//login and password
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		String title = driver.getTitle();
		System.out.println(title);
		driver.findElement(By.partialLinkText("CRM/SFA")).click();

		// go to leads and find leads
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		//find lead name vaishu
		
		driver.findElement(By.xpath("//input[@id='ext-gen248']")).sendKeys("vaishu");
		driver.findElement(By.linkText("vaishu")).click();
		String titl = driver.getTitle();
		System.out.println(titl);
		//go to edit
		
		driver.findElement(By.linkText("Edit")).click();
		//how to overwrite the text

		driver.findElement(By.id("updateLeadForm_companyName")).clear();
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("Testleaf solution");
		//submit
		driver.findElement(By.className("smallSubmit")).click();
		// get the company name
		String text = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		System.out.println(text);

	}

}
