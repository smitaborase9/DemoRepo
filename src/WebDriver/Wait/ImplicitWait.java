package WebDriver.Wait;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ImplicitWait {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\prash\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe ");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.letskodeit.com/practice");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        //implicit wait will apply globaly meanns for all web elements
        //if we get webelement within our timeframe the it will not wait for remaining time left after getting element further lines excecuted

        WebElement element= driver.findElement(By.id("openwindow"));
        System.out.println(element);
        driver.close();
    }
}
