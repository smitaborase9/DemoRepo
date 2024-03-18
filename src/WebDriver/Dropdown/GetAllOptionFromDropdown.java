package WebDriver.Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class GetAllOptionFromDropdown {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\prash\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe ");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.letskodeit.com/practice");
        WebElement dropdown = driver.findElement(By.id("carselect"));

        Select select= new Select(dropdown);
        List<WebElement> allOptions = select.getOptions();
        for (WebElement element : allOptions){
            System.out.println(element.getText());
        }
        driver.close();
    }
}
