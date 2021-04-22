package Class02;

//navigate to fb.com
//        click on create new account
//        fill up all the textboxes
//        click on sign up button
//        close the pop up
//        close the browser

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW2 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver d = new ChromeDriver();
        d.manage().window().maximize();
        d.get("https://www.facebook.com/");
        d.findElement(By.linkText("Create New Account")).click();
        Thread.sleep(2000);
        d.findElement(By.name("firstname")).sendKeys("Yarina");
        d.findElement(By.name("lastname")).sendKeys("Bereza");
        d.findElement(By.name("reg_email__")).sendKeys("673868253");
        d.findElement(By.name("reg_passwd__")).sendKeys("yarina123");
        Thread.sleep(2000);
        d.findElement(By.cssSelector("img._8idr.img")).click();
        Thread.sleep(2000);
        d.quit();



    }
}
