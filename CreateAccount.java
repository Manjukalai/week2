package week2.day1.assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		//login and password
		
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		//click creat acc
		driver.findElement(By.linkText("Create Account")).click();
		
		
		//enter acc name field by xpath
		driver.findElement(By.xpath("//input[@id='accountName']")).sendKeys("Debit Limited Account");
		//describtion by xpath
		driver.findElement(By.xpath("//textarea[@class='inputBox']")).sendKeys("Selenium Automation Tester");
		//local name by xpath index
		driver.findElement(By.xpath("(//input[@class='inputBox'])[3]")).sendKeys("Manju");
		//site name by xpath
		driver.findElement(By.xpath("(//input[@maxlength='100'])[2]")).sendKeys("site");
		//enter annual revenue by xpath
		driver.findElement(By.xpath("(//input[@class='inputBox'])[5]")).sendKeys("20 lakhs");
		
		//by linktext
		WebElement industry = driver.findElement(By.xpath("//select[@name='industryEnumId']"));
		Select ind=new Select(industry);
		ind.selectByVisibleText("Distribution");
		
		//select owneship by visible text
		WebElement ownership = driver.findElement(By.name("ownershipEnumId"));
		Select owner=new Select(ownership);
		owner.selectByVisibleText("S-Corporation");
		
//employee by selecting selectbyvalue
		
		WebElement source = driver.findElement(By.xpath("//select[@id='dataSourceId']"));
		Select employ=new Select(source);
		employ.selectByValue("LEAD_EMPLOYEE");
		
		//marketing site ecommerse site by index
		WebElement marketing = driver.findElement(By.xpath("//select[@id='marketingCampaignId']"));
		Select market=new Select(marketing);
		market.selectByIndex(6);

		//select state as texas
		WebElement state = driver.findElement(By.xpath("//select[@id='generalStateProvinceGeoId']"));
		Select texas=new Select(state);
		texas.selectByVisibleText("Texas");
		
		//click submit
		driver.findElement(By.xpath("//input[@onclick='submitFormWithSingleClick(this)']")).click();
		
		
	}

}
