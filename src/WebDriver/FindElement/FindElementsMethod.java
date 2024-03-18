package WebDriver.FindElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FindElementsMethod {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\prash\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe ");
        WebDriver driver=new ChromeDriver();
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");


   //return type of findElements() method is  List<WebElement>
//if element is not found then it will not throw any exception it will return 0 or empty list
        List<WebElement> allElements = driver.findElements(By.tagName("a"));
        System.out.println( allElements.size());
        Thread.sleep(3000);
        driver.close();

    }
}
