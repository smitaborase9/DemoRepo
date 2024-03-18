package WebDriver.Locators.Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByContains {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\prash\\Downloads\\geckodriver-v0.34.0-win32\\geckodriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");

        driver.findElement(By.xpath("//input[contains(@id,'in1')]")).sendKeys("sbb");
        driver.close();
    }
}
/*
Contains() is a method used in XPath expression.
It is used when the value of any attribute changes dynamically.
The contain feature has an ability to find the element with partial text as shown in below XPath example.
//input[contains(@name ,'email’)] //a[contains(text(), 'Forgotten password?')]
*/
