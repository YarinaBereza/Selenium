package Class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver w = new ChromeDriver();
        w.get("https:www.amazon.com");

       String title =  w.getTitle();
        System.out.println(title);

        String url = w.getCurrentUrl();
        System.out.println(url);

        w.quit();
    }
}
