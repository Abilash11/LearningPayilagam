package seleniumBasicCommands;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Iframes {
	public static void main (String[] args)

	{
		WebDriverManager.chromedriver().setup();
	    WebDriver driver = new ChromeDriver();
        driver.get("https://letcode.in/frame");
        
         WebElement FirstName = driver.findElement(By.xpath("https://letcode.in/frame"));
//         WebElement FirstName = driver.findElement(By.xpath("https://letcode.in/frame"));
         
         driver.switchTo().frame("firstFr");
         FirstName.sendKeys("Winner");
         

       
        
		
	}
}
