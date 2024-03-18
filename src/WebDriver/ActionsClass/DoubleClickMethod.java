package WebDriver.ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class DoubleClickMethod {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\prash\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe ");
        WebDriver driver = new ChromeDriver();
        driver.get("https://selenium08.blogspot.com/2019/11/double-click.html");

        WebElement doubleClick= driver.findElement(By.xpath("//button[text()='Double-Click me to see Alert message']"));

        Actions actions=new Actions(driver);
        actions.doubleClick(doubleClick)
                        .pause(Duration.ofSeconds(4))
                        .perform();

        Thread.sleep(2000);
        driver.close();
    }
}
