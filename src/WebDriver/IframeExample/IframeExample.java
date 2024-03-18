package WebDriver.IframeExample;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;

public class IframeExample {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\prash\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe ");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/frames");
        driver.manage().window().maximize();

       List<WebElement> elements = driver.findElements(By.tagName("iframe"));
        System.out.println(elements.size());

       // driver.switchTo().frame("frame1");
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='frame1']")));

        //WebElement textElement = driver.findElement(By.xpath("//h1[@id='sampleHeading']"));
        WebElement textElement = driver.findElement(By.id("sampleHeading"));
        System.out.println(textElement.getText());

        driver.switchTo().parentFrame();
        WebElement element = driver.findElement(By.xpath("//h1[text()='Frames']"));
        System.out.println(element.getText());
      Thread.sleep(3000);
        driver.close();
    }
}
