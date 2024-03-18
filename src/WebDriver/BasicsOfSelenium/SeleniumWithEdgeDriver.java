package WebDriver.BasicsOfSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SeleniumWithEdgeDriver {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.edge.driver", "C:\\Users\\prash\\Downloads\\edgedriver_win32\\msedgedriver.exe ");

        WebDriver driver=new EdgeDriver();
        driver.get("https://www.amazon.in/");
        Thread.sleep(4000);
    }
}
