package WebDriver.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorLocatorByIdAttribute {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\prash\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe ");
        WebDriver driver=new ChromeDriver();
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        WebElement element = driver.findElement(By.cssSelector("input[id='login1']"));
        //we can convert id attribute in css selector with #
       // WebElement element = driver.findElement(By.cssSelector("input#login1"));
        element.sendKeys("smita@123");
        Thread.sleep(3000);
        driver.close();

    }
}
