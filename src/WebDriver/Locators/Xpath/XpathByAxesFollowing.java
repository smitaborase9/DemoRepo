package WebDriver.Locators.Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByAxesFollowing {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\prash\\Downloads\\geckodriver-v0.34.0-win32\\geckodriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.in/");

    /*   --->>> 1.Following
     Selects all elements in the document of the current node( ) [UserID input box is the current node]
     Xpath=//*[@type='text']//following::input[1]  */
        driver.findElement(By.xpath("//a[text()='Amazon miniTV']//following::a")).click();
        Thread.sleep(2000);
        driver.close();
    }
}
