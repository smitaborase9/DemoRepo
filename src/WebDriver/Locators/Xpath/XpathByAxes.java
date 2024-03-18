package WebDriver.Locators.Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByAxes{
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\prash\\Downloads\\geckodriver-v0.34.0-win32\\geckodriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.in/");

    /*   --->>> 1.Following
     Selects all elements in the document of the current node( ) [UserID input box is the current node]
     Xpath=//*[@type='text']//following::input[1]  */
       driver.findElement(By.xpath("//a[text()='Amazon miniTV']//following::a")).click();
        Thread.sleep(2000);

    /* --->>> 2.Ancestor
     The ancestor axis selects all ancestor's element (grandparent, parent, etc.) of the current node.
     Xpath=//tagname[text()='Text']//ancestor::tagname  */
        driver.findElement(By.xpath("//a[text()='Fresh']//ancestor::a"));
        Thread.sleep(2000);

        /* --->>> 3.child
    Selects all children elements of the current node (Java)
    Xpath=//*[@id='java_technologies']//child::li */
        driver.findElement(By.xpath("//div[@id='nav-xshop']//child::a"));
        Thread.sleep(2000);
    /*
    -->> 4.Following-sibling
    Select the following siblings of the context node.
     Siblings are at the same level of the current node.
     It will find the element after the current node.
     xpath=//*[@type='submit']//following-sibling::input
     */
        driver.findElement(By.xpath("//div[@id='nav-belt']//following-sibling::div"));
        Thread.sleep(2000);

        /* -->> 5  Parent
    Selects the parent of the current node.
    Xpath=//*[@id='rt-feature']//parent::div */
        driver.findElement(By.xpath("//div[@id='nav-belt']//parent::div"));
        Thread.sleep(2000);

        /* 6. Descendant
   Selects the descendants of the current node.
   In the below expression, it identifies all the element descendants to current element ( ‘Main body surround’ frame element) which means down under the node (child node , grandchild node, etc.).
   Xpath=//*[@id='rt-feature']//descendant::a   */
        driver.findElement(By.xpath("//div[@id='nav-belt']//descendant::div"));

        driver.close();
    }
}