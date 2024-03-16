import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.org.property.Propertyfile;

public class Internet extends Propertyfile {

	static WebElement web;
	
	public static void main(String[] args) {
		
		getdriver();
		url();
		maxi();
		
		web=driver.findElement(By.linkText("A/B Testing"));
		web.click();
		String windowHandle = driver.getWindowHandle();
		System.out.println(windowHandle);
		
		web=driver.findElement(By.linkText("Elemental Selenium"));
        web.click();
        Set<String> windowHandles = driver.getWindowHandles();
        System.out.println(windowHandles);
        for(String base: windowHandles) {
        	
        	if(!base.equals(windowHandle)) {
        		
        		driver.switchTo().window(base);
        		String title = driver.getTitle();
        		System.out.println(title);
        		
        		web=driver.findElement(By.xpath("//input[@id='email']"));
        		web.sendKeys("sabha@gmail.com");
        		
        		WebElement findElement2 = driver.findElement(By.name("fields[programming_language]"));
        		
        		Select s= new Select(findElement2);
        		s.selectByIndex(3);
        		
        		web=driver.findElement(By.linkText("Challenging DOM"));
                web.click();
                
                
        	}
        }
        
        
        
	}

}
