package WebDriver.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdLocator {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\prash\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe ");
        WebDriver driver=new ChromeDriver();
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        //preference wise locators 1.id    2.xpath  3.cssSelector
        //By is abstract class which contain locators method
        //id always gives unique element

        driver.findElement(By.id("login1")).sendKeys("smita@5265");
        Thread.sleep(4000);
    }
}
