package WebDriver.Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class BootstrapDropdown {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\prash\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe ");
        WebDriver driver = new ChromeDriver();
        driver.get("https://seleniumpractise.blogspot.com/2016/08/bootstrap-dropdown-example-for-selenium.html");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        driver.findElement(By.xpath("//button[@id='menu1']"));
        Thread.sleep(2000);

        List<WebElement> webElements = driver.findElements(By.xpath("//ul[@class='dropdown-menu']//child::li/a"));

        for(WebElement e : webElements){
            if(e.getText().trim().equalsIgnoreCase("JavaScript")){
                e.click();
                break;
            }
        }
        Thread.sleep(3000);
        driver.close();
    }
}
