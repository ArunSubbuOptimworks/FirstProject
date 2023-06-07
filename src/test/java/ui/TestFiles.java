package ui;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.google.common.io.Files;

import Objects.Search;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestFiles {
	
	WebDriver driver;
	
	@BeforeTest
	public void beforetest() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(0,TimeUnit.SECONDS);
		driver.get("https://app.simplelogin.io/auth/login");
	}
    
	@AfterTest
	public void closeBrowser() {
		driver.quit();
	}
	
	@Test
	public void loginOpertaion() throws IOException {
		Search srh = new Search(driver);
		//srh.enterEmailAndPassword("arun.subramani@optimworks.com", "Simple@123");
		 srh.enterEmailAndPassword(System.getenv("username"),System.getenv("password"));
		File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		//-Files.copy(file,new File("C:\\Users\\LENOVO\\Documents\\login.jpg"));
		srh.clickOnLoginButton();
	}
}
