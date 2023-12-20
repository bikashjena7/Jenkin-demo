package com.qa.test1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class NaukriUpdate {

	WebDriver driver;
@BeforeMethod
public void setup() throws Throwable{
	System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/drivers/chromedriver.exe");
	 driver =new ChromeDriver();
	 driver.manage().deleteAllCookies();


}
@Test
public void lunch_browser() throws Throwable{
	driver.manage().window().maximize();
	driver.get("https://www.naukri.com/nlogin/login");
	driver.findElement(By.id("usernameField")).sendKeys("bikash.jena.qa@gmail.com");
	driver.findElement(By.id("passwordField")).sendKeys("aB@7008692723");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[text()='Login']")).click();
	Thread.sleep(2000);
	JavascriptExecutor js = ((JavascriptExecutor)driver);
	
	WebElement complete_btn =driver.findElement(By.xpath("//a[contains(text(),'Complete')]"));
	js.executeScript("arguments[0].click();", complete_btn);
	Thread.sleep(8000);
	driver.findElement(By.xpath("//i[text()='deleteOneTheme']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("(//button[text()='Delete'])[2]")).click();
	Thread.sleep(3000);
	WebElement fileinput = driver.findElement(By.xpath("//input[@id='attachCV']"));
	fileinput.sendKeys("C:\\Users\\HP\\Downloads\\My Resume\\Bikash's Resume.pdf");
	Thread.sleep(3000);
	driver.findElement(By.xpath("(//span[text()='editOneTheme'])[1]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//textarea[@id='resumeHeadlineTxt']")).clear();
	driver.findElement(By.xpath("//textarea[@id='resumeHeadlineTxt']")).sendKeys("Having "
			+ "2+ years experience as a QA tester. Knowledge and experience in automated "
			+ "testing tools, Selenium, OOPS concept, Java and Python");
	driver.findElement(By.xpath("//button[text()='Save']")).click();
	Thread.sleep(3000);

}
@AfterMethod
public void tearDown() {
	driver.close();
}


}
