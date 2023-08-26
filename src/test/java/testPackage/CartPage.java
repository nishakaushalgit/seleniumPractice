package testPackage;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage extends AbstractComponent {

	WebDriver driver;

	public CartPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}
	
	@FindBy(css=".totalRow button")
	WebElement checkoutele;
	@FindBy(css=".cartSection h3")
	List<WebElement> productTitles;
	
	
	public Checkout goTocheckoutPage() {
		checkoutele.click();
		Checkout checkout= new Checkout(driver);
		return checkout;
		
	}

//	public Boolean verifyProductDisplayed(String productName) {
//		Boolean match=productTitles.stream().anyMatch(product->product.getText().equalsIgnoreCase(productName));
//		return match;
//	}
}
