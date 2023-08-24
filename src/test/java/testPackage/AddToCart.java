package testPackage;

import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AddToCart {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("password")).sendKeys("learning");
		driver.findElement(By.cssSelector("input[value='user']")).click();
		WebDriverWait wait=new WebDriverWait(driver, 3000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("okayBtn")));
		driver.findElement(By.id("okayBtn")).click();
		WebElement options=driver.findElement(By.cssSelector("select[class='form-control']"));
		Select dropdown=new Select(options);
		dropdown.selectByValue("consult");
		driver.findElement(By.cssSelector("[type='checkbox']")).click();
		driver.findElement(By.cssSelector("[value='Sign In']")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.partialLinkText("Checkout")));
		
		List<WebElement> actualproducts= driver.findElements(By.xpath("//h4/a"));
		ArrayList<String> al1 = new ArrayList<>();
		for(int i=0;i<actualproducts.size();i++) {
			al1.add(actualproducts.get(i).getText());	
		}
		List<WebElement> products= driver.findElements(By.xpath("//*[@class='card-footer']/button"));
		for(int i=0;i<products.size();i++) {
			products.get(i).click();	
		}
		driver.findElement((By.partialLinkText("Checkout"))).click();
		List<WebElement> cartproducts= driver.findElements(By.xpath("//h4/a"));
		ArrayList<String> al2 = new ArrayList<>();
		for(int i=0;i<cartproducts.size();i++) {
			al2.add(cartproducts.get(i).getText());	
		}
		System.out.println("products are: " +al1);
		System.out.println("cart products are: " +al2);
		Assert.assertTrue(al1.size()==al2.size() && al1.containsAll(al2) && al2.containsAll(al1));
		driver.quit();
	}
}
