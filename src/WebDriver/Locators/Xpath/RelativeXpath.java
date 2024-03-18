package WebDriver.Locators.Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeXpath {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\prash\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe ");
        WebDriver driver = new ChromeDriver();
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
      //  Basic xpath
//syntax = //tagname[@attribute name='attribute value']
        WebElement element = driver.findElement(By.xpath("//input[@type='password']"));
        element.sendKeys("smita");
        Thread.sleep(4000);
        driver.close();
    }
}
/*
Relative Xpath starts from the middle of HTML DOM structure.
It starts with double forward slash (//).
It can search elements anywhere on the webpage, means no need to write a long xpath and you can start from the middle of HTML DOM structure.
Relative Xpath is always preferred as it is not a complete path from the root element.

 */