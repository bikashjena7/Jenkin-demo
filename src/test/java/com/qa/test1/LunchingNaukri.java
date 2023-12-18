package com.qa.test1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class LunchingNaukri {
	
	WebDriver driver;
@BeforeMethod
public void setup(){
	System.out.println(System.getProperty("user.dir")+"/drivers/chromedriver.exe");
	System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/drivers/chromedriver.exe");
	 driver =new ChromeDriver();
	driver.manage().deleteAllCookies();


}
@Test
public void lunch_browser() {
	driver.manage().window().maximize();
	driver.get("https://www.naukri.com/nlogin/login");
}
@AfterMethod
public void tearDown() {
	driver.close();
}


}
