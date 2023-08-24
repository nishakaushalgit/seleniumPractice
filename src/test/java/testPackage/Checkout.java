package testPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Checkout extends AbstractComponent{

	WebDriver driver;
	public Checkout(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

}
