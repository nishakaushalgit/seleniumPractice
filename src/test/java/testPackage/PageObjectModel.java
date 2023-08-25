package testPackage;
import java.util.concurrent.TimeUnit;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PageObjectModel {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		String productName= "ZARA COAT 3";
		LandingPage landingpage= new LandingPage(driver);
		landingpage.goTo();
		ProductCatalogue productcatalogue=landingpage.loginApplication("anshika@gmail.com","Iamking@000");
		//List<WebElement> products=productcatalogue.getProductList();
		//productcatalogue.getProductByName(productName);
//		CartPage cartpage= productcatalogue.addToCart(productName);
//		Boolean match=cartpage.verifyProductDisplayed(productName);
//		Assert.assertTrue(match);
		//Checkout checkout= cartpage.goTocheckoutPage();
		
		
		
	}
	}	