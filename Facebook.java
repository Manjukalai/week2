package week2.day1.assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		//login and password
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		driver.findElement(By.xpath("(//input[@data-type='text'])[1]")).sendKeys("xxxxxxxx");
		driver.findElement(By.xpath("(//input[@data-type='text'])[2]")).sendKeys("yyyyyyyy");
		driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("1111111111");
		driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("000000000");
		
		//day dropdown
		WebElement date = driver.findElement(By.xpath("//select[@aria-label='Day']"));
		Select day= new Select(date);
		day.selectByVisibleText("22");
		
		//month dropdown
		WebElement months=driver.findElement(By.xpath("//select[@aria-label='Month']"));
		Select month = new Select(months);
		month.selectByIndex(1);
		
		//year dropdown
		WebElement years=driver.findElement(By.xpath("//select[@name='birthday_year']"));
		Select yr=new Select(years);
		yr.selectByValue("2022");
		
		//checkbox
		driver.findElement(By.xpath("(//input[@class='_8esa'])[2]")).click();
		driver.findElement(By.xpath("//button[text()='Sign Up']")).click();
		driver.close();
		
		
		
		
		
		
	}

}
