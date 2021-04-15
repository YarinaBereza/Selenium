package Class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MaximazeWindow {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("http://facebook.com");
        driver.manage().window().maximize();
        //driver.manage().window().fullscreen(); //you will not see any tabs, urls and other tools
        driver.navigate().back();
    }
}
