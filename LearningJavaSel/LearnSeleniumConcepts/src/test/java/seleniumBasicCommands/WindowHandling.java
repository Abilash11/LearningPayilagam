package seleniumBasicCommands;

import cucumber.api.cli.Main;
import io.github.bonigarcia.wdm.WebDriverManager;

import java.awt.Window;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://letcode.in/window");
		driver.manage().window().maximize();

		WebElement ParentTabEle = driver.findElement(By.xpath("//*[@id=\'multi\']"));
		String Parentwin = driver.getWindowHandle();
		ParentTabEle.click();
		Set<String> WinHandles = driver.getWindowHandles();

		/*for (String winHandle : WindHandles) {
			if (!winHandle.equals(Parentwin)) {
				driver.switchTo().window(winHandle);
				String childTitle = driver.getTitle();
				System.out.println(childTitle);
		
			}*/
		
//		driver.switchTo().window("Alert | LetCode with Koushik");
		
		for (String Winhandle : WinHandles) 
		{
			
			driver.switchTo().window(Winhandle);
			if(driver.getTitle().equals("Alert | LetCode with Koushik"))
			{
				
				System.out.println("found the correct tab");
				break;
			}
			
			
		}
//		driver.switchTo().newWindow(WindowType.TAB);
		
		List<String> Windowlist = new ArrayList<String>(WinHandles);
		
				
		driver.switchTo().window(Windowlist.get(0));
		
		
	

		}
	

	}


