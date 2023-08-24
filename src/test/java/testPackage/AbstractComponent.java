package testPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AbstractComponent {
	//from child to parent class send driver by using super(driver)
	WebDriver driver;
	public AbstractComponent(WebDriver driver) {
		this.driver=driver;
	}

	public void waitForElementToAppear(By findBy) {
		WebDriverWait wait= new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.visibilityOfElementLocated(findBy));
	}
	
	public void waitForElementToDisappear(WebElement spinner) {
		WebDriverWait wait= new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.invisibilityOf(spinner));
	}
}
