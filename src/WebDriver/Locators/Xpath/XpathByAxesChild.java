package WebDriver.Locators.Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByAxesChild {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\prash\\Downloads\\geckodriver-v0.34.0-win32\\geckodriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.in/");

         /* --->>> 3.child
    Selects all children elements of the current node (Java)
    Xpath=//*[@id='java_technologies']//child::li */
        driver.findElement(By.xpath("//div[@id='nav-xshop']//child::a"));
        Thread.sleep(2000);
        driver.close();
    }
}
