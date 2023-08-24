package testPackage;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Locators {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		Thread.sleep(2000);
		driver.findElement(By.name("name")).sendKeys("Nisha Kaushal");
		driver.findElement(By.name("email")).sendKeys("kaushalnisha01@gmail.com");
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("123456");
		driver.findElement(By.cssSelector("input[type='checkbox']")).click();
		WebElement staticDropdown= driver.findElement(By.id("exampleFormControlSelect1"));
		Select dropdown=new Select(staticDropdown);
		dropdown.selectByVisibleText("Female");
		System.out.println(dropdown.getFirstSelectedOption().getText());
		driver.findElement(By.id("inlineRadio1")).click();
		driver.findElement(By.name("bday")).sendKeys("20/01/1989");
		driver.findElement(By.cssSelector("input[class='btn btn-success']")).click();
		System.out.println(driver.findElement(By.cssSelector("div[class=\'alert alert-success alert-dismissible\']")).getText());
		//Assert.assertEquals(driver.findElement(By.cssSelector("div[class=\'alert alert-success alert-dismissible\']")).getText(), "Success! The Form has been submitted successfully!.");
	
		
//		System.out.println(driver.findElement(By.name("checkBoxOption1")).isSelected());
//		driver.findElement(By.name("checkBoxOption1")).click();
//		System.out.println(driver.findElement(By.name("checkBoxOption1")).isSelected());
//		System.out.println(driver.findElement(By.cssSelector("input[type='checkbox']")).getSize());
		driver.quit();
	}

}
