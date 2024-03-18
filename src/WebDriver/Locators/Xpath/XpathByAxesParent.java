package WebDriver.Locators.Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByAxesParent {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\prash\\Downloads\\geckodriver-v0.34.0-win32\\geckodriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.in/");

     /* -->> 5  Parent
    Selects the parent of the current node.
    Xpath=//*[@id='rt-feature']//parent::div */

        driver.findElement(By.xpath("//div[@id='nav-belt']//parent::div"));
        Thread.sleep(2000);
        driver.close();
    }
}
