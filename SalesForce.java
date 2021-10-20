package week2.day2.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SalesForce {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=70130000000Enyk");

		// maximize the window
		driver.manage().window().maximize();

		// implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)); 

		// first name
		driver.findElement(By.name("UserFirstName")).sendKeys("sathya");
		// last name
		driver.findElement(By.name("UserLastName")).sendKeys("test");
		// mail id
		driver.findElement(By.name("UserEmail")).sendKeys("123@gmail.com");

		// job title drop down
		WebElement jobTitle = driver.findElement(By.name("UserTitle"));
		Select drop_jobTitle = new Select(jobTitle);
		drop_jobTitle.selectByIndex(2);
		
		//company name
		driver.findElement(By.name("CompanyName")).sendKeys("TestLeaf");
		
		// drop down employess
		WebElement employees = driver.findElement(By.name("CompanyEmployees"));
		Select drop_employees = new Select(employees);
		drop_employees.selectByVisibleText("15 - 100 employees");
		
		// phone number
		driver.findElement(By.name("UserPhone")).sendKeys("1234561231");
		
		// check box
		driver.findElement(By.xpath("//div[@class='checkbox-ui']")).click();
		
		// broser close
		driver.close();

	}

}
