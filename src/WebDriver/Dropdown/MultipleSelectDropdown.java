package WebDriver.Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleSelectDropdown {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\prash\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe ");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.letskodeit.com/practice");
        WebElement dropdown = driver.findElement(By.id("multiple-select-example"));
        Select select= new Select(dropdown);
        select.selectByValue("peach");
        Thread.sleep(2000);
        select.selectByIndex(1);
        Thread.sleep(2000);
        select.selectByVisibleText("Apple");
        Thread.sleep(2000);

        select.deselectByValue("peach");
        Thread.sleep(2000);
        select.deselectByIndex(1);
        Thread.sleep(2000);
        select.deselectByVisibleText("Apple");
        Thread.sleep(2000);
//if we want deselect all at on time then deselectall method we can used
        driver.close();
    }
}
