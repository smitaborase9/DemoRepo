package WebDriver.ScrollBy;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollDownByWebElement {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\prash\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe ");
        WebDriver driver = new ChromeDriver();
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        WebElement element = driver.findElement(By.xpath("//a[text()='Disclaimer']"));

        JavascriptExecutor javascriptExecutor= (JavascriptExecutor) driver;

        javascriptExecutor.executeScript("arguments[0].scrollIntoView()",element);//scrll up to element
        Thread.sleep(2000);



        driver.close();
    }
}
