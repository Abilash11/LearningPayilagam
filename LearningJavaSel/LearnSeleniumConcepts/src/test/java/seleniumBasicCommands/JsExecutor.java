package seleniumBasicCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.internal.invokers.AbstractParallelWorker.Arguments;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JsExecutor {
	
	
	public static void main (String[] args)

	{
		WebDriverManager.chromedriver().setup();
	    WebDriver driver = new ChromeDriver();
        driver.get("https://letcode.in/edit");
        
        
        WebElement fullName = driver.findElement(By.xpath("//input[@placeholder='Enter first & last name']"));
        WebElement WatchTutorial = driver.findElement(By.xpath("//footer[@class='card-footer']/child::button"));
        JavascriptExecutor js = (JavascriptExecutor)driver;
       // mistake > js(Executescript.argument[0].value="Ram", fullName);
        js.executeScript("arguments[0].value='Ram';", fullName);
        js.executeScript("arguments[0].click()", WatchTutorial);
//        js.executeScript("arguments[0].value='somu';", fullName);
        
//        driver.close();
        
		
	}

}
