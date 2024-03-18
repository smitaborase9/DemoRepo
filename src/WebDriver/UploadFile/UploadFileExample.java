package WebDriver.UploadFile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadFileExample {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\prash\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe ");
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/upload");

        WebElement uploadFile = driver.findElement(By.id("file-upload"));
        uploadFile.sendKeys("C:\\Users\\prash\\OneDrive\\Desktop\\company.properties");
        driver.findElement(By.id("file-submit")).click();
        WebElement fileUploaded = driver.findElement(By.xpath("//h3[text()= 'File Uploaded!']"));
        if(fileUploaded.getText().equalsIgnoreCase("File Uploaded!")){
            System.out.println("Yes File Uploaded Successfully");
        }else {
            System.out.println("File is not Uploaded ");
        }
        driver.close();
    }
}
