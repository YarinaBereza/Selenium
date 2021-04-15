package Class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");

        WebDriver driver = new ChromeDriver(); //launch the browser
        driver.get("https://www.google.com/"); //navigate to the specified url
        String url = driver.getCurrentUrl(); //return current url
        System.out.println(url);

        String title = driver.getTitle(); //getting the title of the page
        System.out.println(title);

        driver.quit(); //close the page

    }
}
