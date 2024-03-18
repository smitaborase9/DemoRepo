package WebDriver.WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayedMethod {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\prash\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe ");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.letskodeit.com/practice");

        WebElement textBoxElement = driver.findElement(By.id("displayed-text"));
        WebElement hideButton = driver.findElement(By.id("hide-textbox"));
        WebElement showButton = driver.findElement(By.id("show-textbox"));

        System.out.println(textBoxElement.isDisplayed());
        hideButton.click();
        System.out.println(textBoxElement.isDisplayed());
        showButton.click();
        System.out.println(textBoxElement.isDisplayed());
    }
}
