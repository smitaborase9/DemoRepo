package WebDriver.WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelectedMethod {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\prash\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe ");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.letskodeit.com/practice");

        WebElement radiobtn = driver.findElement(By.id("bmwradio"));


        System.out.println(radiobtn.isSelected()); //false
        radiobtn.click();
        Thread.sleep(2000);
        System.out.println(radiobtn.isSelected()); //true
        Thread.sleep(2000);
     //   driver.close();
    }
}
