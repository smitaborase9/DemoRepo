package WebDriver.WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabledMethod {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\prash\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe ");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.letskodeit.com/practice");

        WebElement textBoxElement = driver.findElement(By.id("enabled-example-input"));
        WebElement disabledButton = driver.findElement(By.id("disabled-button"));
        WebElement enabledButton = driver.findElement(By.id("enabled-button"));

        System.out.println(textBoxElement.isEnabled()); //true
        disabledButton.click();
        Thread.sleep(1000);
        System.out.println(textBoxElement.isEnabled()); //false
        enabledButton.click();
        Thread.sleep(1000);
        System.out.println(textBoxElement.isEnabled());//true
        Thread.sleep(5000);
        driver.close();
    }
}
