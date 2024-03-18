package WebDriver.Cookies;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class DeleteCookies {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\prash\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe ");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.tcs.com/");
      Cookie cookie=new Cookie ("name", "Edso Services");
      driver.manage().addCookie(cookie);
        System.out.println("before delete cookie");
        Set<Cookie> allCookies = driver.manage().getCookies();
        for (Cookie c: allCookies){
            System.out.println(c);
        }
      driver.manage().deleteCookieNamed("name");

        System.out.println("after delete cookie");
        Set<Cookie> allCookies2 = driver.manage().getCookies();
        for (Cookie c: allCookies){
            System.out.println(c);
        }
        driver.close();
    }
}
