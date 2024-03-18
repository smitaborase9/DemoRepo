package WebDriver.FindElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementExample {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\prash\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe ");
        WebDriver driver=new ChromeDriver();
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        //return type of findelement() method is WebElement
        //if element is not found then it will throw nosuchElementException
         WebElement element = driver.findElement(By.id("login1"));
                element.sendKeys("smita@123");
        Thread.sleep(4000);
        driver.close();
    }
}
