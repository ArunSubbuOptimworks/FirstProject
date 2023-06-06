package Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Search {

	WebDriver driver;
	
	public Search(WebDriver driver) {
		this.driver=driver;
	}
	
	By emailField = By.xpath("//label[normalize-space(text())='Email address']/..//input");
	By passwordField = By.id("password");
	By loginButton = By.xpath("//button[normalize-space(text())='Log in']");
	
	public void enterEmailAndPassword(String email,String password) {
		driver.findElement(emailField).sendKeys(email);
		driver.findElement(passwordField).sendKeys(password);
	}
	
	public void clickOnLoginButton() {
		driver.findElement(loginButton).click();
	}
}
