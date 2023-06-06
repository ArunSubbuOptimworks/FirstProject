package ui;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleAutomation {
	public static WebDriver driver;
    public static void main(String args[]) throws InterruptedException {
    	//System.setProperty("webdriver.chrome.driver","D:\\chrome driver Installation folder\\chromedriver.exe");
    	WebDriverManager.chromedriver().setup();
    	 driver = new ChromeDriver();
    	driver.get("https://admin.finlink-staging.de");
    	driver.manage().window().maximize();
        Thread.sleep(20000);
    	driver.findElement(By.xpath("//span[normalize-space(text())='E-Mail']/../..//input")).sendKeys("vikas+reddy2@loanlink.de");
    	 Thread.sleep(20000);
    	driver.findElement(By.xpath("//span[normalize-space(text())='Passwort']/../..//input")).sendKeys("12345678");
    	driver.findElement(By.xpath("//span[normalize-space(text())='Einloggen']/..")).click();
    	driver.close();
    }
}
