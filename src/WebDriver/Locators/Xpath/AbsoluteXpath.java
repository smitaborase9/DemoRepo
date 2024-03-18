package WebDriver.Locators.Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbsoluteXpath {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\prash\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe ");
        WebDriver driver=new ChromeDriver();
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");

        WebElement element = driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/div[2]/form/div[1]/div[2]/div[1]/div[2]/input"));
        element.sendKeys("smita");
        Thread.sleep(4000);
        driver.close();
    }
}

 /*
        It is the direct way to find the element
The key characteristic of XPath is that it begins with the single forward slash(/) which means you can select the element
from the root node.But the disadvantage of the absolute XPath is that if there are any changes made in the path of the
element then that XPath gets failed.  */
