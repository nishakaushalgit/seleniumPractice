package testPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage extends AbstractComponent {
	
	WebDriver driver;
	public LandingPage(WebDriver driver) {
		
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(id= "userEmail")
	WebElement username;
	@FindBy(id= "userpassword")
	WebElement password1;
	@FindBy(id= "login")
	WebElement submit;
	
	
	
	public void goTo() {
		driver.get("https://rahulshettyacademy.com/client");
	}
	public ProductCatalogue loginApplication(String email, String password) {
		username.sendKeys(email);
		password1.sendKeys(password);
		submit.click();	
		ProductCatalogue productcatalogue=new ProductCatalogue(driver);
		return productcatalogue;
	}

	
	
	
}
