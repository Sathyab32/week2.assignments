package week2.day2.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
import java.time.Duration;

public class faceBook {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");

		// maximize the window
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)); // implicit wait

		// create new account
		driver.findElement(By.xpath("//a[contains(text(),'Create New Account')]")).click();

		// enter the first name
		driver.findElement(By.name("firstname")).sendKeys("Sathya");
		driver.findElement(By.name("lastname")).sendKeys("TestLeaf");

		// enter the date of birth
		driver.findElement(By.name("reg_email__")).sendKeys("8344031549");

		driver.findElement(By.name("reg_passwd__")).sendKeys("crmsfa");

		// dropdown for day
		WebElement elementDay = driver.findElement(By.name("birthday_day"));
		Select dropDown1 = new Select(elementDay);
		dropDown1.selectByIndex(9);

		// dropdown for month
		WebElement elementMonth = driver.findElement(By.name("birthday_month"));
		Select dropDown2 = new Select(elementMonth);
		dropDown2.selectByIndex(3);

		// dropdown for year
		WebElement elementYear = driver.findElement(By.name("birthday_year"));
		Select dropDown3 = new Select(elementYear);
		dropDown3.selectByIndex(9);
		
		//click on radio button
		driver.findElement(By.xpath("//input[@value='1']")).click();

	}
}
