package com.org.property;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Propertyfile {

public static 	WebDriver driver;

	public static void  getdriver(){
		
		System.setProperty("webdriver.chrome.driver","C:/Users/91807/Desktop/driver/chromedriver-win64/chromedriver-win64/chromedriver.exe");
		ChromeOptions c = new ChromeOptions();
		
		c.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(c);
		
		driver.manage().window().maximize();
	}
	
	
public static void url() {
	
	driver.get("https://the-internet.herokuapp.com/");
}

public static void maxi() {
	
	driver.manage().window().maximize();
}
}
