package WebDriver.MultipleWindowHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class GetWindowHandle {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\prash\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe ");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.letskodeit.com/practice");

        WebElement openWindowId = driver.findElement(By.id("openwindow"));
        openWindowId.click();

        String windowId = driver.getWindowHandle();//it will return parent window id
        System.out.println(windowId);
        Set<String> allWindow = driver.getWindowHandles();//it will return parent window id and child window id
        System.out.println(allWindow);

        Thread.sleep(3000);
        //driver.close();
        driver.quit();
    }
}
