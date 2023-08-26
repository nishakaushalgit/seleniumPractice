package testPackage;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonTest {
  @Test
  public void f() throws Exception {
	  WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
	//	driver.findElement(By.cssSelector("input[id='twotabsearchtextbox']")).sendKeys("havells water purifier");
		driver.findElement(By.id("nav-hamburger-menu")).click();
		driver.findElement(By.xpath("//div[@id=\"hmenu-content\"]/ul[1]/li[8]/a/div")).click();
		driver.findElement(By.xpath("//*[@id=\"hmenu-content\"]/ul[3]/li[7]//a")).click();
//		driver.findElement(By.id("nav-search-submit-button")).click();
//		Thread.sleep(5000);
//		driver.findElement(By.xpath("//a//span[contains(text(),', First corner mounting design (Patented)|Copper+Zinc+pH Balance+Natural Minerals|5 stage Purification|7L Transparent Tank|RO+UF Purification Tech. (White and Blue)')]")).click();
//		ArrayList<String> windows= new ArrayList<String> (driver.getWindowHandles());
//		driver.switchTo().window(windows.get(1));
//		driver.findElement(By.id("add-to-cart-button")).click();
//		Thread.sleep(3000);
		Assert.assertEquals(driver.getTitle(), "Amazon.in Shopping Cart");
		driver.quit();
		
  }
}
