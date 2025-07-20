/*
 * package seleniumBasicCommands;
 * 
 * import io.github.bonigarcia.wdm.WebDriverManager;
 * 
 * import java.time.Duration;
 * 
 * import org.openqa.selenium.Alert; import org.openqa.selenium.By; import
 * org.openqa.selenium.WebDriver; import org.openqa.selenium.WebElement; import
 * org.openqa.selenium.chrome.ChromeDriver; import
 * org.openqa.selenium.firefox.FirefoxDriver; import
 * org.openqa.selenium.support.ui.ExpectedConditions; import
 * org.openqa.selenium.support.ui.WebDriverWait;
 * 
 * import io.github.bonigarcia.wdm.WebDriverManager;
 * 
 * public class AlertPractice {
 * 
 * public static void main(String[] args) throws InterruptedException { // TODO
 * Auto-generated method stub
 * 
 * // WebDriverManager.chromedriver().setup(); // WebDriver driver = new
 * ChromeDriver();
 * 
 * WebDriverManager.firefoxdriver().setup(); WebDriver driver = new
 * FirefoxDriver();
 * 
 * driver.get("https://letcode.in/alert"); driver.manage().window().maximize();
 * WebElement simpleAlert =
 * driver.findElement(By.xpath("//*[contains(text(),'Simple Alert')]"));
 * simpleAlert.click(); Alert alert = driver.switchTo().alert(); alert.accept();
 * 
 * WebElement ConfirmAlert = driver.findElement(By.
 * xpath("//label[contains(text(),'Dismiss the Alert & print the alert text')]//following::button"
 * )); ConfirmAlert.click(); Alert CNFalert = driver.switchTo().alert(); String
 * Alertinfo = CNFalert.getText(); System.out.println(Alertinfo);
 * CNFalert.dismiss();
 * 
 * // prompt alert WebElement promptEle = driver.findElement(By.id("prompt"));
 * // button[@id='prompt'] promptEle.click(); Alert Promptalert =
 * driver.switchTo().alert(); WebDriverWait wait = new WebDriverWait(driver,
 * Duration.ofSeconds(10)); wait.until(ExpectedConditions.alertIsPresent());
 * Promptalert.sendKeys("Professor"); Thread.sleep(3000); Promptalert.accept();
 * 
 * driver.close();
 * 
 * }
 * 
 * }
 */
package seleniumBasicCommands;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertPractice {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();

        driver.get("https://letcode.in/alert");
        driver.manage().window().maximize();

        // Simple Alert
        WebElement simpleAlert = driver.findElement(By.xpath("//*[contains(text(),'Simple Alert')]"));
        simpleAlert.click();
        driver.switchTo().alert().accept();

        // Confirm Alert
        WebElement confirmAlert = driver.findElement(By.xpath("//label[contains(text(),'Dismiss the Alert & print the alert text')]//following::button"));
        confirmAlert.click();
        Alert cnfAlert = driver.switchTo().alert();
        System.out.println("Confirm Alert Text: " + cnfAlert.getText());
        cnfAlert.dismiss();

        // Prompt Alert
        WebElement promptEle = driver.findElement(By.id("prompt"));
        promptEle.click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.alertIsPresent());

        Alert promptAlert = driver.switchTo().alert();
        promptAlert.sendKeys("Professor");
        Thread.sleep(2000);
        promptAlert.accept();

        driver.quit();
    }
}
