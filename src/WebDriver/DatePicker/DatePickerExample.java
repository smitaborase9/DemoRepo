package WebDriver.DatePicker;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.Set;

       public class DatePickerExample {
        public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\prash\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe ");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.abhibus.com/");
        driver.manage().window().maximize();
      //  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        WebDriverWait webDriverWait=new WebDriverWait(driver,Duration.ofSeconds(3));
        Thread.sleep(3000);
        WebElement fromStation = driver.findElement(By.xpath("//input[@placeholder='From Station']"));
        fromStation.click();
        fromStation.sendKeys("Pune");
        List<WebElement> allCities = driver.findElements(By.xpath("//div[@id='search-from']//following::div[@class=' col']"));
       for(WebElement element:allCities){
           if(element.getText().contentEquals("Pune")){
               webDriverWait.until(ExpectedConditions.elementToBeClickable(element)).click();
               break; }
       }
        Thread.sleep(3000);
        WebElement toStation = driver.findElement(By.xpath("//input[@placeholder='To Station']"));
         toStation.sendKeys("Mumbai");
        toStation.click();
        List<WebElement> allDestinationCities = driver.findElements(By.xpath("//div[@id='search-to']//following::div[@class=' col']"));
        for(WebElement element:allDestinationCities){
            if(element.getText().contentEquals("Mumbai")){
                webDriverWait.until(ExpectedConditions.elementToBeClickable(element)).click();
                break;
            }
        }
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@placeholder='Onward Journey Date']")).click();
        List<WebElement> allDates = driver.findElements(By.xpath("//div[@id='jaurney-date']//following::div[@class='container date ']//span"));
        for(WebElement element:allDates){
            if(element.getText().contentEquals("28")){
                element.click();
                break;  }
        }
        driver.findElement(By.xpath("//button[text()='Search']")).click();
        Thread.sleep(3000);
        driver.close();
    }
}
