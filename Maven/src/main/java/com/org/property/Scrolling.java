package com.org.property;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Scrolling {

	public static WebDriver driver;
	public static WebElement push;
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:/Users/91807/Desktop/driver/chromedriver-win64/chromedriver-win64/chromedriver.exe");
		ChromeOptions c = new ChromeOptions();
		
		c.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(c);
		
		driver.get("https://www.ironspider.ca/forms/buttons.htm");
		driver.manage().window().maximize();
		Thread.sleep(8000);
		
		
		push=driver.findElement(By.xpath("//a[contains(text(),'TOP')]"));
		push.sendKeys(Keys.DOWN);
		
		Thread.sleep(8000);
	    push = driver.findElement(By.xpath("//h1[contains(text(),'Push Buttons')]"));
		push.sendKeys(Keys.UP);
		
		
		
		
		
		
		
		
		
		
		
	
	
		
		
		
		
		
		
		

	}

}
