package Class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebOrders {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver d = new ChromeDriver();
        d.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");

        WebElement username = d.findElement(By.id("ctl00_MainContent_username"));
        username.sendKeys("Tester");
        //this way gives us reusability
       WebElement password = d.findElement(By.id("ctl00_MainContent_password"));
       password.sendKeys("test");

       WebElement loginButton = d.findElement(By.name("ctl00$MainContent$login_button"));
       loginButton.click();

       password.sendKeys("yarina123");
    }
}
