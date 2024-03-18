package WebDriver.BasicsOfSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class SeleniumWithFirefox {
    public static void main(String[] args)  {
        FirefoxOptions firefoxOptions=new FirefoxOptions();
        firefoxOptions.setBinary("C:\\Users\\prash\\AppData\\Local\\Mozilla Firefox\\firefox.exe");

        System.setProperty("webdriver.gecko.driver", "C:\\Users\\prash\\Downloads\\geckodriver-v0.34.0-win32\\geckodriver.exe");
        WebDriver driver=new FirefoxDriver(firefoxOptions);
        driver.get("https://www.amazon.in/");

        // Thread.sleep(4000);


    }
}
