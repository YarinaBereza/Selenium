package Class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver d = new ChromeDriver();
        d.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
        WebElement usernameTextBox = d.findElement(By.xpath("//input[contains(@id,'username')]"));
        usernameTextBox.sendKeys("Tester");
        Thread.sleep(2000);
        WebElement passwordTextBox = d.findElement(By.xpath("//input[@type = 'password']"));
        passwordTextBox.sendKeys("test");
        WebElement loginButton = d.findElement(By.xpath("//input[@type = 'submit']"));
        loginButton.click();
        String title = d.getTitle();
        if(title.equalsIgnoreCase("web orders")){
            System.out.println("Title is correct");
        }else{
            System.out.println("Title is wrong");
        }

        WebElement logoutButton = d.findElement(By.linkText("Logout"));
        logoutButton.click();
        Thread.sleep(2000);
        d.quit();
    }
}


