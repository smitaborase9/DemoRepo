package WebDriver.Locators.Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByTextFunction {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\prash\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe ");
        WebDriver driver = new ChromeDriver();
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
      //   xpath by text ()
//syntax = //tagname[text()='complete text']
        WebElement element = driver.findElement(By.xpath("//u[text()='Create a new account']"));
        element.click();
        Thread.sleep(4000);
        driver.close();
    }
}
/*
The XPath text() function is a built-in function of selenium webdriver which is used to locate elements based on text of a web element.
It helps to find the exact text elements and it locates the elements within the set of text nodes. The elements to be located should be in string form.
Xpath=//td[text()='UserID’]


 */