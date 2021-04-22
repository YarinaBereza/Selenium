package Class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearCommandDemo {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver d = new ChromeDriver();
        d.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
        WebElement usernameTextBox = d.findElement(By.xpath("//input[@id = 'ctl00_MainContent_username']"));
        usernameTextBox.sendKeys("Tester");
        WebElement passwordTextBox = d.findElement(By.xpath("//input[@id = 'ctl00_MainContent_password']"));
        passwordTextBox.sendKeys("test");
Thread.sleep(2000);
        usernameTextBox.clear();
        passwordTextBox.clear();

    }
}
