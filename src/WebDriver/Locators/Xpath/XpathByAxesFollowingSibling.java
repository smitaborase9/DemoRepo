package WebDriver.Locators.Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByAxesFollowingSibling {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\prash\\Downloads\\geckodriver-v0.34.0-win32\\geckodriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.in/");

       /* -->> 4.Following-sibling
        Select the following siblings of the context node.
        Siblings are at the same level of the current node.
        It will find the element after the current node.
                xpath=//*[@type='submit']//following-sibling::input
     */
        driver.findElement(By.xpath("//div[@id='nav-belt']//following-sibling::div"));
        Thread.sleep(2000);
        driver.close();

        //Exception NoSuchElementException

    }
}
