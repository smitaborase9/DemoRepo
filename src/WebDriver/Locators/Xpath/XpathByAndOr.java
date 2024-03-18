package WebDriver.Locators.Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByAndOr {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\prash\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe ");
        WebDriver driver = new ChromeDriver();
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        //   xpath by using And & OR
//syntax = //Tagname[@Attribute name='Attribute Value' and @Attribute name='Attribute Value’] --> both conditions true
//        //Tagname[@Attribute name='Attribute Value' or @Attribute name='Attribute Value’]--> any one condition true
        WebElement element = driver.findElement(By.xpath("//input[@id=\"login1\" or @name=\"login1\" ]"));
        WebElement element1 = driver.findElement(By.xpath("//input[@type='password' and @id='password']"));
        element.sendKeys("smita");
        element1.sendKeys("12345");
        Thread.sleep(4000);
        driver.close();
    }
}
