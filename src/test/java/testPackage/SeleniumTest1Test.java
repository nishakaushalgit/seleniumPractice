package testPackage;

import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumTest1Test {
	@Test
	public void f() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		String name = "rahul";
		driver.findElement(By.id("inputUsername")).sendKeys(name);
		driver.findElement(By.name("inputPassword")).sendKeys("12345");
		driver.findElement(By.className("signInBtn")).click();
		driver.findElement(By.cssSelector("p.error")).getText();
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("John");
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("john@rsa.com");
		driver.findElement(By.xpath("//input[@placeholder='Phone Number']")).sendKeys("1234567890");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class='reset-pwd-btn']")).click();
		Thread.sleep(2000);
		String text = driver.findElement(By.xpath("//p[@class='infoMsg']")).getText();
		System.out.println(text);
		driver.findElement(By.xpath("//button[@class='go-to-login-btn']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("inputUsername")).sendKeys("rahul");
		driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");
		driver.findElement(By.xpath("//input[@value='agreeTerms']")).click();
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		driver.findElement(By.tagName("p")).getText();
//		String loginMessage = driver.findElement(By.xpath("//button[@class='logout-btn']/preceding-sibling::p")).getText();
//		System.out.print(loginMessage);
		Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in...");
		// Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are
		// successfully logged in.");
		// Assert.assertEquals(driver.findElement(By.tagName("h2")).getText(),"Hello
		// "+name+",");

		driver.quit();
	}
}
