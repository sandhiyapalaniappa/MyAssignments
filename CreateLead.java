package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup(); 
		 ChromeDriver driver=new ChromeDriver();
		 driver.get("http://leaftaps.com/opentaps/control/main");
		 driver.manage().window().maximize();
		    driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
			driver.findElement(By.id("password")).sendKeys("crmsfa");
			driver.findElement(By.className("decorativeSubmit")).click();
			driver.findElement(By.linkText("CRM/SFA")).click();
			driver.findElement(By.linkText("Leads")).click();
			driver.findElement(By.linkText("Create Lead")).click();
			driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
			driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Sandhiya");
			driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Palaniappa");
			//driver.findElement(By.className("smallSubmit")).click();
			driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Accountant");
			driver.findElement(By.id("createLeadForm_description")).sendKeys("Accounts Field");
			driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("sandhiyapalaniappa@gmail.com");
			driver.findElement(By.className("smallSubmit")).click();
	}

}
