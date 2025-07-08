package seleniumBasicCommands;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/alert");
		WebElement simpleAlert = driver.findElement(By.xpath("//*[contains(text(),'Simple Alert')]"));
		simpleAlert.click();

		Alert alert = driver.switchTo().alert();
        alert.accept();
        driver.close();
	}

}
