package WebDriver.ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import java.time.Duration;

public class ContextClickMethod {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\prash\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe ");
        WebDriver driver = new ChromeDriver();
        driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");

        WebElement rightClick= driver.findElement(By.xpath("//span[text()='right click me']"));

        Actions actions=new Actions(driver);
        actions.contextClick(rightClick)
                        .pause(Duration.ofSeconds(4))
                        .perform();

        Thread.sleep(2000);
        driver.close();
    }
}
