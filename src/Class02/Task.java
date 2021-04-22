package Class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver d = new ChromeDriver();
        d.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
        d.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
        d.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");
        d.findElement(By.name("ctl00$MainContent$login_button")).click();
        String title = d.getTitle();
        if(title.equalsIgnoreCase("web orders")){
            System.out.println("Title is correct");
        }else{
            System.out.println("Title is wrong");
        }
        d.findElement(By.linkText("Logout")).click();
        Thread.sleep(2000);
        d.quit();




    }
}
