package WebDriver.ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class ClickAndHoldMethod {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\prash\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe ");
        WebDriver driver = new ChromeDriver();
        driver.get("https://selenium08.blogspot.com/2020/01/click-and-hold.html");

        WebElement elementC = driver.findElement(By.xpath("//li[text()='C']"));

        Actions actions=new Actions(driver);
        actions.clickAndHold(elementC)
                .pause(Duration.ofSeconds(5))
                .release(elementC)
                .pause(Duration.ofSeconds(5))
                .perform();

        Thread.sleep(2000);
        driver.close();
    }
}
