package WebDriver.Alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DismissAlert {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\prash\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe ");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.letskodeit.com/practice");

        driver.findElement(By.id("confirmbtn")).click();
        Thread.sleep(3000);
        Alert alert=driver.switchTo().alert();
        Thread.sleep(3000);
        alert.dismiss();

        driver.close();
    }
}
