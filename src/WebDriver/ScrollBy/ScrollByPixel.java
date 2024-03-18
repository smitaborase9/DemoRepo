package WebDriver.ScrollBy;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollByPixel {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\prash\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe ");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.letskodeit.com/practice");

        JavascriptExecutor javascriptExecutor= (JavascriptExecutor) driver;

        javascriptExecutor.executeScript("window.scrollBy(0,500)");//scroll up
        Thread.sleep(2000);

        javascriptExecutor.executeScript("window.scrollBy(0,-700)");//scroll down
        Thread.sleep(2000);

        driver.close();
    }
}
