package WebDriver.Locators.Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class XpathByStartsWith {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\prash\\Downloads\\geckodriver-v0.34.0-win32\\geckodriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.in/");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[starts-with(text(),'Customer')]"));
        driver.close();
    }
}
/*
XPath starts-with() is a function used for finding the web element whose attribute value gets changed on refresh or by
 other dynamic operations on the webpage.
In this method, the starting text of the attribute is matched to find the element whose attribute value changes dynamically.
You can also find elements whose attribute value is static (not changes).
Xpath=//input[starts-with(@id,'email')]
//a[starts-with(text(),'Amazon')])[1]"


 */