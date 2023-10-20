package week2.day1.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Lead {

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

//Select value employee by visible text

WebElement source = driver.findElement(By.id("createLeadForm_dataSourceId"));
Select src=new Select(source);
src.selectByVisibleText("Employee");
//select pay per in marketing 
WebElement marketing = driver.findElement(By.name("marketingCampaignId"));
Select market=new Select(marketing);
market.selectByValue("9001");
//select corporation in ownership tap

WebElement ownership = driver.findElement(By.name("ownershipEnumId"));
Select owner=new Select(ownership);
owner.selectByIndex(5);

WebElement country = driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
Select india = new Select(country);
india.selectByVisibleText("India");

//click createlead button
driver.findElement(By.name("submitButton")).click();
String pageTitle = driver.getTitle();
System.out.println(pageTitle);






	}

}
