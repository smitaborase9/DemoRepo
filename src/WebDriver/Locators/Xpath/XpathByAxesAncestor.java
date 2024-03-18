package WebDriver.Locators.Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByAxesAncestor {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\prash\\Downloads\\geckodriver-v0.34.0-win32\\geckodriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.in/");

        /* --->>> 2.Ancestor
     The ancestor axis selects all ancestor's element (grandparent, parent, etc.) of the current node.
     Xpath=//tagname[text()='Text']//ancestor::tagname  */
        driver.findElement(By.xpath("//a[text()='Fresh']//ancestor::a"));
        Thread.sleep(2000);
//Exception NoSuchElementException
    }
}
