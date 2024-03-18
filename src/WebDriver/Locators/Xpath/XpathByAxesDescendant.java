package WebDriver.Locators.Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByAxesDescendant {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\prash\\Downloads\\geckodriver-v0.34.0-win32\\geckodriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.in/");

       /* 6. Descendant
   Selects the descendants of the current node.
   In the below expression, it identifies all the element descendants to current element ( ‘Main body surround’ frame element) which means down under the node (child node , grandchild node, etc.).
   Xpath=//*[@id='rt-feature']//descendant::a   */

        driver.findElement(By.xpath("//div[@id='nav-belt']//descendant::div"));
        Thread.sleep(2000);
        driver.close();
    }
}
